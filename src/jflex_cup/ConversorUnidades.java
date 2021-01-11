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
    public static Cantidad estandarizarCantidad(Cantidad cantidadOriginal, Cantidad cantidadNueva) throws IngredientesDistintaMagnitudException {
        
        if (UNIDADES_MASA.contains(cantidadOriginal.getUnidad())) {
            if (!UNIDADES_MASA.contains(cantidadNueva.getUnidad())) {
                throw new IngredientesDistintaMagnitudException();
            } else {
                return estandarizar(UNIDADES_MASA, cantidadOriginal, cantidadNueva);
            }
        } else if (UNIDADES_VOLUMEN.contains(cantidadOriginal.getUnidad())) {
            if (!UNIDADES_VOLUMEN.contains(cantidadNueva.getUnidad())) {
                throw new IngredientesDistintaMagnitudException();
            } else {
                return estandarizar(UNIDADES_VOLUMEN, cantidadOriginal, cantidadNueva);
            }
        } else if (cantidadOriginal.getUnidad().equals("ud")) {
            if (!cantidadNueva.getUnidad().equals("ud")) {
                throw new IngredientesDistintaMagnitudException();
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
        return new Cantidad(cantidad, unidadMenor);
    }

    public static Cantidad estandarizarUnidadMenor(Cantidad cantidad){
        if (UNIDADES_MASA.contains(cantidad.getUnidad())) {
            return estandarizar(UNIDADES_MASA, cantidad, new Cantidad(0, "mg"));
        } else if (UNIDADES_VOLUMEN.contains(cantidad.getUnidad())){
            return estandarizar(UNIDADES_VOLUMEN, cantidad, new Cantidad(0, "ml"));
        }else{ //ud
            return cantidad;
        }
    }

    public static Cantidad estandarizarTiempo(Cantidad tiempo) {
        int num_estandarizado = tiempo.getCantidad();
        if (tiempo.getUnidad().equals("min")) {
            num_estandarizado *= 60;
        } else if (tiempo.getUnidad().equals("h")) {
            num_estandarizado *= 3600;
        }
        return new Cantidad(num_estandarizado, "seg");
    }

}
