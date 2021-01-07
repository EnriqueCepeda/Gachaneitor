import java.util.ArrayList;

public class Recetas {

    private ArrayList<Receta> recetas;

    public Recetas() {
        this.recetas = new ArrayList<Receta>();
    }

    public Recetas(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }

    public ArrayList<Receta> getRecetas() {
        return this.recetas;
    }

    public void setRecetas(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }

    public String toString() {
        String str = "[";
        for (int i = 0; i< recetas.size(); i++){
            str = str + recetas.get(i).toString()+", ";
        }
        str = str + recetas.get(recetas.size()-1).toString() + "]";
        return str;
    }
}