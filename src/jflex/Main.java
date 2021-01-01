import java.io.*;
import java.io.FileInputStream;
import java_cup.runtime.Symbol;

class Main {

   static boolean do_debug_parse = false;

   private static Reader AbrirLector(String args[]) {
      Reader lector = null;

      if (args.length > 0) {
         try {
            lector = new InputStreamReader(new FileInputStream(args[0]), "UTF8");
         } catch (IOException exc) {
            System.err.println("imposible abrir archivo '" + args[0] + "'");
            System.err.println("causa: " + exc.getMessage());
            System.exit(1);
         }

         System.out.println("leyendo archivo '" + args[0] + "'");
      } else {
         lector = new InputStreamReader(System.in);
         System.out.println("leyendo entrada estándard (terminar con ctrl-d)");
      }

      return lector;
   }

   /***************************************************************************/

   public static void main(String args[]) throws IOException {
      /*
       * analex analizador = new analex(AbrirLector(args)); analizador.yylex();
       */

      parser parser_obj = new parser(new analex(AbrirLector(args)));

      Symbol parse_tree = null;

      try {
         if (do_debug_parse)
            parse_tree = parser_obj.debug_parse();
         else
            parse_tree = parser_obj.parse();
         System.out.println(" Todo OK mis panas!!");
      } catch (Exception e) {
         System.out.println(" Analisis INCORRECTO !!");
      } finally {
         System.out.println("Fin del AnÃ¡lisis ");
      }
   }

}
