import java.util.ArrayList;

public class Paso_mov extends Paso{

    private Cantidad tiempo;
    private String velocidad;

    public Paso_mov(String verbo, String tipoVerbo, ArrayList<Ingrediente> ingredientes, Cantidad tiempo, String velocidad){
        super(verbo, tipoVerbo, ingredientes);
        this.tiempo = tiempo;
        this.velocidad = velocidad;
    }

    public Cantidad getTiempo(){
        return this.tiempo;
    }

    public String toString(){
        return super.toString()+", \"tiempo\": {"+this.tiempo+"}, \"velocidad\": \""+this.velocidad+"\"";
    }

}