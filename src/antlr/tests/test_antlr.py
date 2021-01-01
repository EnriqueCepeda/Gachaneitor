import unittest
from antlr4 import FileStream, CommonTokenStream, ParseTreeWalker
from GachaneitorLexer import GachaneitorLexer
from GachaneitorParser import GachaneitorParser
from CustomGachaneitorListener import CustomGachaneitorListener, CantidadIngredienteExcedidaException, IngredientesDistintaMagnitudException, TiempoRecetaDistintoException, IngredientesNoUsadosException



class TestSemantica(unittest.TestCase):
    '''
    Tests que comprueban distintos errores o casuísticas en el análisis semántico

    '''

    def test_ingredientes_distintas_magnitudes(self):
        '''
            Utiliza dos ingredientes en una lista de ingredientes con magnitudes distintas, por lo tanto suelta excepción
        '''
        input_file = "../../doc/tests/Lenguaje_magnitudes_distintas.txt"
        input_stream = FileStream(input_file, encoding="utf-8")
        lexer = GachaneitorLexer(input_stream)
        stream = CommonTokenStream(lexer)
        parser = GachaneitorParser(stream)
        tree = parser.inicio()

        listener = CustomGachaneitorListener()
        walker = ParseTreeWalker()
        
        with self.assertRaises(IngredientesDistintaMagnitudException):
            walker.walk(listener, tree)
    

    def test_ingredientes_tiempos_distintos(self):
        '''
            La suma de los tiempos parciales de los pasos hecho por gachaneitor es distinta que la declarada inicialmente en la receta en la parte "total"
        '''
        input_file = "../../doc/tests/Lenguaje_tiempo_total_distinto_parcial.txt"
        input_stream = FileStream(input_file, encoding="utf-8")
        lexer = GachaneitorLexer(input_stream)
        stream = CommonTokenStream(lexer)
        parser = GachaneitorParser(stream)
        tree = parser.inicio()

        listener = CustomGachaneitorListener()
        walker = ParseTreeWalker()
        
        with self.assertRaises(TiempoRecetaDistintoException):
            walker.walk(listener, tree)


    def test_ingredientes_no_usados(self):
        '''
            Se han declarado ingredientes que finalmente no se han usado en los pasos
        '''
        input_file = "../../doc/tests/Lenguaje_ingredientes_no_usados.txt"
        input_stream = FileStream(input_file, encoding="utf-8")
        lexer = GachaneitorLexer(input_stream)
        stream = CommonTokenStream(lexer)
        parser = GachaneitorParser(stream)
        tree = parser.inicio()

        listener = CustomGachaneitorListener()
        walker = ParseTreeWalker()
        
        with self.assertRaises(IngredientesNoUsadosException):
            walker.walk(listener, tree)
    

    def test_cantidad_excedidad_ingrediente(self):
        '''
            En los pasos se usan cantidades mayores a las declaradas en la parte de definición de ingredientes
        '''
        input_file = "../../doc/tests/Lenguaje_cantidades_mayores_a_las_declaradas.txt"
        input_stream = FileStream(input_file, encoding="utf-8")
        lexer = GachaneitorLexer(input_stream)
        stream = CommonTokenStream(lexer)
        parser = GachaneitorParser(stream)
        tree = parser.inicio()

        listener = CustomGachaneitorListener()
        walker = ParseTreeWalker()
        
        with self.assertRaises(CantidadIngredienteExcedidaException):
            walker.walk(listener, tree)


    def test_suma_unidades_masa(self):
        '''
            Comprobación que la suma de unidades distintas de masa se hace correctamente
        '''
        input_file = "../../doc/tests/Lenguaje_suma_unidades_masa.txt"
        input_stream = FileStream(input_file, encoding="utf-8")
        lexer = GachaneitorLexer(input_stream)
        stream = CommonTokenStream(lexer)
        parser = GachaneitorParser(stream)
        tree = parser.inicio()

        listener = CustomGachaneitorListener()
        walker = ParseTreeWalker()
        
        walker.walk(listener, tree)

        receta_dict = listener.recetas[0]

        self.assertEqual(receta_dict.ingredientes["Calabacín"]["cantidad"], 1500)
        self.assertEqual(receta_dict.ingredientes["Calabacín"]["unidad"], "g")


    def test_suma_unidades_tiempo(self):
        '''
            Comprobación que la suma de unidades del tiempo de distintos pasos se hace correctamente
        '''
        input_file = "../../doc/tests/Lenguaje_suma_unidades_tiempo.txt"
        input_stream = FileStream(input_file, encoding="utf-8")
        lexer = GachaneitorLexer(input_stream)
        stream = CommonTokenStream(lexer)
        parser = GachaneitorParser(stream)
        tree = parser.inicio()

        listener = CustomGachaneitorListener()
        walker = ParseTreeWalker()
        
        walker.walk(listener, tree)

        receta_dict = listener.recetas[0]

        self.assertEqual(receta_dict.suma_tiempos, 7200)
