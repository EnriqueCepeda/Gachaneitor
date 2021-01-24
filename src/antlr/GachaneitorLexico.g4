lexer grammar GachaneitorLexico;

/*
 * Lexer Rules
 */

RECETA : 'receta';
NOMBRE : 'nombre';
DESCRIPCION : 'descripcion';
TIEMPO : 'tiempo';
TOTAL : 'total';
PREPARACION : 'preparacion';
DOSPUNTOS : ':';
PUNTOYCOMA : ';';
GUION : '-';
PASOS : 'pasos';
INGREDIENTES : 'ingredientes';
TEMPERATURA : 'temperatura';
VELOCIDAD : 'velocidad';
UNIDAD_CANTIDAD : 'mg' | 'g' | 'kg' | 'ml' | 'l'  | 'ud';
UNIDAD_TEMP : 'ºC' | 'ºF';
UNIDAD_TIEMPO : 'h' | 'min' | 'seg';

VERBO_MOV : 'licuar' | 'triturar' | 'batir' | 'dejar reposar' | 'amasar' | 'mezclar';
VERBO_COC : 'cocinar al vapor' | 'escalfar' | 'hervir' | 'guisar' | 'sofreir';
VERBO_PER : 'pelar' | 'trocear' | 'moler';

OTROS_CARACTERES : ',' | ')' | '(' | '_' | '.' ;
LLAVE_ABIERTA : '{';
LLAVE_CERRADA : '}';
COMILLA : '"';

NUMERO : [1-9][0-9]*;
DIGITO_VELOCIDAD : '0'[1-9]; 

IDENT_NOMBRE : [A-Z]([a-z] | ' ' | TILDES | 'ñ' | 'Ñ')*; 
CADENA : ([A-Z] | [a-z] | [0-9] | OTROS_CARACTERES | TILDES | 'ñ'| 'Ñ' )+;

TILDES : 'á' | 'é' | 'í' | 'ó' | 'ú' | 'Á' | 'É' | 'Í' | 'Ó' | 'Ú';

CONTENIDO_DESCRIPCION : CORCHETE_ABIERTO (CADENA | ' ')* CORCHETE_CERRADO ;

CORCHETE_ABIERTO : '[' ;
CORCHETE_CERRADO : ']' ;

/*Skips*/ 
COMMENT : '/*' .*? '*/' -> skip; // saltar los comentarios de varias líneas
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines