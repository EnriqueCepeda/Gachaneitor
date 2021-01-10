import java.util.ArrayList; 
import java.util.HashMap; 
import java.util.Map.Entry; 
import java.util.Set; 

public class ComprobadorSemantica{

    public static ArrayList<Paso> comprobarPasos(ArrayList<Paso> pasos){
        for (int i = 0; i< pasos.size(); i++){
            System.out.println("Nuevo paso!: "+pasos.get(i).toString()); 
        }
        return null;
    }

    public static ArrayList<Ingrediente> comprobarIngredientes(ArrayList<Ingrediente> ingredientes){
        HashMap<String, Cantidad> ingredientes_anteriores = new HashMap<String, Cantidad>();
        for (Ingrediente ingrediente_actual : ingredientes){
            if (ingredientes_anteriores.get(ingrediente_actual.getNombre())==null){
                ingredientes_anteriores.put(ingrediente_actual.getNombre(), ingrediente_actual.getCantidad());
            }
            else{
                System.out.println("Este ingrediente ya estaba en la lista. Sumando cantidades...");
                try{
                    System.out.println(ingrediente_actual.getCantidad().toString());
                    Cantidad cantidad_estandarizada = ConversorUnidades.estandarizarCantidad(ingredientes_anteriores.get(ingrediente_actual.getNombre()), ingrediente_actual.getCantidad());
                    if (cantidad_estandarizada != null){
                        ingredientes_anteriores.put(ingrediente_actual.getNombre(), cantidad_estandarizada);
                    }
                    System.out.println(cantidad_estandarizada.toString());
                    }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
            
        }

        //Transforma el HashMap en un array de ingredientes
        Set<Entry<String, Cantidad>> entrySet = ingredientes_anteriores.entrySet(); 
        ArrayList<Entry<String, Cantidad>> listOfEntry = new ArrayList<Entry<String, Cantidad>>(entrySet);
        ArrayList<Ingrediente> ingredientes_estandarizados = new ArrayList<Ingrediente>();
        System.out.println("List of entry: "+listOfEntry.toString());
        for (int i = 0; i < listOfEntry.size(); i++){
            ingredientes_estandarizados.add(new Ingrediente(listOfEntry.get(i).getKey(), listOfEntry.get(i).getValue()));
            System.out.println("----------"+ingredientes_estandarizados.get(i).toString());
        }
        return ingredientes_estandarizados;
    }
}