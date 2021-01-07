import java.util.ArrayList;

public class Paso_mov extends Paso{

    private Integer velocidad;

    public Paso_mov(String verbo, String tipoVerbo, ArrayList<Ingrediente> ingredientes, Integer velocidad){
        super(verbo, tipoVerbo, ingredientes);
        this.velocidad = velocidad;
    }

    public String toString(){
        return "";
    }

}