//* --------------------------Seccion codigo-usuario ------------------------*/ 

import java_cup.runtime.*; 


 class Utility {

   
   private static final String errorMsg[] = {
     "Unmatched end-of-comment punctuation",
     "Error: Unmatched start-of-comment punctuation",
     "Error: Unclosed string",
     "Error: Illegal character > ",
     "Error: Illegal ident or keyword > ",
     "Error: Illegal digit > "
     };

   public static final int E_ENDCOMMENT = 0; 
   public static final int E_STARTCOMMENT = 1; 
   public static final int E_UNCLOSEDSTR = 2; 
   public static final int E_UNMATCHED = 3; 
   public static final int E_IDENT = 4;
   public static final int E_DIGIT = 5;
  
   public static void error(int code, String cadena, int line, int column)
       {
         System.out.println(errorMsg[code]+cadena+" en la linea: "+line+" columna: "+column);
       }

   private static final String keyWords [] = {
        "define","end","node","display","level",
        "bold","italic","href","condition","sqlexpr",
        "immediate","break","newpara","from","selected",
        "order","by"};
   
   public static boolean is_keyWord(String cadena)
       {
        boolean keyword=false;
        for (int i=0; i < keyWords.length && !keyword;i++) 
         {
          if (keyWords[i].equals(cadena)) keyword=true;
         }
        return keyword;
       }

   public static Symbol keyWord (String cadena, int line, int column)
       {
        
        Symbol keyword=new Symbol(sym.EOF);
        switch(cadena)
          {
            case "define": 	System.out.println("Token <define> encontrado en linea: " + (line+1) + " columna: " + (column+1));
                                keyword=new Symbol(sym.define, line, column);
				break;
            case "end": 	System.out.println("Token <end> encontrado en linea: " + (line+1) + " columna: " + (column+1));
				keyword=new Symbol(sym.end, line, column);
				break;
 	    case "node": 	System.out.println("Token <node> encontrado en linea: " + (line+1) + " columna: " + (column+1));
				keyword=new Symbol(sym.node, line, column);
				break;
            case "display": 	System.out.println("Token <display> encontrado en linea: " + (line+1) + " columna: " + (column+1));
				keyword=new Symbol(sym.display, line, column);
				break;	
            case "level": 	System.out.println("Token <level> encontrado en linea: " + (line+1) + " columna: " + (column+1));
				keyword=new Symbol(sym.level, line, column);
				break;
            case "bold": 
            case "italic":	System.out.println("Token <tipo>, lexema <" +cadena+ ">, encontrado en linea: " + (line+1) + " columna: " + (column+1));
				keyword=new Symbol(sym.tipo, line, column);
				break;
            case "href": 	System.out.println("Token <href> encontrado en linea: " + (line+1) + " columna: " + (column+1));
				keyword=new Symbol(sym.href, line, column);
				break;
            case "condition": 	System.out.println("Token <condition> encontrado en linea: " + (line+1) + " columna: " + (column+1));
				keyword=new Symbol(sym.condition, line, column);
				break;				
            case "sqlexpr":	System.out.println("Token <splexpr> encontrado en linea: " + (line+1) + " columna: " + (column+1));
				keyword=new Symbol(sym.sqlexpr, line, column);
				break;				
            case "immediate":	System.out.println("Token <immediate> encontrado en linea: " + (line+1) + " columna: " + (column+1));
				keyword=new Symbol(sym.immediate, line, column);
				break;
            case "break":
            case "newpara": 	System.out.println("Token <footer>, lexema <" +cadena+ ">, encontrado en linea: " + (line+1) + " columna: " +(column+1));
				keyword=new Symbol(sym.footer, line, column);
				break;
            case "from":	System.out.println("Token <from> encontrado en linea: " + (line+1) + " columna: " + (column+1));
				keyword=new Symbol(sym.from, line, column);
				break;	
            case "selected":	System.out.println("Token <selected> encontrado en linea: " + (line+1) + " columna: " + (column+1));
				keyword=new Symbol(sym.selected, line, column); 
				break;		
            case "order":	System.out.println("Token <order> encontrado en linea: " + (line+1) + " columna: " + (column+1));
				keyword=new Symbol(sym.order, line, column);	
				break;
            case "by":		System.out.println("Token <by> encontrado en linea: " + (line+1) + " columna: " + (column+1));
				keyword=new Symbol(sym.by, line, column); 
				break;
         }
        return keyword;
     }

 }

%% 

/* -----------------Seccionde opciones y declaraciones -----------------*/ 
/*--OPCIONES --*/ 


/* Posibilitar acceso a la columna y fila actual de analisis para depurar el funcionamiento*/ 

%line

%column

/* Habilitar la compatibilidad con el interfaz CUP para el generador sint�ctico */

%cup 

/* Declaracion de estados */

/* COMMENT es un estado para reconocer los comentarios (tipo c o java) */

%state COMMENT 

/*--DECLARACIONES --*/ 

%{ /* Principio Declaraciones */

private int c_line, c_column;

/* Crear un nuevo objeto java_cup.runtime.Symbol con informacion sobre
   el token actual sin valor */


public Symbol symbol(int type) {

   return new Symbol(type,yyline,yycolumn);
 
 }

/* Fin symbol */ 

%} /* Fin Declaraciones */ 


DIGIT=[0-9]
UPPERCASE=[A-Z]
LOWERCASE=[a-z]



%%
/* ------------------------Seccion de reglaslexicas: Patron Accion----------------------*/

<YYINITIAL>[a-z][a-z]*          {/* buscamos la cadena en la tabla de palabras reservadas. Si esta la salida debe ser la palabra reservada. 
                                    Si no esta error */
                                if (Utility.is_keyWord(yytext())) 
                                    { 
                                      Symbol keyword;
                                      keyword=Utility.keyWord(yytext(),yyline,yycolumn);
				      return keyword;
                                    }
                                  else Utility.error(Utility.E_IDENT,yytext(),yyline+1,yycolumn+1);}
<YYINITIAL>"(" 					{System.out.println("Token <par_a> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); return symbol(sym.par_a);}
<YYINITIAL>")" 					{System.out.println("Token <par_c> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); return symbol(sym.par_c);}
<YYINITIAL>{DIGIT}				{System.out.println("Token <digito>, lexema <"+yytext()+">, encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); return symbol(sym.digito);}
<YYINITIAL>","					{System.out.println("Token <coma> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); return symbol(sym.coma);}
<YYINITIAL>{UPPERCASE}[a-zA-Z0-9_.]*		{System.out.println("Token <ident>, lexema <" +yytext()+ ">, encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); return symbol(sym.ident);}
<YYINITIAL>"\""({UPPERCASE}|{LOWERCASE})*"\""	{System.out.println("Token <cadena>, lexema <" +yytext()+ ">, encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); return symbol(sym.cadena);}
<YYINITIAL>"\""({UPPERCASE}|{LOWERCASE})*       {/* Error */ Utility.error(Utility.E_UNCLOSEDSTR,"",(yyline+1),(yycolumn+1));}
<YYINITIAL>[ \t\r\n\f] 				{ /* ignora delimitadores */ }
<YYINITIAL>. 					{/* Error */ Utility.error(Utility.E_UNMATCHED,yytext(),(yyline+1),(yycolumn+1));}
<YYINITIAL>"//".*        			{ /* ignora los comentarios de una l�nea */ }
<YYINITIAL>"/*"        				{yybegin(COMMENT); c_line=yyline+1;c_column=yycolumn+1;}
<COMMENT>"*/"        				{yybegin(YYINITIAL);}
<YYINITIAL>"*/"					{/* Error */ Utility.error(Utility.E_ENDCOMMENT,"",(yyline+1),(yycolumn+1));}
<COMMENT>.            				{ /* ignora los contenidos de los comentarios */}
<COMMENT>[\n]        				{ /* ignora los saltos de l�nea en los comentarios */}
<COMMENT> <<EOF>> 				{/* Error */ Utility.error(Utility.E_STARTCOMMENT,"",c_line,c_column); /* System.exit(0);*/ return symbol(sym.EOF);}


