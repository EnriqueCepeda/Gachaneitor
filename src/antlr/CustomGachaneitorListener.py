from GachaneitorListener import GachaneitorListener
from GachaneitorParser import GachaneitorParser
from antlr4.error.Errors import FailedPredicateException
import json
import sys

class GachaneitorGeneralException(Exception):

    """
    Excepción base para errores semánticos de la receta que son generales a la receta, no muestran linea ni columna

    Atributos:
        mensaje
    """

    def __init__(self, mensaje):
        self.mensaje = mensaje
        super().__init__(self.mensaje)

    def __str__(self):
        return f'Error: {self.mensaje}.'  
  
class GachaneitorConcreteException(Exception):

    """
    Excepción base para errores semánticos de la receta que son específicos a una linea o sentencia, por lo tanto muestran linea y columna

    Atributos:
        linea
        columna
        mensaje
    """
  
    def __init__(self, linea, columna, mensaje):
        self.linea = linea
        self.columna = columna
        self.mensaje = mensaje
        super().__init__(self.mensaje)

    def __str__(self):
        return f'Error: {self.mensaje}. Linea {self.linea}, columna {self.columna}'  


class IngredientesNoUsadosException(GachaneitorGeneralException):

    """
    Excepción porque se han introducido ingredientes que no se usan, por lo tanto la receta engaña al usuario de la plataforma
    
    Atributos:
        ingr_no_usados - Lista de ingredientes no usados
    """

    def __init__(self, ingr_no_usados):
        mensaje = f"No se han usado los siguientes ingredientes: {ingr_no_usados}"
        super().__init__(mensaje)


class CantidadIngredienteExcedidaException(GachaneitorGeneralException):
    """
    Excepción usada cuando se usa una cantidad superior de un ingrediente a la definida
    

    Atributos:
        ingrediente
    """

    def __init__(self, ingrediente, cantidad_original, cantidad_usada):
        mensaje = f'''La cantidad usada supera a la declarada inicialmente para el ingrediente '{ingrediente}'. 
                        La cantidad original es {cantidad_original} mientras que la usada es {cantidad_usada}'''
        super().__init__(mensaje)

class TiempoRecetaDistintoException(GachaneitorGeneralException):
    """
    Excepción usada cuando el tiempo de la receta no coincide con la suma de los tiempos parciales de los pasos hechos por Gachaneitor

    """

    def __init__(self):
        mensaje = "La suma de tiempos de los pasos no coincide con el tiempo total de la receta"
        super().__init__(mensaje)

class IngredientesDistintaMagnitudException(GachaneitorConcreteException):

    def __init__(self, ingrediente, unidad1, unidad2, linea, columna):
        mensaje = f"""El ingrediente '{ingrediente}', repetido en la lista, está en dos unidades diferentes que no comparten magnitud, es decir, no se pueden sumar {unidad1} y {unidad2}. Revisa estas unidades"""
        super().__init__(linea, columna, mensaje)


class ConversorUnidades:

    UNIDADES_MASA = ["mg", "g", "kg"]
    UNIDADES_VOLUMEN = ["ml", "l"]
    UNIDADES_TIEMPO = ["seg", "min", "h"]

    @classmethod
    def estandarizarCantidad(cls, cantidad_original, cantidad_nueva, unidad_original, unidad_nueva):
        '''
        Estandariza una unidad a su medida más granular.
        i.e, litros a mililitros o kg a miligramos
        '''

        if unidad_original in ConversorUnidades.UNIDADES_MASA:
            if unidad_nueva not in ConversorUnidades.UNIDADES_MASA:
                raise Exception()
            else:
                return cls.__estandarizar(ConversorUnidades.UNIDADES_MASA, cantidad_original, cantidad_nueva, unidad_original, unidad_nueva)
        elif unidad_original in ConversorUnidades.UNIDADES_VOLUMEN:
            if unidad_nueva not in ConversorUnidades.UNIDADES_VOLUMEN:
                raise Exception()
            else:
                return cls.__estandarizar(ConversorUnidades.UNIDADES_VOLUMEN, cantidad_original, cantidad_nueva, unidad_original, unidad_nueva) 
        elif unidad_original == "ud":
            if unidad_nueva != "ud":
                raise Exception()
            else: #ud
                return cantidad_original+cantidad_nueva, "ud"

    @staticmethod
    def __estandarizar(lista_unidades, cantidad_original, cantidad_nueva, unidad_original, unidad_nueva):
        diferencia = lista_unidades.index(unidad_original) - lista_unidades.index(unidad_nueva)
        if diferencia >= 0:
            unidad_menor = unidad_nueva
            factor_conv = 1000 ** diferencia 
            cantidad = cantidad_nueva + cantidad_original*factor_conv
        else:
            unidad_menor = unidad_original
            factor_conv = 1000 ** abs(diferencia)
            cantidad = cantidad_original + cantidad_nueva*factor_conv
        return cantidad, unidad_menor
    

    @staticmethod
    def estandarizarTiempo(numero, unidad_tiempo):
        num_estandarizado = numero
        if unidad_tiempo == "min":
            num_estandarizado = numero*60
        elif unidad_tiempo == "h":
            num_estandarizado = numero*3600
        return num_estandarizado, "seg"


class Receta:
    def __init__(self):
        self.nombre = ""
        self.tiempo = {}
        self.descripcion = ""
        self.ingredientes = {}
        self.ingredientes_usados = {}
        self.pasos = []
        self.suma_tiempos = 0

    def get_dict(self):
        json_dict = {}
        json_dict["nombre"] = self.nombre
        json_dict["tiempo"] = self.tiempo
        json_dict["descripcion"] = self.descripcion
        json_dict["ingredientes"] = self.ingredientes
        json_dict["pasos"] = self.pasos
        return json_dict

    def __str__(self):
        return str(self.get_dict())


class CustomGachaneitorListener(GachaneitorListener):

    def __init__(self):
        self.recetas = []
        self.receta_actual = None
        
    def convertJSONrecetas(self):
        json_recetas = []
        for receta in self.recetas:
            json_recetas.append(receta.get_dict())  
        return json.dumps(json_recetas, ensure_ascii=False)
    
    def writeJSONrecetas(self, ruta):
        json_recetas = self.convertJSONrecetas()
        with open(ruta, "w", encoding='utf-8') as file:
            file.write(json_recetas)

    def exitInicio(self, ctx:GachaneitorParser.InicioContext):
        self.writeJSONrecetas("./salida.json")

    def enterReceta(self, ctx:GachaneitorParser.RecetaContext):
        self.receta_actual = Receta()

    def exitReceta(self, ctx:GachaneitorParser.RecetaContext):
        self.comprobar_tiempos()
        self.comprobar_ingredientes_usados()
        self.recetas.append(self.receta_actual)

    def enterNombre(self, ctx:GachaneitorParser.InicioContext):
        self.receta_actual.nombre = str(ctx.IDENT_NOMBRE())
        
    def enterDescripcion(self, ctx:GachaneitorParser.DescripcionContext):
        self.receta_actual.descripcion = str(ctx.CONTENIDO_DESCRIPCION())[1:-1]

    def enterTiempo_receta(self, ctx:GachaneitorParser.Tiempo_recetaContext):
        self.receta_actual.tiempo["total"] = self.add_tiempo(ctx.tiempo(0))
        self.receta_actual.tiempo["preparacion"] = self.add_tiempo(ctx.tiempo(1))
    
    def enterIngredientes(self, ctx:GachaneitorParser.IngredientesContext):
        lista = ctx.ingrediente_lista()
        
        self.receta_actual.ingredientes = self.add_ingredientes(lista)
        self.receta_actual.ingredientes_usados = {ingrediente : False for ingrediente in self.receta_actual.ingredientes.keys()}

    def enterPasos(self, ctx:GachaneitorParser.PasosContext):
        lista = ctx.paso()
        for paso in lista:
            paso_dict = {}
            if paso.paso_coc():
                verbo_paso = str(paso.paso_coc().VERBO_COC())
                tipo_verbo = "cocinar"
                paso_dict["tiempo"] = self.add_tiempo(paso.paso_coc().tiempo())
                paso_dict["temperatura"] = self.add_temperatura(paso.paso_coc().temperatura())
                paso_dict["ingredientes"] = self.add_ingredientes(paso.paso_coc().ingrediente_lista())
            elif paso.paso_mov():
                verbo_paso = str(paso.paso_mov().VERBO_MOV())
                tipo_verbo = "mover"
                paso_dict["tiempo"] = self.add_tiempo(paso.paso_mov().tiempo())
                paso_dict["velocidad"] = str(paso.paso_mov().velocidad().DIGITO_VELOCIDAD())
                paso_dict["ingredientes"] = self.add_ingredientes(paso.paso_mov().ingrediente_lista())
            elif paso.paso_per():
                verbo_paso = str(paso.paso_per().VERBO_PER())
                tipo_verbo = "persona"
                paso_dict["ingredientes"] = self.add_ingredientes(paso.paso_per().ingrediente_lista())
            else:
                raise Exception("Tipo de paso no perteneciente a la gramática")
            
            self.anotar_ingredientes_usados(paso_dict["ingredientes"])
            self.comprobar_cantidades(paso_dict["ingredientes"])
            
            if paso_dict.get("tiempo"):
                self.receta_actual.suma_tiempos += self.obtener_tiempo_SI(paso_dict["tiempo"])
            paso_dict["verbo"]=verbo_paso
            paso_dict["tipo_verbo"] = tipo_verbo
            self.receta_actual.pasos.append(paso_dict)
    
    def add_tiempo(self, ctx):
        tiempo_dict = {}
        tiempo_dict["cantidad"] = int(str(ctx.NUMERO())) 
        tiempo_dict["unidad"] = str(ctx.UNIDAD_TIEMPO())
        return tiempo_dict
        
    def add_temperatura(self, ctx):
        temperatura_dict = {}
        temperatura_dict["cantidad"] = int(str(ctx.NUMERO())) 
        temperatura_dict["unidad"] = str(ctx.UNIDAD_TEMP())
        return temperatura_dict

    def add_ingredientes(self, ctx):
        ingredientes_dict = {}
        lista = ctx.ingrediente()
        for ingrediente in lista:
            ctx_nombre_ingrediente = ingrediente.IDENT_NOMBRE()
            nombre_ingrediente = str(ctx_nombre_ingrediente)
            cantidad_ingrediente = int(str(ingrediente.cantidad().NUMERO()))
            unidad_ingrediente = str(ingrediente.cantidad().UNIDAD_CANTIDAD())
            linea = ctx_nombre_ingrediente.getSymbol().line
            columna = ctx_nombre_ingrediente.getSymbol().column
            
            if nombre_ingrediente in ingredientes_dict:
                cantidad_ingrediente_original = ingredientes_dict[nombre_ingrediente]["cantidad"] 
                unidad_ingrediente_original = ingredientes_dict[nombre_ingrediente]["unidad"]
                try:
                    cantidad_estandarizada, unidad_estandarizada = ConversorUnidades.estandarizarCantidad(cantidad_ingrediente_original, cantidad_ingrediente, unidad_ingrediente_original, unidad_ingrediente)
                    ingredientes_dict[nombre_ingrediente]["cantidad"] = cantidad_estandarizada
                    ingredientes_dict[nombre_ingrediente]["unidad"] = unidad_estandarizada
                except Exception:
                    raise IngredientesDistintaMagnitudException(nombre_ingrediente, unidad_ingrediente_original, unidad_ingrediente, linea, columna)                
            else:
                ingredientes_dict[nombre_ingrediente] = {}
                ingredientes_dict[nombre_ingrediente]["cantidad"] = cantidad_ingrediente
                ingredientes_dict[nombre_ingrediente]["unidad"] = unidad_ingrediente
        return ingredientes_dict

    def anotar_ingredientes_usados(self, ingredientes_dict):
        for ingrediente in ingredientes_dict.keys():
            self.receta_actual.ingredientes_usados[ingrediente] = True

    def comprobar_ingredientes_usados(self):
        '''
        Comprueba que no se haya declarado ningún ingrediente que finálmente no se haya usado
        '''
        ingr_no_usados = [ingrediente for ingrediente in self.receta_actual.ingredientes_usados.keys()
                 if not self.receta_actual.ingredientes_usados[ingrediente]]
        if len(ingr_no_usados) > 0:
            raise IngredientesNoUsadosException(ingr_no_usados)

    def comprobar_cantidades(self, ingredientes_dict):
        '''
        Comprueba que la cantidad de los ingredientes usada en un paso no supera la total de la receta
        '''
        for ingrediente, valor in ingredientes_dict.items():
            if valor["cantidad"] > self.receta_actual.ingredientes[ingrediente]["cantidad"]:
                raise CantidadIngredienteExcedidaException(ingrediente, self.receta_actual.ingredientes[ingrediente]["cantidad"], valor["cantidad"])

    def comprobar_tiempos(self):
        '''
        Comprueba que la suma de los tiempos parciales de los pasos hechos por la máquina Gachaneitor no supera el total
        '''
        tiempo_total_estandarizado = self.obtener_tiempo_SI(self.receta_actual.tiempo["total"])
        if self.receta_actual.suma_tiempos != tiempo_total_estandarizado:
            raise TiempoRecetaDistintoException()

    def obtener_tiempo_SI(self, tiempo):
        return ConversorUnidades.estandarizarTiempo(tiempo["cantidad"], tiempo["unidad"])[0]


    