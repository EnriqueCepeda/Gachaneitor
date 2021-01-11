import java.util.ArrayList;
import java.util.HashMap;

public class Receta {
    private String nombre;
    private Tiempo tiempo;
    private String descripcion;
    private ArrayList<Ingrediente> ingredientes;
    private ArrayList<Ingrediente> ingredientes_usados;
    private ArrayList<Paso> pasos;

    public Receta(String nombre, String descripcion, Tiempo tiempo, ArrayList<Ingrediente> ingredientes, ArrayList<Paso> pasos) throws CantidadIngredienteExcedidaException, UsoUnidadesDistintasException, IngredienteNoUsadoException, TiempoRecetaDistintoException, IngredientesDistintaMagnitudException {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.descripcion = descripcion;
        this.ingredientes = ingredientes;
        this.ingredientes_usados = null;
        this.pasos = pasos;
        comprobarTiemposTotalesParciales();
        comprobarIngredientesUsados();
        comprobarCantidadesUsadas();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Ingrediente> getIngredientesUsados() {
        return this.ingredientes_usados;
    }

    public void setIngredientesUsados(ArrayList<Ingrediente> ingredientes_usados) {
        this.ingredientes_usados = ingredientes_usados;
    }

    public ArrayList<Paso> getPasos() {
        return this.pasos;
    }

    public void setPasos(ArrayList<Paso> pasos) {
        this.pasos = pasos;
    }

    public String ingredientesToString(){
        String str = "";
        for (int i = 0; i<this.ingredientes.size()-1; i++){
            str = str + this.ingredientes.get(i)+ ", ";
        }
        str = str + this.ingredientes.get(this.ingredientes.size()-1);
        return str; 
    }

    public String pasosToString(){
        String str = "";
        for (int i = 0; i<this.pasos.size()-1; i++){
            str = str + "{"+this.pasos.get(i)+ "}, ";
        }
        str = str + "{" +this.pasos.get(this.pasos.size()-1)+"}";
        return str;
    }

    public String toString() {
        return "{\"nombre\": \""+this.nombre+"\", \"tiempo\": {"+this.tiempo+"}, \"descripcion\": \""+this.descripcion+"\", \"ingredientes\": {"+ingredientesToString()+"}, \"pasos\": ["+pasosToString()+"]}";
    }

    public static HashMap<String, Cantidad> ingredientesArrayListToHashMap(ArrayList<Ingrediente> ingredientesAL){
        HashMap<String, Cantidad> ingredientesHM = new HashMap<String, Cantidad>();
        for (Ingrediente ingrediente: ingredientesAL){
            ingredientesHM.put(ingrediente.getNombre(), ingrediente.getCantidad());
        }
        return ingredientesHM;
    }

    public void comprobarTiemposTotalesParciales() throws TiempoRecetaDistintoException{
        int tiempoTotalEstandarizado = ConversorUnidades.estandarizarTiempo(tiempo.getTotal()).getCantidad();
        int sumaTiemposParciales = 0; 
        for (Paso paso: this.pasos){
            if (paso instanceof Paso_mov){
                sumaTiemposParciales += ConversorUnidades.estandarizarTiempo(((Paso_mov)paso).getTiempo()).getCantidad();
            }else if (paso instanceof Paso_coc){
                sumaTiemposParciales += ConversorUnidades.estandarizarTiempo(((Paso_coc)paso).getTiempo()).getCantidad();
            }
        }
        if (tiempoTotalEstandarizado != sumaTiemposParciales){
            throw new TiempoRecetaDistintoException();
        }
    }

    public void comprobarIngredientesUsados() throws IngredienteNoUsadoException, IngredientesDistintaMagnitudException{
        HashMap<String, Cantidad> ingredientesUsados = ComprobadorSemantica.anotarIngredientesUsados(this.pasos);
        ArrayList<String> ingredientesNoUsados = new ArrayList<String>();
        for (Ingrediente ingrediente: this.ingredientes){
            if (ingredientesUsados.get(ingrediente.getNombre())==null){
                ingredientesNoUsados.add(ingrediente.getNombre());
            }
        }
        if (! ingredientesNoUsados.isEmpty())
            throw new IngredienteNoUsadoException(ingredientesNoUsados);
    }

    public void comprobarCantidadesUsadas() throws CantidadIngredienteExcedidaException, UsoUnidadesDistintasException, IngredientesDistintaMagnitudException{
        HashMap<String, Cantidad> ingredientesUsados = ComprobadorSemantica.anotarIngredientesUsados(this.pasos);
        HashMap<String, Cantidad> ingredientesDeclarados = ingredientesArrayListToHashMap(this.ingredientes);
        for (Paso paso: this.pasos){
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
}