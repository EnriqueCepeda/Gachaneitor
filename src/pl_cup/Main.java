import java.io.*;
import java.io.FileInputStream;
import java_cup.runtime.Symbol;

public class Main {

   static boolean do_debug_parse = false;

   public static Reader AbrirLector(String args[]) {
      Reader lector = null;

      if (args.length > 0) {
         try {
            lector = new InputStreamReader(new FileInputStream(args[0]), "UTF8");
         } catch (IOException exc) {
            System.err.println("Imposible abrir archivo '" + args[0] + "'");
            System.err.println("Causa: " + exc.getMessage());
            System.exit(1);
         }

         System.out.println("Leyendo archivo '" + args[0] + "'");
      } else {
         lector = new InputStreamReader(System.in);
         System.out.println("Leyendo entrada estándar (terminar con ctrl-d)");
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
         System.out.println("Análisis Correcto :D");
      } catch (Exception e) {
         //e.printStackTrace();
         System.out.println(e.getMessage());
         System.out.println("Análisis INCORRECTO!!");
      } finally {
         System.out.println("Fin del Análisis ");
      }
   }

}
