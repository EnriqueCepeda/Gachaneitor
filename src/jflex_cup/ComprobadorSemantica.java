import java.util.ArrayList; 
import java.util.HashMap; 
import java.util.Map.Entry; 
import java.util.Set; 

class IngredienteNoUsadoException extends Exception{

    public IngredienteNoUsadoException(ArrayList<String> ingredientes){
        super("Los ingredientes "+ingredientes+" no han sido usados en la receta.");
    }
}

class TiempoRecetaDistintoException extends Exception{

    public TiempoRecetaDistintoException(int tiempoTotal, int sumaPasos){
        super("La suma de tiempos de los pasos ("+sumaPasos+") no coincide con el tiempo total ("+tiempoTotal+") de la receta");
    }
}


class CantidadIngredienteExcedidaException extends Exception{

    public CantidadIngredienteExcedidaException(Cantidad cantidadUsada, Cantidad cantidadDeclarada, Ingrediente ingrediente){
        super("La cantidad usada ("+cantidadUsada.getCantidad()+" "+cantidadUsada.getUnidad()+") supera a la declarada ("+cantidadDeclarada.getCantidad()+" "+cantidadDeclarada.getUnidad()+") inicialmente para el ingrediente "+ingrediente.getNombre());
    }
}

class IngredientesDistintaMagnitudException extends Exception {

    public IngredientesDistintaMagnitudException(){
        super();
    }

    public IngredientesDistintaMagnitudException(String unidad1, String unidad2, Ingrediente ingrediente){
        super("El ingrediente "+ingrediente.getNombre()+", repetido en la lista, está en dos unidades diferentes ("+unidad1+" y "+unidad2+") que no comparten magnitud y no se pueden sumar.");
    }
}

class UsoUnidadesDistintasException extends Exception{

    public UsoUnidadesDistintasException(Cantidad cantidadUsada, Cantidad cantidadDeclarada, String nombreIngrediente){
        super("La unidad usada ("+cantidadUsada.getUnidad()+") no coincide con la declarada ("+cantidadDeclarada.getUnidad()+") en el ingrediente "+nombreIngrediente);
    }
}

public class ComprobadorSemantica{

    public static ArrayList<Ingrediente> comprobarDefinicionIngredientes(ArrayList<Ingrediente> ingredientes) throws IngredientesDistintaMagnitudException{
        HashMap<String, Cantidad> ingredientes_anteriores = new HashMap<String, Cantidad>();
        for (Ingrediente ingrediente_actual : ingredientes){
            if (ingredientes_anteriores.get(ingrediente_actual.getNombre())==null){
                ingredientes_anteriores.put(ingrediente_actual.getNombre(), ingrediente_actual.getCantidad());
            }
            else{
                System.out.println("Este ingrediente ya estaba en la lista. Sumando cantidades...");
                try{
                    Cantidad cantidad_estandarizada = ConversorUnidades.estandarizarCantidad(ingredientes_anteriores.get(ingrediente_actual.getNombre()), ingrediente_actual.getCantidad());
                    ingredientes_anteriores.put(ingrediente_actual.getNombre(), cantidad_estandarizada);
                }catch(IngredientesDistintaMagnitudException e){
                    throw new IngredientesDistintaMagnitudException(ingredientes_anteriores.get(ingrediente_actual.getNombre()).getUnidad(), ingrediente_actual.getCantidad().getUnidad(), ingrediente_actual);
                }
            }
            
        }

        //Transforma el HashMap en un array de ingredientes
        Set<Entry<String, Cantidad>> entrySet = ingredientes_anteriores.entrySet(); 
        ArrayList<Entry<String, Cantidad>> listOfEntry = new ArrayList<Entry<String, Cantidad>>(entrySet);
        ArrayList<Ingrediente> ingredientes_estandarizados = new ArrayList<Ingrediente>();
        for (int i = 0; i < listOfEntry.size(); i++){
            ingredientes_estandarizados.add(new Ingrediente(listOfEntry.get(i).getKey(), listOfEntry.get(i).getValue()));
        }
        return ingredientes_estandarizados;
    }

    public static HashMap<String, Cantidad> anotarIngredientesUsados(ArrayList<Paso> pasos) throws IngredientesDistintaMagnitudException{
        HashMap<String, Cantidad> ingredientesUsados = new HashMap<String, Cantidad>(); 
        for (Paso paso: pasos){
            ArrayList<Ingrediente> ingredientes = paso.getIngredientes();
            for (Ingrediente ingrediente: ingredientes){
                if (ingredientesUsados.get(ingrediente) != null){
                    Cantidad cantidadEstandarizada = ConversorUnidades.estandarizarCantidad(ingredientesUsados.get(ingrediente.getNombre()), ingrediente.getCantidad());
                    ingredientesUsados.put(ingrediente.getNombre(), cantidadEstandarizada);
                }else{
                    ingredientesUsados.put(ingrediente.getNombre(), ingrediente.getCantidad());
                }
            }
        }
        return ingredientesUsados;
    }

    public static void comprobarReceta(Receta receta) throws CantidadIngredienteExcedidaException, TiempoRecetaDistintoException, UsoUnidadesDistintasException, IngredienteNoUsadoException, IngredientesDistintaMagnitudException{
        comprobarTiemposTotalesParciales(receta.getTiempo(), receta.getPasos());
        comprobarIngredientesUsados(receta.getIngredientes(), receta.getPasos());
        comprobarCantidadesUsadas(receta.getIngredientes(), receta.getPasos());
    }

    
    public static void comprobarTiemposTotalesParciales(Tiempo tiempo, ArrayList<Paso> pasos) throws TiempoRecetaDistintoException{
        int tiempoTotalEstandarizado = ConversorUnidades.estandarizarTiempo(tiempo.getTotal()).getCantidad();
        int sumaTiemposParciales = 0; 
        for (Paso paso: pasos){
            if (paso instanceof Paso_mov){
                sumaTiemposParciales += ConversorUnidades.estandarizarTiempo(((Paso_mov)paso).getTiempo()).getCantidad();
            }else if (paso instanceof Paso_coc){
                sumaTiemposParciales += ConversorUnidades.estandarizarTiempo(((Paso_coc)paso).getTiempo()).getCantidad();
            }
        }
        if (tiempoTotalEstandarizado != sumaTiemposParciales){
            throw new TiempoRecetaDistintoException(tiempoTotalEstandarizado, sumaTiemposParciales);
        }
    }

    public static void comprobarIngredientesUsados(ArrayList<Ingrediente> ingredientes, ArrayList<Paso> pasos) throws IngredienteNoUsadoException, IngredientesDistintaMagnitudException{
        HashMap<String, Cantidad> ingredientesUsados = ComprobadorSemantica.anotarIngredientesUsados(pasos);
        ArrayList<String> ingredientesNoUsados = new ArrayList<String>();
        for (Ingrediente ingrediente: ingredientes){
            if (ingredientesUsados.get(ingrediente.getNombre())==null){
                ingredientesNoUsados.add(ingrediente.getNombre());
            }
        }
        if (! ingredientesNoUsados.isEmpty())
            throw new IngredienteNoUsadoException(ingredientesNoUsados);
    }

    public static void comprobarCantidadesUsadas(ArrayList<Ingrediente> ingredientes, ArrayList<Paso> pasos) throws CantidadIngredienteExcedidaException, UsoUnidadesDistintasException, IngredientesDistintaMagnitudException{
        HashMap<String, Cantidad> ingredientesUsados = ComprobadorSemantica.anotarIngredientesUsados(pasos);
        HashMap<String, Cantidad> ingredientesDeclarados = ingredientesArrayListToHashMap(ingredientes);
        for (Paso paso: pasos){
            ArrayList<Ingrediente> ingredientesPaso = paso.getIngredientes();
            for (Ingrediente ingrediente: ingredientesPaso){
                Cantidad cantidadEstandarizadaUsada = ConversorUnidades.estandarizarUnidadMenor(ingredientesUsados.get(ingrediente.getNombre()));
                Cantidad cantidadEstandarizadaDeclarada = ConversorUnidades.estandarizarUnidadMenor(ingredientesDeclarados.get(ingrediente.getNombre()));
                if (!cantidadEstandarizadaUsada.getUnidad().equals(cantidadEstandarizadaDeclarada.getUnidad())) {
                    throw new UsoUnidadesDistintasException(ingredientesUsados.get(ingrediente.getNombre()), ingredientesDeclarados.get(ingrediente.getNombre()), ingrediente.getNombre());
                }
                if (cantidadEstandarizadaUsada.getCantidad() > cantidadEstandarizadaDeclarada.getCantidad()){
                    throw new CantidadIngredienteExcedidaException(ingredientesUsados.get(ingrediente.getNombre()),ingredientesDeclarados.get(ingrediente.getNombre()), ingrediente);
                }
            }
        }
    }

    public static HashMap<String, Cantidad> ingredientesArrayListToHashMap(ArrayList<Ingrediente> ingredientesAL){
        HashMap<String, Cantidad> ingredientesHM = new HashMap<String, Cantidad>();
        for (Ingrediente ingrediente: ingredientesAL){
            ingredientesHM.put(ingrediente.getNombre(), ingrediente.getCantidad());
        }
        return ingredientesHM;
    }
    

}