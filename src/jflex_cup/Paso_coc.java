import java.util.ArrayList;

public class Paso_coc extends Paso{

    private Cantidad tiempo;
    private Cantidad temperatura;

    public Paso_coc(String verbo, String tipoVerbo, ArrayList<Ingrediente> ingredientes, Cantidad tiempo, Cantidad temperatura){
        super(verbo, tipoVerbo, ingredientes);
        this.tiempo = tiempo;
        this.temperatura = temperatura;
    }

    public Cantidad getTiempo(){
        return this.tiempo;
    }

    public String toString(){
        return super.toString()+", \"tiempo\": {"+this.tiempo+"}, \"temperatura\": {"+this.temperatura+"}";
    }

}