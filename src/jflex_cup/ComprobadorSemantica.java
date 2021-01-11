import java.util.ArrayList; 
import java.util.HashMap; 
import java.util.Map.Entry; 
import java.util.Set; 

class IngredienteNoUsadoException extends Exception{

    public IngredienteNoUsadoException(String mensaje){
        super(mensaje);
    }

    public IngredienteNoUsadoException(){
        super("Un ingrediente declarado no ha sido usado en la receta.");
    }

    public IngredienteNoUsadoException(ArrayList<String> ingredientes){
        super("Los ingredientes "+ingredientes+" no han sido usados en la receta.");
    }
}

class TiempoRecetaDistintoException extends Exception{

    public TiempoRecetaDistintoException(String mensaje){
        super(mensaje);
    }

    public TiempoRecetaDistintoException(){
        super("La suma de tiempos de los pasos no coincide con el tiempo total de la receta");
    }
}


class CantidadIngredienteExcedidaException extends Exception{

    public CantidadIngredienteExcedidaException(String mensaje){
        super(mensaje);
    }

    public CantidadIngredienteExcedidaException(){
        super("La cantidad usada supera a la declarada inicialmente para un ingrediente");
    }

    public CantidadIngredienteExcedidaException(Cantidad cantidadUsada, Cantidad cantidadDeclarada, Ingrediente ingrediente){
        super("La cantidad usada ("+cantidadUsada.getCantidad()+" "+cantidadUsada.getUnidad()+") supera a la declarada ("+cantidadDeclarada.getCantidad()+" "+cantidadDeclarada.getUnidad()+") inicialmente para el ingrediente "+ingrediente.getNombre());
    }
}

class IngredientesDistintaMagnitudException extends Exception {
    public IngredientesDistintaMagnitudException(String mensaje){
        super(mensaje);
    }

    public IngredientesDistintaMagnitudException(){
        super("Un ingrediente, repetido en la lista, está en dos unidades diferentes que no comparten magnitud, es decir, no se pueden sumar.");
    }

    public IngredientesDistintaMagnitudException(String unidad1, String unidad2, Ingrediente ingrediente){
        super("El ingrediente "+ingrediente.getNombre()+", repetido en la lista, está en dos unidades diferentes ("+unidad1+" y "+unidad2+") que no comparten magnitud y no se pueden sumar.");
    }
}

class UsoUnidadesDistintasException extends Exception{
    public UsoUnidadesDistintasException(String mensaje){
        super(mensaje);
    }

    public UsoUnidadesDistintasException(){
        super("Se han usado unidades distintas en la declaración y en el uso de un ingrediente.");
    }

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

}