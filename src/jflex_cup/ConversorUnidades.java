import java.util.ArrayList;
import java.util.Arrays;
import java.lang.*;

public class ConversorUnidades {

    static ArrayList<String> UNIDADES_MASA = new ArrayList<String>(Arrays.asList("mg", "g", "kg"));
    static ArrayList<String> UNIDADES_VOLUMEN = new ArrayList<String>(Arrays.asList("ml", "l"));
    static ArrayList<String> UNIDADES_TIEMPO = new ArrayList<String>(Arrays.asList("seg", "min", "h"));

    /**
     * Estandariza una unidad a su medida más granular. por ejemplo, litros a
     * mililitros o kg a miligramos
     */
    public static Cantidad estandarizarCantidad(Cantidad cantidadOriginal, Cantidad cantidadNueva) throws Exception {
        
        if (UNIDADES_MASA.contains(cantidadOriginal.getUnidad())) {
            if (!UNIDADES_MASA.contains(cantidadNueva.getUnidad())) {
                throw new Exception("Las cantidades del ingrediente no son de la misma magnitud.");
            } else {
                return estandarizar(UNIDADES_MASA, cantidadOriginal, cantidadNueva);
            }
        } else if (UNIDADES_VOLUMEN.contains(cantidadOriginal.getUnidad())) {
            if (!UNIDADES_VOLUMEN.contains(cantidadNueva.getUnidad())) {
                throw new Exception("Las cantidades del ingrediente no son de la misma magnitud.");
            } else {
                return estandarizar(UNIDADES_VOLUMEN, cantidadOriginal, cantidadNueva);
            }
        } else if (cantidadOriginal.getUnidad() == "ud") {
            if (cantidadNueva.getUnidad() != "ud") {
                throw new Exception("Las cantidades del ingrediente no son de la misma magnitud.");
            } else {
                return new Cantidad((cantidadOriginal.getCantidad() + cantidadNueva.getCantidad()), "ud");
            }
        }

        return null;
    }

    public static Cantidad estandarizar(ArrayList<String> lista_unidades, Cantidad cantidadOriginal, Cantidad cantidadNueva) {
        int diferencia = lista_unidades.indexOf(cantidadOriginal.getUnidad()) - lista_unidades.indexOf(cantidadNueva.getUnidad());
        String unidadMenor;
        int cantidad, factorConv;
        if (diferencia >= 0) {
            unidadMenor = cantidadNueva.getUnidad();
            factorConv = (int)Math.pow(1000,diferencia);
            cantidad = cantidadNueva.getCantidad() + (cantidadOriginal.getCantidad() * factorConv);
        } else {            
            unidadMenor = cantidadOriginal.getUnidad();
            factorConv = (int)Math.pow(1000,Math.abs(diferencia));
            cantidad = cantidadOriginal.getCantidad() + (cantidadNueva.getCantidad() * factorConv);
        }
        System.out.println("diferencia: "+diferencia);
        System.out.println("Factor de conv: "+factorConv);
        return new Cantidad(cantidad, unidadMenor);
    }

    public static Cantidad estandarizarTiempo(Cantidad tiempo) {
        int num_estandarizado = tiempo.getCantidad();
        if (tiempo.getUnidad() == "min") {
            num_estandarizado *= 60;
        } else if (tiempo.getUnidad() == "h") {
            num_estandarizado *= 3600;
        }
        return new Cantidad(num_estandarizado, "seg");
    }

    public static void prueba(){
        System.out.println("Holaaaaaaaaaaaaaaaaa Enrique me estresas");
    }

}
