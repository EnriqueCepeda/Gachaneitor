# Gachaneitor: Procesador con ANTLR

Procesador del GachaLanguage con análisis sintáctico descendente hecho con ANTLR y Python. 

## Archivos

* *GachaneitorLexico.g4*: Archivo con la especificación de los tokens del *GachaLanguage*.
* *Gachaneitor.g4*: Archivo que hace uso del léxico del archivo anteriormente mencionado e incluye la gramática que analiza y reconoce el *GachaLanguage*.
* *CustomGachaneitorListener.py*: Listener creado para el análisis semántico del procesador.
* *GachaneitorErrorListener.py*: Clase que hereda y sobreescribe el método del ErrorListener por defecto para mostrar la línea y columna de los errores sintácticos. 

## Requisitos

Para ejecutar la herramienta, es necesario tener el intérprete de Python instalado en el sistema. Además, se adjunta un archivo *requirements.txt* indicando el ejecutable de antlr4 y las librerías necesarias para instalar en un entorno virtual. 

    pip3 install -r requirements.txt

## Ejecución

Tras haber instalado los requisitos y tener el entorno virtual preparado, situándonos en la carpeta actual procedemos a ejecutar:

    antlr4 -Dlanguage=Python3 -encoding utf-8 Gachaneitor.g4

Esto genera los distintos archivos del procesador de lenguajes(Lexer, Parser, Listener, ... /* completar */). Después, para hacer uso del procesador, escriba en la terminal: 

    python3 main.py -i <ruta_del_archivo_txt>

El JSON que se genera como salida del procesador aparecerá en la terminal.


## Tests

Se ha añadido un script con tests unitarios que ejecuta cada uno de los casos de uso. Para ejecutar los tests automáticamente, en la carpeta actual escriba en una terminal:

    python3 -m unittest discover tests
    