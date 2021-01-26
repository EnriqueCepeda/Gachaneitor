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

    