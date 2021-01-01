import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Receta {
    private String nombre;

    private HashMap<String, Integer> tiempo;
    private String descripcion;
    private HashMap<String, String> ingredientes;
    private HashMap<String, Boolean> ingredientes_usados;
    private ArrayList<HashMap> pasos;
    private int suma_tiempos = 0;

    public Receta() {
        nombre = "";
        tiempo = new HashMap<String, Integer>();
        descripcion = "";
        ingredientes = new HashMap<String, String>();
        ingredientes_usados = new HashMap<String, Boolean>();
        pasos = new ArrayList<HashMap>();
        suma_tiempos = 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<String, Integer> getTiempo() {
        return this.tiempo;
    }

    public void setTiempo(HashMap<String, Integer> tiempo) {
        this.tiempo = tiempo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public HashMap<String, String> getIngredientes() {
        return this.ingredientes;
    }

    public void setIngredientes(HashMap<String, String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public HashMap<String, Boolean> getIngredientesUsados() {
        return this.ingredientes_usados;
    }

    public void setIngredientesUsados(HashMap<String, Boolean> ingredientes_usados) {
        this.ingredientes_usados = ingredientes_usados;
    }

    public ArrayList<HashMap> getPasos() {
        return this.pasos;
    }

    public void setPasos(ArrayList<HashMap> pasos) {
        this.pasos = pasos;
    }

    public int getSumaTiempos() {
        return this.suma_tiempos;
    }

    public void setSumaTiempos(int suma_tiempos) {
        this.suma_tiempos = suma_tiempos;
    }

    public HashMap get_receta_dict() {
        HashMap dict = new HashMap<String, Object>();
        dict.put("nombre", this.nombre);
        dict.put("tiempo", this.tiempo);
        dict.put("descripcion", this.descripcion);
        dict.put("ingredientes", this.ingredientes);
        dict.put("pasos", this.pasos);
        return dict;
    }
}