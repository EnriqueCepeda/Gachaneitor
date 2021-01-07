import java.util.ArrayList;

public class Receta {
    private String nombre;
    private Tiempo tiempo;
    private String descripcion;
    private ArrayList<Ingrediente> ingredientes;
    private ArrayList<Ingrediente> ingredientes_usados;
    private ArrayList<Paso> pasos;
    //private int suma_tiempos = 0;

    public Receta(String nombre, String descripcion, Tiempo tiempo, ArrayList<Ingrediente> ingredientes, ArrayList<Paso> pasos) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.descripcion = descripcion;
        this.ingredientes = ingredientes;
        this.ingredientes_usados = null;
        this.pasos = pasos;
        //suma_tiempos = 0;
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

    /*public int getSumaTiempos() {
        return this.suma_tiempos;
    }

    public void setSumaTiempos(int suma_tiempos) {
        this.suma_tiempos = suma_tiempos;
    }*/

    public String ingredientesToString(){
        String str = "";
        for (int i = 0; i<this.ingredientes.size()-1; i++){
            str = str + this.ingredientes.get(i).toString()+ ", ";
        }
        str = str + this.ingredientes.get(this.ingredientes.size()-1).toString();
        return str; 
    }

    public String pasosToString(){
        String str = "";
        for (int i = 0; i<this.pasos.size()-1; i++){
            str = str + "{"+this.pasos.get(i).toString()+ "}, ";
        }
        str = str + "{" +this.pasos.get(this.pasos.size()-1).toString()+"}";
        return str;
    }

    public String toString() {
        return "{\"nombre\": \""+this.nombre+"\", \"tiempo\": {"+this.tiempo.toString()+"}, \"descripcion\": \""+this.descripcion+"\", \"ingredientes\": {"+ingredientesToString()+"}, \"pasos\": ["+pasosToString()+"]}";
    }
}