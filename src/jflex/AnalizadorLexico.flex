//* --------------------------Seccion codigo-usuario ------------------------*/ 
import java.io.*;
import java_cup.runtime.*;

class Utility{

  private static final String errorMsg[] = {
    "Unmatched end of comment punctuation", 
    "Texto de ejemplo xd"
  };

  public static final int E_ENDCOMMENT = 0; 
  public static final int E_EJEMPLO = 1;


  public static void error(int code, String cadena, int line, int column) {
    System.out.println("errorMsg[code]: "+ cadena + " en la línea: "+ line + " y columna: " + column);
  }

}

/* -----------------Seccion de opciones y declaraciones -----------------*/ 
/*--OPCIONES --*/ 
/* Nombre de la clase generada para el analizadorlexico*/ 

%%
%class analex 

/* Indicar funcionamiento autonomo */
%standalone

%line
%column
%unicode

/* Habilitar la compatibilidad con el interfaz CUP para el generador sintáctico */
%cup

%state COMENTARIO
%state DESCRIPCION
%state IDENTIFICADOR

/*--DECLARACIONES --*/ 

%{ /* Principio Declaraciones */

/* Crear un nuevo objeto java_cup.runtime.Symbol con informacion sobre
   el token actual sin valor */

 private Symbol symbol(int type) {

   return new Symbol(type,yyline,yycolumn);
 
 }
private Symbol symbol(int type,Object value){ 
	return new Symbol(type,yyline,yycolumn,value); 
}
/* Fin symbol */


%} /* Fin Declaraciones */


/* Declaraciones de macros NL(nueva linea) BLANCO(espacio en blanco) y TAB(tabulador) */


nl = [\n | \r | \t \r\n]
blanco = " "
tab = \t
verbo_mov = licuar | triturar | moler | batir | dejar reposar | amasar | mezclar
verbo_coc = "cocinar al vapor" | escalfar | hervir | guisar | sofreir
verbo_per = pelar | moler | trocear
unidad_cantidad = mg | g | kg | ml | l | ud
unidad_tiempo = h | min | seg
unidad_temperatura = ºC | ºF
cadena = ([:jletterdigit:] | {nl} | {blanco} | \. )*
ident = ( [:jletter:] | {blanco} )+


%%
/* ------------------------Seccion de reglas y acciones ----------------------*/
<YYINITIAL> {
\{ {System.out.println("Token { encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.llave_abierta);}
\} {System.out.println("Token } encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));
  return symbol(sym.llave_cerrada);}

receta {System.out.println("Token receta encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.receta);}
nombre {System.out.println("Token nombre encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));
  return symbol(sym.nombre);}
descripcion {System.out.println("Token descripcion encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));
  return symbol(sym.descripcion);}
tiempo {System.out.println("Token tiempo encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));
  return symbol(sym.tiempo);}
total {System.out.println("Token total encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));
  return symbol(sym.total);}
preparacion {System.out.println("Token preparacion encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.preparacion);}
: {System.out.println("Token ':' encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.dospuntos);}
; {System.out.println("Token ';' encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.puntoycoma);}
- {System.out.println("Token '-' encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.guion);}
pasos {System.out.println("Token pasos encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.pasos);}
ingredientes {System.out.println("Token ingredientes encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.ingredientes);}

temperatura {System.out.println("Token temperatura encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.temperatura);}
velocidad {System.out.println("Token velocidad encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.velocidad);}

{blanco} | {nl} | {tab}  {}

\[  {System.out.println("Caracter '[' encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));
    yybegin(DESCRIPCION);}

{verbo_mov} {System.out.println("Token verbo_mov <"+yytext()+"> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.verbo_mov, new String(yytext()));}
{verbo_coc} {System.out.println("Token verbo_coc <"+yytext()+"> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.verbo_coc, new String(yytext()));}
{verbo_per} {System.out.println("Token verbo_per <"+yytext()+"> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.verbo_per, new String(yytext()));}

[1-9][:digit:]* {System.out.println("Token numero <"+yytext()+"> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.numero, new Integer(yytext()));}
0[1-9]* {System.out.println("Token digito_velocidad <"+yytext()+"> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.digito_velocidad, new Integer(yytext()));}

{unidad_cantidad} {System.out.println("Token unidad_cantidad <" +yytext()+ "> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.unidad_cantidad, new String(yytext()));}
{unidad_tiempo} {System.out.println("Token unidad_tiempo <" +yytext()+ "> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.unidad_tiempo, new String(yytext()));}
{unidad_temperatura} {System.out.println("Token unidad_temperatura <" +yytext()+ "> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.unidad_temp, new String(yytext()));}

\" {System.out.println("Caracter comilla encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
   yybegin(IDENTIFICADOR); return symbol(sym.comilla);} 

\/\*  {yybegin(COMENTARIO); System.out.println("Inicio comentario encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));} 


}/* fin YYinitial */

<DESCRIPCION> {
\] {System.out.println("Caracter ']' encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); yybegin(YYINITIAL);}
{cadena}  {System.out.println("Token cadena <" +yytext()+ "> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.contenido_descripcion, new String(yytext()));}
}

<COMENTARIO> {
  \*\/ {yybegin(YYINITIAL);  System.out.println("Fin comentario encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));}
  {nl} {/*Ignoramos los saltos de línea de los comentarios*/}
  .  {/*Ignoramos el contenido de los comentarios*/}
}

<IDENTIFICADOR> {
  {ident} {System.out.println("Token IDENT <" +yytext()+ "> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));
    return symbol(sym.ident_nombre);}
  \" {System.out.println("Caracter comilla <" +yytext()+ "> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));
     yybegin(YYINITIAL);return symbol(sym.comilla);}

}