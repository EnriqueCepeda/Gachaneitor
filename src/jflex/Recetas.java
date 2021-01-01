import java.util.HashMap;
import java.util.ArrayList;

public class Recetas {

    private ArrayList<HashMap> recetas;

    public Recetas() {
        this.recetas = new ArrayList<HashMap>();
    }

    public Recetas(ArrayList<HashMap> recetas) {
        this.recetas = recetas;
    }

    public ArrayList<HashMap> getRecetas() {
        return this.recetas;
    }

    public void setRecetas(ArrayList<HashMap> recetas) {
        this.recetas = recetas;
    }

    public void prueba() {
        System.out.println("Hello world!");
    }
}