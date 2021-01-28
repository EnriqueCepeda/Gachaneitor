from antlr4.error.ErrorListener import ErrorListener

from textblob import TextBlob

class GachaneitorErrorListener(ErrorListener):

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        mensaje = str(TextBlob(msg).translate(to='es'))
        raise Exception("Linea: " + str(line) + ", columna: " + str(column) + ". " + mensaje.capitalize() )