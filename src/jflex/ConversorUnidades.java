import java.util.Arrays;
import java.lang.*;

public class ConversorUnidades {

    String[] UNIDADES_MASA = { "mg", "g", "kg" };
    String[] UNIDADES_VOLUMEN = { "ml", "l" };
    String[] UNIDADES_TIEMPO = { "seg", "min", "h" };

    /**
     * Estandariza una unidad a su medida más granular. por ejemplo, litros a
     * mililitros o kg a miligramos
     */
    public String estandarizarCantidad(int cantidad_original, int cantidad_nueva, String unidad_original,
            String unidad_nueva) throws Exception {
        if (Arrays.asList(UNIDADES_MASA).contains(cantidad_original)) {
            if (!Arrays.asList(UNIDADES_MASA).contains(cantidad_nueva)) {
                throw new Exception();
            } else {
                return estandarizar(UNIDADES_MASA, cantidad_original, cantidad_nueva, unidad_original, unidad_nueva);
            }
        } else if (Arrays.asList(UNIDADES_VOLUMEN).contains(cantidad_original)) {
            if (!Arrays.asList(UNIDADES_VOLUMEN).contains(cantidad_nueva)) {
                throw new Exception();
            } else {
                return estandarizar(UNIDADES_VOLUMEN, cantidad_original, cantidad_nueva, unidad_original, unidad_nueva);
            }
        } else if (unidad_original == "ud") {
            if (unidad_nueva != "ud") {
                throw new Exception();
            } else {
                // de momento pasarlo en string
                return (cantidad_original + cantidad_nueva) + " ud";
            }
        }

        return null;
    }

    public String estandarizar(String[] lista_unidades, int cantidad_original, int cantidad_nueva,
            String unidad_original, String unidad_nueva) {
        int diferencia = Arrays.asList(lista_unidades).indexOf(unidad_original)
                - Arrays.asList(lista_unidades).indexOf(unidad_nueva);
        String unidad_menor;
        double factor_conv, cantidad;
        if (diferencia >= 0) {
            unidad_menor = unidad_nueva;
            factor_conv = 1000 ^ diferencia;
            cantidad = cantidad_nueva + cantidad_original + factor_conv;
        } else {
            unidad_menor = unidad_original;
            factor_conv = 1000 ^ Math.abs(diferencia);
            cantidad = cantidad_original + cantidad_nueva + factor_conv;
        }
        // De momento string ??
        return (cantidad + " " + unidad_menor);
    }

    public String estandarizarTiempo(int numero, String unidad_tiempo) {
        int num_estandarizado = numero;
        if (unidad_tiempo == "min") {
            num_estandarizado = numero * 60;
        } else if (unidad_tiempo == "h") {
            num_estandarizado = numero * 3600;
        }

        return (num_estandarizado + " seg");

    }

}
