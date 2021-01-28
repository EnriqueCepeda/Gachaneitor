# Gachaneitor

Práctica final de la asignatura de Procesadores de Lenguajes

Curso 2020/2021

## Ejecución
La información detallada de cómo ejecutar cada práctica se encuentra en los README de las carpetas *src/pl_antlr/* y *src/pl_cup/*.

## Documentación del proyecto
La documentación de la práctica se encuentra almacenada en un PDF de la carpeta *doc*. 

## Ejemplos
Las recetas de ejemplo se encuentran en la carpeta *doc* del repositorio. Podemos clasificar las recetas en tres tipos:

* **Recetas correctas**: Aquí se pueden encontrar un conjunto de recetas que son correctas, tanto sintáctica como semánticamente, por lo que son aceptadas por los procesadores. También se incluye un archivo con dos recetas.
* **Recetas con errores de sintáctica**: En esta carpeta se encuentran archivos con errores sintácticos:
    * *Lenguaje_cantidad_falta_numero.txt*: A uno de los ingredientes en los pasos le falta el número de la cantidad usada. 
    * *Lenguaje_falta_dospuntos_ingrediente.txt*: A algunos de los ingredientes les falta los dos puntos entre el nombre y la cantidad (correcto, el ponerlo o no es opcional).
    * *Lenguaje_falta_guion.txt*: Lenguaje con un paso en el que no se incluye el guion en un paso.
    * *Lenguaje_falta_palabra_ingredientes.txt*: Lenguaje en el que no se incluye la palabra "ingredientes" en la receta (correcto, el ponerlo o no es opcional).
    * *Lenguaje_falta_palabra_pasos.txt*: Lenguaje en el que no se incluye la palabra "pasos" en la receta (correcto, el ponerlo o no es opcional).
    * *Lenguaje_falta_palabra_temperatura.txt*: Lenguaje en el que falta la palabra "temperatura" en la declaración de un paso (es un error no fatal del que el procesador en CUP se recupera).
    * *Lenguaje_falta_palabra_tiempo.txt*: Lenguaje en el que no se incluye la palabra "tiempo" en la receta (correcto, el ponerlo o no es opcional).
    * *Lenguaje_falta_palabra_velocidad.txt*: Lenguaje en el que falta la palabra "velocidad" en la declaración de un paso (es un error no fatal del que el procesador en CUP se recupera).
    * *Lenguaje_falta_puntoycoma_ingredientes.txt*: Lenguaje en el que faltan algunos puntos y comas con ingredientes (correcto, el ponerlo o no es opcional).
    * *Lenguaje_falta_verbo.txt*: Lenguaje con un paso en el que no se incluye el verbo de la acción a realizar.
    * *Lenguaje_warnings.txt*: Lenguaje con varios errores de sintaxis para la recuperación de errores con el procesador de JFlex y CUP. 
* **Recetas con errores de semántica**: Aquí podemos encontrar la receta del puré con los diferentes errores y comprobaciones de semántica de nuestro lenguaje: 
    * *Lenguaje_cantidades_mayores_a_las_declaradas.txt*: Un ingrediente se ha usado en los pasos con una cantidad superior a la declarada. 
    * *Lenguaje_ingredientes_no_usados.txt*: Se han declarado uno o varios ingredientes que no se usan en ninguno de los pasos posteriores.
    * *Lenguaje_magnitudes_distintas.txt*: Un ingrediente se ha declarado dos o más veces con unidades de distinta magnitud (e.g. unidades(ud) y masa(g))
    * *Lenguaje_suma_unidades_masa.txt*: Un ingrediente se ha declarado dos veces o más con unidades de la misma magnitud (e.g. masa: kg, g y mg). Por tanto, una suma de las cantidades es necesaria para generar la salida.
    * *Lenguaje_suma_unidades_tiempo.txt*: Los pasos se han declarado  con unidades de tiempo distintas (e.g. min y seg). Por tanto, una suma de los tiempos es necesaria para generar la salida.
    * *Lenguaje_tiempo_total_distinto_parcial.txt*: Los tiempos parciales no coinciden con el tiempo total de la receta.
    * *Lenguaje_unidades_uso_distintas.txt*: Un ingrediente se declara con una magnitud (e.g. masa(g)) y en los pasos se usa con otra distinta (e.g. unidades(ud)).

En *doc* también se incluyen unos archivos txt con la gramática pasada al Lenguaje Proletool para su inmediata evaluación en la herramienta.

## Participantes
* Raúl Bernalte Sánchez
* Enrique Cepeda Villamayor
* Elena Hervás Martín
* Elena María Ruiz Izquierdo

