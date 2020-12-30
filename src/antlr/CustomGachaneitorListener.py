from GachaneitorListener import GachaneitorListener
from GachaneitorParser import GachaneitorParser
from antlr4.error.Errors import FailedPredicateException
import json
import sys

class Receta:
    def __init__(self):
        self.nombre = ""
        self.tiempo = {}
        self.descripcion = ""
        self.ingredientes = {}
        self.pasos = []
        

    def get_receta_dict(self):
        json_dict = {}
        json_dict["nombre"] = self.nombre
        json_dict["tiempo"] = self.tiempo
        json_dict["descripcion"] = self.descripcion
        json_dict["ingredientes"] = self.ingredientes
        json_dict["pasos"] = self.pasos
        return json_dict

class GachaneitorException(Exception):

    """
    Excepción base para errores semánticos

    Atributos:
        linea
        columna
    """

    def __init__(self, linea, columna, mensaje):
        self.linea = linea
        self.columna = columna
        self.mensaje = mensaje
        super().__init__(self.mensaje)

    def __str__(self):
        return f'Error: {self.mensaje}. Linea {self.linea}, columna {self.columna}'    

class IngredienteRepetidoConUnidadDistintaException(GachaneitorException):
    """
    Excepción para mostrar al usuario que ha repetido un ingrediente, pero la unidad es distinta a la que había almacenada

    Atributos:
        nombre_ingrediente
        linea
        columna
    """

    def __init__(self, nombre_ingrediente, linea, columna):
        self.nombre_ingrediente = nombre_ingrediente
        self.mensaje = f'El ingrediente ' + self.nombre_ingrediente +' está repetido en la lista y la unidad anteriormente introducida no concuerda con la nueva.'
        super().__init__(linea, columna, self.mensaje)


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
        self.comprobar_cantidades()
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
        #print(self.receta_actual.ingr_usados)

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
        #print(self.receta_actual.ingr_usados)
        ingr_no_usados = []
        [ingr_no_usados.append(ingrediente) for ingrediente in self.receta_actual.ingr_usados.keys()
                 if not self.receta_actual.ingr_usados[ingrediente]]
        if len(ingr_no_usados) > 0:
            raise Exception(f"No has usado estos ingredientes: {ingr_no_usados}")

    def comprobar_cantidades(self):
        pass

    def conversor_unidades(self):
        pass