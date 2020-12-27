import sys
from argparse import ArgumentParser
from antlr4 import *
from GachaneitorLexer import GachaneitorLexer
from GachaneitorParser import GachaneitorParser
from GachaneitorErrorListener import GachaneitorErrorListener

 
def main(args):
    input_stream = FileStream(args.input_file, encoding="utf-8")
    lexer = GachaneitorLexer(input_stream)

    stream = CommonTokenStream(lexer)
    parser = GachaneitorParser(stream)

    '''errorListener = GachaneitorErrorListener()
    parser.removeErrorListeners()
    parser.addErrorListener(errorListener)'''

    tree = parser.inicio()


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