
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\032\000\002\002\003\000\002\002\004\000\002\002" +
    "\004\000\002\003\012\000\002\004\006\000\002\004\005" +
    "\000\002\005\004\000\002\005\003\000\002\006\011\000" +
    "\002\007\006\000\002\010\004\000\002\010\005\000\002" +
    "\011\007\000\002\012\006\000\002\013\003\000\002\013" +
    "\004\000\002\014\003\000\002\014\003\000\002\014\003" +
    "\000\002\015\007\000\002\016\007\000\002\017\005\000" +
    "\002\021\004\000\002\020\004\000\002\022\005\000\002" +
    "\023\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\107\000\004\016\005\001\002\000\006\002\001\016" +
    "\005\001\002\000\004\033\010\001\002\000\004\002\007" +
    "\001\002\000\004\002\000\001\002\000\006\020\012\035" +
    "\013\001\002\000\006\007\022\017\021\001\002\000\004" +
    "\035\016\001\002\000\004\006\014\001\002\000\004\035" +
    "\015\001\002\000\006\007\ufffc\017\ufffc\001\002\000\004" +
    "\006\017\001\002\000\004\035\020\001\002\000\006\007" +
    "\ufffd\017\ufffd\001\002\000\004\007\110\001\002\000\004" +
    "\021\ufffa\001\002\000\004\021\025\001\002\000\004\030" +
    "\037\001\002\000\004\033\026\001\002\000\004\022\027" +
    "\001\002\000\004\004\030\001\002\000\004\012\035\001" +
    "\002\000\004\023\032\001\002\000\004\004\030\001\002" +
    "\000\004\034\034\001\002\000\004\030\ufff9\001\002\000" +
    "\012\023\uffea\031\uffea\032\uffea\034\uffea\001\002\000\004" +
    "\027\056\001\002\000\004\033\040\001\002\000\004\035" +
    "\042\001\002\000\004\034\054\001\002\000\004\006\046" +
    "\001\002\000\004\025\044\001\002\000\012\004\ufff7\026" +
    "\ufff7\034\ufff7\035\042\001\002\000\010\004\ufff6\026\ufff6" +
    "\034\ufff6\001\002\000\004\035\047\001\002\000\004\024" +
    "\050\001\002\000\004\004\051\001\002\000\004\010\053" +
    "\001\002\000\004\025\ufff5\001\002\000\004\025\uffeb\001" +
    "\002\000\004\027\ufff8\001\002\000\004\034\107\001\002" +
    "\000\004\033\057\001\002\000\004\026\062\001\002\000" +
    "\006\026\ufff1\034\ufff1\001\002\000\004\034\106\001\002" +
    "\000\010\013\067\014\070\015\071\001\002\000\006\026" +
    "\062\034\ufff3\001\002\000\006\026\ufff0\034\ufff0\001\002" +
    "\000\006\026\uffef\034\uffef\001\002\000\004\034\ufff2\001" +
    "\002\000\004\035\042\001\002\000\004\035\042\001\002" +
    "\000\004\035\042\001\002\000\006\026\uffec\034\uffec\001" +
    "\002\000\004\004\030\001\002\000\004\031\076\001\002" +
    "\000\006\026\uffed\034\uffed\001\002\000\004\004\077\001" +
    "\002\000\004\011\100\001\002\000\006\026\uffe9\034\uffe9" +
    "\001\002\000\004\004\030\001\002\000\004\032\104\001" +
    "\002\000\006\026\uffee\034\uffee\001\002\000\004\005\105" +
    "\001\002\000\006\026\uffe8\034\uffe8\001\002\000\004\034" +
    "\ufff4\001\002\000\006\002\ufffe\016\ufffe\001\002\000\004" +
    "\021\ufffb\001\002\000\004\002\uffff\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\107\000\006\002\005\003\003\001\001\000\006\002" +
    "\110\003\003\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\004\010\001\001\000\004\005" +
    "\022\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\006\023\001\001\000\004\007\035\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\020\030\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\020\032\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\012\054\001\001\000\002\001\001\000\006\010" +
    "\040\011\042\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\010\044\011\042\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\021\051\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\014\013\060\014\062\015\057\016\063\017" +
    "\064\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\014\013\065\014\062\015\057\016\063\017" +
    "\064\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\010\100\011\042\001\001\000\006\010" +
    "\072\011\042\001\001\000\006\010\071\011\042\001\001" +
    "\000\002\001\001\000\004\020\073\001\001\000\004\022" +
    "\074\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\020\101\001\001\000" +
    "\004\023\102\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // INICIO ::= RECETA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= RECETA INICIO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // RECETA ::= receta llave_abierta NOMBRE DESCRIPCION TIEMPO_RECETA INGREDIENTES PASOS llave_cerrada 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("RECETA",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // NOMBRE ::= nombre comilla ident_nombre comilla 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NOMBRE",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // NOMBRE ::= comilla ident_nombre comilla 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NOMBRE",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // DESCRIPCION ::= descripcion contenido_descripcion 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DESCRIPCION",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // DESCRIPCION ::= contenido_descripcion 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DESCRIPCION",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // TIEMPO_RECETA ::= tiempo llave_abierta total TIEMPO preparacion TIEMPO llave_cerrada 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIEMPO_RECETA",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // INGREDIENTES ::= ingredientes llave_abierta LISTA_INGREDIENTES llave_cerrada 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("INGREDIENTES",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // LISTA_INGREDIENTES ::= INGREDIENTE puntoycoma 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTA_INGREDIENTES",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // LISTA_INGREDIENTES ::= INGREDIENTE puntoycoma LISTA_INGREDIENTES 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTA_INGREDIENTES",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // INGREDIENTE ::= comilla ident_nombre comilla dospuntos CANTIDAD 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("INGREDIENTE",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // PASOS ::= pasos llave_abierta LISTA_PASOS llave_cerrada 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PASOS",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // LISTA_PASOS ::= PASO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTA_PASOS",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // LISTA_PASOS ::= PASO LISTA_PASOS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTA_PASOS",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // PASO ::= PASO_MOV 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PASO",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // PASO ::= PASO_COC 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PASO",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // PASO ::= PASO_PER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PASO",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // PASO_MOV ::= guion verbo_mov LISTA_INGREDIENTES TIEMPO VELOCIDAD 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PASO_MOV",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // PASO_COC ::= guion verbo_coc LISTA_INGREDIENTES TIEMPO TEMPERATURA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PASO_COC",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // PASO_PER ::= guion verbo_per LISTA_INGREDIENTES 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PASO_PER",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // CANTIDAD ::= numero unidad_cantidad 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CANTIDAD",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // TIEMPO ::= numero unidad_tiempo 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIEMPO",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // TEMPERATURA ::= temperatura numero unidad_temp 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TEMPERATURA",16, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // VELOCIDAD ::= velocidad digito_velocidad 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("VELOCIDAD",17, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
