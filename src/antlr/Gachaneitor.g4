grammar Gachaneitor;

import GachaneitorLexico;

inicio : receta (receta)*;
receta : RECETA LLAVE_ABIERTA nombre descripcion tiempo_receta ingredientes pasos LLAVE_CERRADA;
nombre :  NOMBRE? COMILLA IDENT_NOMBRE COMILLA;
descripcion : DESCRIPCION? CONTENIDO_DESCRIPCION;
tiempo_receta : TIEMPO LLAVE_ABIERTA TOTAL tiempo PREPARACION tiempo LLAVE_CERRADA;

ingredientes : INGREDIENTES LLAVE_ABIERTA ingrediente_lista LLAVE_CERRADA;
ingrediente_lista : (ingrediente PUNTOYCOMA)+ ;
ingrediente : COMILLA IDENT_NOMBRE COMILLA DOSPUNTOS cantidad;
pasos : PASOS LLAVE_ABIERTA (paso)+ LLAVE_CERRADA;
paso : paso_mov | paso_coc | paso_per;

paso_mov : GUION VERBO_MOV ingrediente_lista tiempo velocidad;
paso_coc : GUION VERBO_COC ingrediente_lista tiempo temperatura; 
paso_per : GUION VERBO_PER ingrediente_lista; 

cantidad : NUMERO UNIDAD_CANTIDAD;
tiempo : NUMERO UNIDAD_TIEMPO;
temperatura : TEMPERATURA NUMERO UNIDAD_TEMP;
velocidad : VELOCIDAD DIGITO_VELOCIDAD;

