# Gachaneitor
Práctica final de la asignatura de Procesadores de Lenguajes
Curso 2020/2021

## Ejecución
La información detallada de cómo ejecutar cada práctica se encuentra en los README de las carpetas *src/antlr/* y *src/jflex_cup/*.

## Documentación del proyecto
La documentación de la práctica se encuentra almacenada en un PDF de la carpeta *doc*. 

## Ejemplos
Las recetas de ejemplo se encuentran en la carpeta *doc* del repositorio. Podemos clasificar las recetas en tres tipos:

* **Recetas correctas**: Aquí se pueden encontrar un conjunto de recetas que son correctas, tanto sintáctica como semánticamente, por lo que son aceptadas por los procesadores. También se incluye un archivo con dos recetas.
* **Recetas con errores de sintáctica**: En esta carpeta se encuentran archivos con errores sintácticos:
    * Lenguaje_
    * 
* **Recetas con errores de semántica**: Aquí podemos encontrar la receta del puré con los diferentes errores y comprobaciones de semántica de nuestro lenguaje: 
    * *Lenguaje_cantidades_mayores_a_las_declaradas.txt*: Un ingrediente se ha declarado con dos magnitudes distintas (e.g. )
    * *Lenguaje_ingredientes_no_usados.txt*: Se han declarado uno o varios ingredientes que no se usan en ninguno de los pasos posteriores
    * *Lenguaje_magnitudes_distintas.txt*: Un ingrediente se ha declarado dos o más veces con unidades de distinta magnitud
    * *Lenguaje_suma_unidades_masa.txt*: Un ingrediente se ha declarado dos veces o más con unidades de la misma magnitud. Por tanto, una suma de las cantidades es necesaria para generar la salida.
    * *Lenguaje_suma_unidades_tiempo.txt*: Los pasos se han declarado  con unidades de tiempo distintas. Por tanto, una suma de los tiempos es necesaria para generar la salida.
    * *Lenguaje_tiempo_total_distinto_parcial.txt*: Los tiempos parciales no coinciden con el tiempo total de la receta
    * *Lenguaje_unidades_uso_distintas.txt*: Un ingrediente se declara con una magnitud (e.g. masa(g)) y en los pasos se usa con otra distinta (e.g. unidades(ud)).

En *doc* también se incluyen unos archivos txt con la gramática pasada al Lenguaje Proletool para su inmediata evaluación en la herramienta.

## Participantes
* Raúl Bernalte Sánchez
* Enrique Cepeda Villamayor
* Elena Hervás Martín
* Elena María Ruiz Izquierdo

