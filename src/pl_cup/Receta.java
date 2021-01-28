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

    public Tiempo getTiempo(){
        return this.tiempo;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return this.ingredientes;
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
    
}