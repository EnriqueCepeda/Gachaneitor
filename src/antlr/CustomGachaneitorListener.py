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

class IngredienteRepetidoConUnidadDistintaException(GachaneitorConcreteException):
    """
    Excepción para mostrar al usuario que ha repetido un ingrediente, pero la unidad es distinta a la que había almacenada

    Atributos:
        nombre_ingrediente
        linea
        columna
    """

    def __init__(self, nombre_ingrediente, linea, columna):
        self.nombre_ingrediente = nombre_ingrediente
        mensaje = f'El ingrediente ' + self.nombre_ingrediente +' está repetido en la lista y la unidad anteriormente introducida no concuerda con la nueva.'
        super().__init__(linea, columna, mensaje)

class IngredienteNoUsadosException(GachaneitorGeneralException):
    """
    Excepción porque se han introducido ingredientes que no se usan, por lo tanto la receta engaña al usuario de la plataforma
    
    Atributos:
        ingr_no_usados - Lista de ingredientes no usados
    """

    def __init__(self, ingr_no_usados):
        mensaje = f"No se han usado los siguientes ingredientes: {ingr_no_usados}"
        super().__init__(mensaje)

class CantidadIngredienteExcedidaException(GachaneitorConcreteException):
    """
    Excepción usada cuando se usa una cantidad superior de un ingrediente a la definida

    Atributos:
        ingrediente
    """

    def __init__(self, ingrediente):
        mensaje = f"La cantidad usada supera a la declarada para el siguiente elemento: {ingrediente}"
        super().__init__(mensaje)
   
class ConversorUnidades:

    UNIDADES_MASA = ["kg", "g", "mg"]
    UNIDADES_VOLUMEN = ["l", "ml"]
    UNIDADES_UNIDAD = ["ud"]
    UNIDADES_TIEMPO = ["h", "min", "seg"]

    @classmethod
    def estandarizarCantidad(cls, numero, unidad_cantidad):
        '''
        Estandariza una unidad a su medida más granular.
        i.e, litros a mililitros o kg a miligramos

        '''
        if unidad_cantidad in ConversorUnidades.UNIDADES_TIEMPO:
            return cls.__estandarizarTiempo(numero, unidad_cantidad)
        elif unidad_cantidad in ConversorUnidades.UNIDADES_MASA:
            return cls.__estandarizarMasa(numero, unidad_cantidad)
        elif unidad_cantidad in ConversorUnidades.UNIDADES_VOLUMEN:
            return cls.__estandarizarVolumen(numero, unidad_cantidad)
        else: #ud
            return numero, "ud"

    @staticmethod
    def __estandarizarTiempo(numero, unidad_tiempo):
        num_estandarizado = numero
        if unidad_tiempo == "min":
            num_estandarizado = numero*60
        elif unidad_tiempo == "h":
            num_estandarizado = numero*3600
        return num_estandarizado, "seg"
    
    @staticmethod
    def __estandarizarMasa(numero, unidad_masa):
        num_estandarizado = numero
        if unidad_masa == "g":
            num_estandarizado = numero*1000
        elif unidad_masa == "kg":
            num_estandarizado =  numero*1000000
        return num_estandarizado, "mg"

    @staticmethod
    def __estandarizarVolumen(numero, unidad_volumen):
        num_estandarizado = numero
        if unidad_volumen == "l":
            num_estandarizado = numero * 1000
        return num_estandarizado, "ml"


class Receta:
    def __init__(self):
        self.nombre = ""
        self.tiempo = {}
        self.descripcion = ""
        self.ingredientes = {}
        self.pasos = []
        self.unidades_ingredientes = {}
        self.suma_tiempos = 0

    def get_receta_dict(self):
        json_dict = {}
        json_dict["nombre"] = self.nombre
        json_dict["tiempo"] = self.tiempo
        json_dict["descripcion"] = self.descripcion
        json_dict["ingredientes"] = self.ingredientes
        json_dict["pasos"] = self.pasos
        return json_dict


class CustomGachaneitorListener(GachaneitorListener):

    def __init__(self):
        self.recetas = []
        self.receta_actual = None
        
    def convertJSONrecetas(self):
        json_recetas = []
        for receta in self.recetas:
            json_recetas.append(receta.get_receta_dict())  
        return json.dumps(json_recetas)
    
    def writeJSONrecetas(self, ruta):
        json_recetas = self.convertJSONrecetas()
        with open(ruta, "w") as file:
            file.write(json_recetas)

    def exitInicio(self, ctx:GachaneitorParser.InicioContext):
        self.writeJSONrecetas("./salida.json")
        print("JSON generado correctamente")

    def enterReceta(self, ctx:GachaneitorParser.RecetaContext):
        self.receta_actual = Receta()

    def exitReceta(self, ctx:GachaneitorParser.RecetaContext):
        self.comprobar_tiempos()
        self.comprobar_ingr_usados()
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
        self.receta_actual.ingr_usados = dict(zip(self.receta_actual.ingredientes.keys(), 
                [False]*len(self.receta_actual.ingredientes.keys())))
        self.receta_actual.unidades_ingredientes = self.definir_cantidades_SI(self.receta_actual.ingredientes)
        print(self.receta_actual.unidades_ingredientes)

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
            else: #paso_per()
                verbo_paso = str(paso.paso_per().VERBO_PER())
                tipo_verbo = "persona"
                paso_dict["ingredientes"] = self.add_ingredientes(paso.paso_per().ingrediente_lista())

            self.anotar_ingr_usados(paso_dict["ingredientes"])
            self.comprobar_cantidades(paso_dict["ingredientes"])
            if paso_dict.get("tiempo"):
                self.receta_actual.suma_tiempos += self.definir_tiempo_SI(paso_dict["tiempo"])
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
            ingrediente_dict = ingredientes_dict.get(nombre_ingrediente, {})
            if len(ingrediente_dict.keys()) > 0:
                # Pendiente de modificar
                if ingredientes_dict[nombre_ingrediente]["unidad"] == unidad_ingrediente:
                    ingredientes_dict[nombre_ingrediente]["cantidad"] += cantidad_ingrediente
                    print(f"Warning: has añadido el ingrediente {nombre_ingrediente} varias veces, se suman las cantidades")
                else:
                    linea = ctx_nombre_ingrediente.getSymbol().line
                    columna = ctx_nombre_ingrediente.getSymbol().column
                    raise IngredienteRepetidoConUnidadDistintaException(nombre_ingrediente, linea, columna)
            else:
                ingredientes_dict[nombre_ingrediente] = {}
                ingredientes_dict[nombre_ingrediente]["cantidad"] = cantidad_ingrediente
                ingredientes_dict[nombre_ingrediente]["unidad"] = unidad_ingrediente
        return ingredientes_dict

    def anotar_ingr_usados(self, ingredientes_dict):
        for ingrediente in ingredientes_dict.keys():
            self.receta_actual.ingr_usados[ingrediente] = True

    def comprobar_ingr_usados(self):
        ingr_no_usados = [ingrediente for ingrediente in self.receta_actual.ingr_usados.keys()
                 if not self.receta_actual.ingr_usados[ingrediente]]
        if len(ingr_no_usados) > 0:
            raise IngredienteNoUsadosException(ingr_no_usados)

    def comprobar_cantidades(self, ingredientes_dict):
        ingr_estandarizados = self.definir_cantidades_SI(ingredientes_dict)
        print(ingr_estandarizados)
        for ingrediente, valor in ingr_estandarizados.items():
            if valor["cantidad"] > self.receta_actual.unidades_ingredientes[ingrediente]["cantidad"]:
                raise CantidadIngredienteExcedidaException(ingrediente)

    def comprobar_tiempos(self):
        tiempo_total_estandarizado = self.definir_tiempo_SI(self.receta_actual.tiempo["total"])
        if self.receta_actual.suma_tiempos != tiempo_total_estandarizado:
            raise Exception(f"La suma de tiempos de los pasos no coincide con el tiempo total de la receta")

    def definir_tiempo_SI(self, tiempo):
        return ConversorUnidades.estandarizarCantidad(tiempo["cantidad"], tiempo["unidad"])[0]

    def definir_cantidades_SI(self, ingredientes_dict):
        ingredientes_estandarizados = {}
        for ingrediente, valor in ingredientes_dict.items():
            cantidad_estandarizada, unidad_estandarizada = ConversorUnidades.estandarizarCantidad(valor["cantidad"], valor["unidad"])
            ingredientes_estandarizados[ingrediente] = {}
            ingredientes_estandarizados[ingrediente]["cantidad"] = cantidad_estandarizada
            ingredientes_estandarizados[ingrediente]["unidad"] = unidad_estandarizada
        return ingredientes_estandarizados

    