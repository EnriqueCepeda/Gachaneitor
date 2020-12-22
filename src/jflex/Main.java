import java.io.*;
import java.io.FileInputStream;


class Main {

   private static Reader AbrirLector(String args[]) {
      Reader lector = null;

      if (args.length > 0) {
         try {
            lector = new InputStreamReader(new FileInputStream(args[0]), "UTF8");
            System.out.println(((InputStreamReader) lector).getEncoding());
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
      analex analizador = new analex(AbrirLector(args));
      analizador.yylex();
   }

}
