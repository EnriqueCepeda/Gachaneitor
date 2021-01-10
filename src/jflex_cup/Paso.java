import java.util.ArrayList;

public class Paso {

    protected String verbo;
    protected String tipoVerbo;
    protected ArrayList<Ingrediente> ingredientes;

    public Paso(String verbo, String tipoVerbo, ArrayList<Ingrediente> ingredientes){
        this.verbo = verbo;
        this.tipoVerbo = tipoVerbo;
        this.ingredientes = ingredientes;
    }

    public String toString(){
        String str = "\"ingredientes\": {";
        for (int i = 0; i<ingredientes.size()-1; i++){
            str = str + ingredientes.get(i).toString()+ ", ";
        }
        str = str + ingredientes.get(ingredientes.size()-1).toString();
        str = str + "}, \"verbo\": \""+this.verbo+"\", \"tipo_verbo\": \""+this.tipoVerbo+"\"";
        return str;
    }
    
}