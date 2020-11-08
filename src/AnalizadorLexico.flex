//* --------------------------Seccion codigo-usuario ------------------------*/ 
import java.io.*;

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

  /*
    private static final String keyWords []= {
      "\"", "{", "}",";", ":", "-", 
      "nombre","receta", "descripcion", "tiempo", "total", "ingredientes", "preparacion", "pasos", "velocidad",
      "pelar", "licuar", "triturar", "trocear", "moler", "batir", "dejar reposar", "amasar",
      "mezclar", "cocina al vapor", "escalfar", "hervir", "guisar", 
      "mg", "g", "kg", "ml", "l", "ud", "h", "min", "seg", "ºC", "ºF"
    };

    public static boolean is_keyword(String cadena){
      boolean keyword = false;
      for (int i = 0; i < keyWords.length && !keyword ; i++){
        if (keywords[i].equals(cadena))
          keyword = true;
      }
      return keyword;
    }

    public static String keyWord(String cadena){
      String keyword = new String();
      for (int i = 0; i < keywords.length && keyword.isEmpty(); i++){
        
      }
  */

  }

/* -----------------Seccion de opciones y declaraciones -----------------*/ 
/*--OPCIONES --*/ 
/* Nombre de la clase generada para el analizadorlexico*/ 

%%
%class analex 
%standalone

/* Indicar funcionamiento autonomo */


%line
%column
%unicode

/* Habilitar la compatibilidad con el interfaz CUP para el generador sintáctico */
 

%state COMENTARIO
%state DESCRIPCION


/* Declaraciones de macros NL(nueva linea) BLANCO(espacio en blanco) y TAB(tabulador) */


nl = [\n | \r | \t \r\n] ;
blanco = " " ;
tab = \t ;
verbo_mov = licuar | triturar | moler | batir | dejar reposar | amasar | mezclar ;
verbo_coc = cocinaralvapor | escalfar | hervir | guisar | sofreir ;
verbo_per = pelar | moler | trocear ;
unidad_cantidad = mg | g | kg | ml | l | ud ;
unidad_tiempo = h | min | seg ;
unidad_temperatura = ºC | ºF ;
cadena = [:jletterdigit:] | {nl} | {blanco} ;


%%
/* ------------------------Seccion de reglas y acciones ----------------------*/
<YYINITIAL> {
\{ {System.out.println("Token { encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));}
\} {System.out.println("Token } encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));}

receta {System.out.println("Token receta encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));}
nombre {System.out.println("Token nombre encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));}
descripcion {System.out.println("Token descripcion encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));}
tiempo {System.out.println("Token tiempo encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));}
total {System.out.println("Token total encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));}
preparacion {System.out.println("Token preparacion encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));}
: {System.out.println("Token ':' encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));}
- {System.out.println("Token '-' encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));}
pasos {System.out.println("Token pasos encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));}
ingredientes {System.out.println("Token ingredientes encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));}
velocidad {System.out.println("Token velocidad encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));}
{blanco} | {nl} | {tab}  {System.out.println("Token de mierda encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));}

\[  {System.out.println("Token '[' encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));
    yybegin(DESCRIPCION);}

{verbo_mov} {System.out.println("Token verbo_mov <"+yytext()+"> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));}
{verbo_coc} {System.out.println("Token verbo_coc <"+yytext()+"> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));}
{verbo_per} {System.out.println("Token verbo_per <"+yytext()+"> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));}

[1-9][:digit:]* {System.out.println("Token numero <"+yytext()+"> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));}
{unidad_cantidad} {System.out.println("Token unidad_cantidad <" +yytext()+ "> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));}
{unidad_tiempo} {System.out.println("Token unidad_tiempo <" +yytext()+ "> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));}
{unidad_temperatura} {System.out.println("Token unidad_temperatura <" +yytext()+ "> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));}

[:uppercase:][:jletter:]* 	{System.out.println("Token Ident <" +yytext()+ "> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));}

\/\*  {yybegin(COMENTARIO); System.out.println("Token Comentario encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));} 
. 		 {Utility.error(Utility.E_EJEMPLO, yytext(), yyline+1, yycolumn+1);
        System.out.println("Token No Valido <" +yytext()+ ">linea: " + (yyline+1) + " columna: " + (yycolumn+1));}

}/* fin YYinitial */

<DESCRIPCION> {
\] {yybegin(YYINITIAL);}
{cadena}  {System.out.println("Token cadena <" +yytext()+ "> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));}
}

<COMENTARIO> {
  \*\/ {yybegin(YYINITIAL);}
  {nl} {/*Ignoramos los saltos de línea de los comentarios*/}
  .  {/*Ignoramos el contenido de los comentarios*/}
}