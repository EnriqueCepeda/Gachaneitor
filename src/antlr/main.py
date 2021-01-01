import sys
from argparse import ArgumentParser
from antlr4 import FileStream, CommonTokenStream, ParseTreeWalker
from GachaneitorLexer import GachaneitorLexer
from GachaneitorParser import GachaneitorParser
from CustomGachaneitorListener import CustomGachaneitorListener
 
def main(args):
    input_stream = FileStream(args.input_file, encoding="utf-8")
    lexer = GachaneitorLexer(input_stream)

    stream = CommonTokenStream(lexer)
    parser = GachaneitorParser(stream)
    tree = parser.inicio()
    
    listener = CustomGachaneitorListener()
    walker = ParseTreeWalker()

    try:
        walker.walk(listener, tree)
    except Exception as e:
        print(e)

    recetas = listener.recetas
    print(recetas[0])

def build_argparser():
    argparser = ArgumentParser()
    argparser.add_argument(
        "-i", "--input_file",
        help="Cadena de entrada del procesador de lenguajes."
    )
    argparser.add_argument(
        "-o", "--output_dir",
        help="Directorio donde el lenguaje de salida será guardado.",
        default="."
    )
    return argparser

 
if __name__ == '__main__':
    parser = build_argparser()
    main(parser.parse_args())