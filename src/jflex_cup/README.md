# Gachaneitor: Procesador con JFlex+CUP

Procesador del GachaLanguage con análisis sintáctico ascendente hecho con JFlex, CUP y Java. 

## Archivos

* *AnalizadorLexico.flex*: Archivo con la especificación de los tokens del *GachaLanguage*.
* *AnalizadorSintactico.cup*: Archivo que coge los tokens reconocidos de JFlex 
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


## Requisitos

Para poder ejecutar el procesador de lenguajes, es necesario tener instalado tanto Java como JFlex y CUP en el sistema. 


## Ejecución

El primer paso es generar el *analex.java* con el autómata que reconoce el léxico de nuestro lenguaje. Abra una terminal en la carpeta actual y escriba: 

    jflex AnalizadorLexico.flex --encoding utf-8

Después de generar el analizador léxico, procedemos a hacer lo mismo con el analizador sintáctico de CUP:

    java  java_cup.Main AnalizadorSintactico.cup

Aquí se creará el *sym.java* y el *parser.java*. ya tenemos todas las clases .java generadas, por lo que procedemos a compilarlas: 

    javac *.java 

Después, para hacer uso del procesador, escriba en la terminal: 

    java -cp <ruta_del_archivo_java-cup-11b-runtime.jar> Main <ruta_del_archivo_con_recetas>

ó directamente si tenemos el .jar en el classpath:

    java Main <ruta_del_archivo_con_recetas>

La salida del procesador se guarda en el archivo *salida.json*.


## Tests
Para ejecutar los tests sintácticos y semánticos 