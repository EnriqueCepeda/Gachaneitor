# Gachaneitor: Procesador con JFlex+CUP

Procesador del GachaLanguage con análisis sintáctico ascendente hecho con JFlex, CUP y Java. 

## Archivos

* *AnalizadorLexico.flex*: Archivo con la especificación de los tokens del *GachaLanguage*.
* *AnalizadorSintactico.cup*: Archivo que coge los tokens reconocidos de JFlex y define la gramática utilizada por el procesador de lenguajes para reconocer el *GachaLanguage*.
* Clases necesarias para el análisis semántico:
    * ComprobadorSemantica.java
    * ConversorUnidades.java
    * Clases auxiliares: 
        * Cantidad.java
        * Receta.java
        * Paso.java
        * Paso_mov.java
        * Paso_coc.java
        * Paso_per.java
        * Paso_mov.java
        * Tiempo.java
        * Ingrediente.java
* *TestSemantica.java*: Clase con tests unitarios con distintos casos de cadenas del lenguaje GachaLanguage con errores y casuísticas relacionadas con su semántica.
* *TestSintactica.java*: Clase con tests unitarios con distintos casos de cadenas del lenguaje GachaLanguage con errores y casuísticas relacionadas con su sintáctica.


## Requisitos

Para poder ejecutar el procesador de lenguajes, es necesario tener instalado tanto Java 1.8 como los archivos .jar de JFlex y CUP en el sistema.

Además, para los tests es necesario tanto JUnit como Hamcrest Core y un .jar extra para manipular y trabajar con strings en formato JSON. Todos ellos están incluidos en la carpeta *jar* y se deben añadir al CLASSPATH del sistema.


## Ejecución

El primer paso es generar el *analex.java* con el autómata que reconoce el léxico de nuestro lenguaje. Abra una terminal en la carpeta actual y escriba: 

    jflex AnalizadorLexico.flex --encoding utf-8

Después de generar el analizador léxico, procedemos a hacer lo mismo con el analizador sintáctico de CUP:

    java  java_cup.Main AnalizadorSintactico.cup

Aquí se creará el *sym.java* y el *parser.java*. Ya tenemos todas las clases .java necesarias, por lo que procedemos a compilarlas: 

    javac -encoding utf8 *.java  

Después, para hacer uso del procesador, escriba en la terminal: 

    java -cp <ruta_del_archivo_java-cup-11b-runtime.jar> Main <ruta_del_archivo_con_recetas>

O directamente si tenemos el .jar en el classpath:

    java Main <ruta_del_archivo_con_recetas>

La salida del procesador se guarda en el archivo *salida.json*.


## Tests
Para ejecutar los tests sintácticos y semánticos, hay que bajar los 3 jars y añadirlos a la variable de entorno CLASSPATH del sistema. Después de eso, situándonos en esta carpeta, *src/pl_cup*, con la versión del 1.8 del compilador e intérprete ejecutamos los siguientes comandos:

    javac -encoding utf-8 *.java
    java junit.textui.TestRunner TestSemantica
    java junit.textui.TestRunner TestSintactica