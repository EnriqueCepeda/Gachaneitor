//* --------------------------Seccion codigo-usuario ------------------------*/ 
import java.io.*;
import java_cup.runtime.*;

class Utility{

  private static final String errorMsg[] = {
    "Error: Símbolo de fin de comentario no emparejado", 
    "Error: Símbolo de comienzo de comentario no emparejado",
    "Error: Símbolo de fin de identificador no emparejado",
    "Error: Símbolo de fin de descripción no emparejado", 
    "Error: Símbolo de comienzo de descripción no emparejado",
    "Error: Caracter ilegal "
  };

  public static final int E_ENDCOMMENT = 0; 
  public static final int E_STARTCOMMENT = 1;
  public static final int E_ENDIDENT = 2; 
  public static final int E_ENDDESC = 3; 
  public static final int E_STARTDESC = 4;
  public static final int E_UNMATCHED = 5; 

  public static void error(int code, String cadena, int line, int column) {
    System.out.println(errorMsg[code] + cadena + " en la línea "+ line + " y columna " + column);
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
 private int c_line, c_column;

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
cadena = ([:jletterdigit:] | {nl} | {blanco} | \. )+
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
  return symbol(sym.digito_velocidad, new String(yytext()));}

{unidad_cantidad} {System.out.println("Token unidad_cantidad <" +yytext()+ "> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.unidad_cantidad, new String(yytext()));}
{unidad_tiempo} {System.out.println("Token unidad_tiempo <" +yytext()+ "> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.unidad_tiempo, new String(yytext()));}
{unidad_temperatura} {System.out.println("Token unidad_temperatura <" +yytext()+ "> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.unidad_temp, new String(yytext()));}

\" {c_line=yyline+1; c_column=yycolumn+1; System.out.println("Caracter comilla encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
   yybegin(IDENTIFICADOR); return symbol(sym.comilla);} 

\/\*  {c_line=yyline+1; c_column=yycolumn+1; System.out.println("Inicio comentario encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); yybegin(COMENTARIO);} 

\*\/	{/* Error */ Utility.error(Utility.E_ENDCOMMENT, "", (yyline+1), (yycolumn+1)); System.exit(1);}
\]	{/* Error */ Utility.error(Utility.E_ENDDESC, "", (yyline+1), (yycolumn+1)); System.exit(1);}
. {/* Error */ Utility.error(Utility.E_UNMATCHED, yytext(), (yyline+1), (yycolumn+1)); System.exit(1);}

}/* fin YYinitial */

<DESCRIPCION> {
  \] {System.out.println("Caracter ']' encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); yybegin(YYINITIAL);}
  {cadena}  {System.out.println("Token contenido_descripcion <" +yytext()+ "> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.contenido_descripcion, new String(yytext()));}
  <<EOF>> {/* Error */ Utility.error(Utility.E_STARTDESC,"", c_line, c_column); System.exit(1);}
  . {/* Error */ Utility.error(Utility.E_UNMATCHED, yytext(), (yyline+1), (yycolumn+1)); System.exit(1);}
}

<COMENTARIO> {
  \*\/ {yybegin(YYINITIAL);  System.out.println("Fin comentario encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));}
  {nl} {/*Ignoramos los saltos de línea de los comentarios*/}
  <<EOF>> {/* Error */ Utility.error(Utility.E_STARTCOMMENT,"", c_line, c_column); System.exit(1);}
  .  {/*Ignoramos el contenido de los comentarios*/}
}

<IDENTIFICADOR> {
  \" {System.out.println("Caracter comilla <" +yytext()+ "> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));
     yybegin(YYINITIAL);return symbol(sym.comilla);}
  {ident} {System.out.println("Token ident <" +yytext()+ "> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));
    return symbol(sym.ident_nombre, new String(yytext()));}
  <<EOF>> {/* Error  */ Utility.error(Utility.E_ENDIDENT,"", c_line, c_column); System.exit(1);}
  . {/* Error */ Utility.error(Utility.E_UNMATCHED, yytext(), (yyline+1), (yycolumn+1)); System.exit(1);}
}