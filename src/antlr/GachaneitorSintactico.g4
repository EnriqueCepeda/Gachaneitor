grammar GachaneitorSintactico;

import GachaneitorLexico;

inicio : receta (receta)*;
receta : RECETA '{' nombre descripcion tiempo_receta ingredientes pasos '}';
nombre :  NOMBRE? COMILLA CADENA COMILLA;
descripcion : DESCRIPCION? CORCHETE_ABIERTO CADENA CORCHETE_CERRADO;
tiempo_receta : TIEMPO '{' TOTAL tiempo PREPARACION tiempo '}';

ingredientes : INGREDIENTES LLAVE_ABIERTA (ingrediente)+ LLAVE_CERRADA;
ingrediente : IDENT_NOMBRES DOSPUNTOS cantidad;
pasos : PASOS CORCHETE_ABIERTO (paso)+ CORCHETE_CERRADO;
paso : paso_mov | paso_coc | paso_per;

paso_mov : VERBO_MOV ingredientes tiempo velocidad;
paso_coc : VERBO_COC ingredientes tiempo temperatura; 
paso_per : VERBO_PER ingredientes; 

cantidad : NUMERO UNIDAD_CANTIDAD;
tiempo : NUMERO UNIDAD_TIEMPO;
temperatura : TEMPERATURA UNIDAD_TEMP;
velocidad : VELOCIDAD DIGITO_VELOCIDAD;

