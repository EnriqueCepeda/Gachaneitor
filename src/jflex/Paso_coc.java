import java.util.ArrayList;

public class Paso_coc extends Paso{

    private Cantidad temperatura;

    public Paso_coc(String verbo, String tipoVerbo, ArrayList<Ingrediente> ingredientes, Cantidad temperatura){
        super(verbo, tipoVerbo, ingredientes);
        this.temperatura = temperatura;
    }

    public String toString(){
        return "";
    }

}