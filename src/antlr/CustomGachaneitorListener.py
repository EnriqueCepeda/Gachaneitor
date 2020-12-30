from GachaneitorListener import GachaneitorListener
from GachaneitorParser import GachaneitorParser
import json
import sys

class Receta:
    def __init__(self):
        self.nombre = ""
        self.tiempo = {}
        self.descripcion = ""
        self.ingredientes = {}
        self.pasos = []
        self.errores = []

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
        self.recetas.append(self.receta_actual)

    def enterNombre(self, ctx:GachaneitorParser.InicioContext):
        self.receta_actual.nombre = str(ctx.IDENT_NOMBRE())
        
    def enterDescripcion(self, ctx:GachaneitorParser.DescripcionContext):
        self.receta_actual.descripcion = str(ctx.CONTENIDO_DESCRIPCION())[1:-1]

    def enterTiempo_receta(self, ctx:GachaneitorParser.Tiempo_recetaContext):
        self.receta_actual.tiempo["total"] = {}
        self.receta_actual.tiempo["total"]["cantidad"] = int(str(ctx.tiempo(0).NUMERO())) 
        self.receta_actual.tiempo["total"]["unidad"] = str(ctx.tiempo(0).UNIDAD_TIEMPO())

        self.receta_actual.tiempo["preparacion"] = {}
        self.receta_actual.tiempo["preparacion"]["cantidad"] = int(str(ctx.tiempo(1).NUMERO())) 
        self.receta_actual.tiempo["preparacion"]["unidad"] = str(ctx.tiempo(1).UNIDAD_TIEMPO())
    
    def enterIngredientes(self, ctx:GachaneitorParser.IngredientesContext):
        lista = ctx.ingrediente_lista().ingrediente()
        for ingrediente in lista:
            nombre_ingrediente = str(ingrediente.IDENT_NOMBRE())
            cantidad_ingrediente = int(str(ingrediente.cantidad().NUMERO()))
            unidad_ingrediente = str(ingrediente.cantidad().UNIDAD_CANTIDAD())
            ingrediente_dict = self.receta_actual.ingredientes.get(nombre_ingrediente, {})
            if len(ingrediente_dict.keys()) > 0:
                print("Error: El ingrediente ya está metido")
                sys.exit(1)
            else:
                self.receta_actual.ingredientes[nombre_ingrediente] = {}
                self.receta_actual.ingredientes[nombre_ingrediente]["cantidad"] = cantidad_ingrediente
                self.receta_actual.ingredientes[nombre_ingrediente]["unidad"] = unidad_ingrediente

    def enterPasos(self, ctx:GachaneitorParser.PasosContext):
        lista = ctx.paso()
        for paso in lista:
            print(dir(paso))
            print(paso.getText())
            print(paso.paso_coc())
            print(paso.paso_mov())
            print(paso.paso_per())
            
            paso_dict = {}
            paso_dict["tiempo"] = {}
            if paso.paso_coc():
                verbo_paso = str(paso.paso_coc().VERBO_COC())
                paso_dict["tipo_persona"]="cocinar"
                paso_dict["tiempo"]["cantidad"] = int(str(paso.paso_coc().tiempo().NUMERO())) 
                paso_dict["tiempo"]["unidad"] = str(paso.paso_coc().tiempo().UNIDAD_TIEMPO())
            elif paso.paso_mov():
                verbo_paso = str(paso.paso_mov().VERBO_MOV())
                paso_dict["tipo_persona"]="mover"
                paso_dict["tiempo"]["cantidad"] = int(str(paso.paso_mov().tiempo().NUMERO())) 
                paso_dict["tiempo"]["unidad"] = str(paso.paso_mov().tiempo().UNIDAD_TIEMPO())
            else:
                verbo_paso = str(paso.paso_per().VERBO_PER())
                paso_dict["tipo_persona"]="persona"

            paso_dict["verbo"]=verbo_paso
            self.receta_actual.pasos.append(paso_dict)
    