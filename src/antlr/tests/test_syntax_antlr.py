import unittest
from antlr4 import FileStream, CommonTokenStream, ParseTreeWalker
from GachaneitorLexer import GachaneitorLexer
from GachaneitorParser import GachaneitorParser
from CustomGachaneitorListener import CustomGachaneitorListener, CantidadIngredienteExcedidaException, IngredientesDistintaMagnitudException, TiempoRecetaDistintoException, IngredientesNoUsadosException, UnidadesUsoDistintasException



class TestSintactica(unittest.TestCase):
    '''
    Tests que comprueban distintos errores o casuísticas en el análisis sintáctico

    '''
    def test_cantidad_falta_numero(self):
        '''
            A uno de los ingredientes en los pasos le falta el número de la cantidad usada. 
        '''
        input_file = "../../doc/syntax_tests/Lenguaje_cantidad_falta_numero.txt"
        input_stream = FileStream(input_file, encoding="utf-8")
        lexer = GachaneitorLexer(input_stream)
        stream = CommonTokenStream(lexer)
        parser = GachaneitorParser(stream)
        tree = parser.inicio()

        listener = CustomGachaneitorListener()
        walker = ParseTreeWalker()
        
        with self.assertRaises(Exception):
            walker.walk(listener, tree)

    def test_dos_puntos_ingrediente(self):
        '''
            A algún ingrediente le falta los dos puntos que separa el nombre del ingrediente de la cantidad de este.
        '''
        input_file = "../../doc/syntax_tests/Lenguaje_falta_dospuntos_ingrediente.txt"
        input_stream = FileStream(input_file, encoding="utf-8")
        lexer = GachaneitorLexer(input_stream)
        stream = CommonTokenStream(lexer)
        parser = GachaneitorParser(stream)
        tree = parser.inicio()

        listener = CustomGachaneitorListener()
        walker = ParseTreeWalker()
        
        try:
            walker.walk(listener, tree)
        except Exception:
            self.fail("Los dos puntos que separan el nombre del ingrediente de la cantidad de este son opcionales, no debería de saltar una excepción")

    def test_falta_guion(self):
        '''
            A algún paso le falta el guion de inicio 
        '''
        input_file = "../../doc/syntax_tests/Lenguaje_falta_guion.txt"
        input_stream = FileStream(input_file, encoding="utf-8")
        lexer = GachaneitorLexer(input_stream)
        stream = CommonTokenStream(lexer)
        parser = GachaneitorParser(stream)
        tree = parser.inicio()

        listener = CustomGachaneitorListener()
        walker = ParseTreeWalker()
        
        with self.assertRaises(Exception):
            walker.walk(listener, tree)
            

    def test_falta_palabra_ingredientes(self):
        '''
            A la parte de declaración de ingredientes de la receta le falta la palabra "ingredientes"
        '''
        input_file = "../../doc/syntax_tests/Lenguaje_falta_palabra_ingredientes.txt"
        input_stream = FileStream(input_file, encoding="utf-8")
        lexer = GachaneitorLexer(input_stream)
        stream = CommonTokenStream(lexer)
        parser = GachaneitorParser(stream)
        tree = parser.inicio()

        listener = CustomGachaneitorListener()
        walker = ParseTreeWalker()
        
        try:
            walker.walk(listener, tree)
        except Exception:
            self.fail("La palabra \"ingredientes\" es opcional, no debería de saltar una excepción")

    def test_falta_palabra_pasos(self):
        '''
            A la parte de declaración de pasos de la receta le falta la palabra "pasos"
        '''
        input_file = "../../doc/syntax_tests/Lenguaje_falta_palabra_pasos.txt"
        input_stream = FileStream(input_file, encoding="utf-8")
        lexer = GachaneitorLexer(input_stream)
        stream = CommonTokenStream(lexer)
        parser = GachaneitorParser(stream)
        tree = parser.inicio()

        listener = CustomGachaneitorListener()
        walker = ParseTreeWalker()
        
        try:
            walker.walk(listener, tree)
        except Exception:
            self.fail("La palabra \"pasos\" es opcional, no debería de saltar una excepción")
    

    def test_falta_palabra_temperatura(self):
        '''
            A un paso de cocción de la receta le falta la palabra "temperatura"
        '''
        input_file = "../../doc/syntax_tests/Lenguaje_falta_palabra_temperatura.txt"
        input_stream = FileStream(input_file, encoding="utf-8")
        lexer = GachaneitorLexer(input_stream)
        stream = CommonTokenStream(lexer)
        parser = GachaneitorParser(stream)
        tree = parser.inicio()

        listener = CustomGachaneitorListener()
        walker = ParseTreeWalker()
        
        try:
            walker.walk(listener, tree)
        except Exception:
            self.fail("La palabra \"temperatura\" no es opcional, pero ANTLR debería recuperarse del error")

    def test_falta_palabra_tiempo(self):
        '''
            A la parte de declaración de tiempos de la receta le falta la palabra tiempo
        '''
        input_file = "../../doc/syntax_tests/Lenguaje_falta_palabra_tiempo.txt"
        input_stream = FileStream(input_file, encoding="utf-8")
        lexer = GachaneitorLexer(input_stream)
        stream = CommonTokenStream(lexer)
        parser = GachaneitorParser(stream)
        tree = parser.inicio()

        listener = CustomGachaneitorListener()
        walker = ParseTreeWalker()
        
        try:
            walker.walk(listener, tree)
        except Exception:
            self.fail("La palabra \"tiempo\" es opcional, no debería de saltar una excepción")

    def test_falta_palabra_velocidad(self):
        '''
            A un paso de cocción de la receta le falta la palabra "velocidad"
        '''
        input_file = "../../doc/syntax_tests/Lenguaje_falta_palabra_velocidad.txt"
        input_stream = FileStream(input_file, encoding="utf-8")
        lexer = GachaneitorLexer(input_stream)
        stream = CommonTokenStream(lexer)
        parser = GachaneitorParser(stream)
        tree = parser.inicio()

        listener = CustomGachaneitorListener()
        walker = ParseTreeWalker()
        
        try:
            walker.walk(listener, tree)
        except Exception:
            self.fail("La palabra \"velocidad\" no es opcional, pero ANTLR debería recuperarse del error")

    def test_puntoycoma_ingredientes(self):
        '''
            A una enumeración de ingredientes le faltan puntoycomas entre los distintos elementos
        '''
        input_file = "../../doc/syntax_tests/Lenguaje_falta_puntoycoma_ingredientes.txt"
        input_stream = FileStream(input_file, encoding="utf-8")
        lexer = GachaneitorLexer(input_stream)
        stream = CommonTokenStream(lexer)
        parser = GachaneitorParser(stream)
        tree = parser.inicio()

        listener = CustomGachaneitorListener()
        walker = ParseTreeWalker()
        
        try:
            walker.walk(listener, tree)
        except Exception:
            self.fail("El poner puntoycoma es opcional, no debería de saltar una excepción")


    def test_falta_verbo_paso(self):
        '''
            A un paso le falta el verbo que define lo que hace la máquina
        '''
        input_file = "../../doc/syntax_tests/Lenguaje_falta_verbo.txt"
        input_stream = FileStream(input_file, encoding="utf-8")
        lexer = GachaneitorLexer(input_stream)
        stream = CommonTokenStream(lexer)
        parser = GachaneitorParser(stream)
        tree = parser.inicio()

        listener = CustomGachaneitorListener()
        walker = ParseTreeWalker()
        
        with self.assertRaises(Exception):
            walker.walk(listener, tree)

    