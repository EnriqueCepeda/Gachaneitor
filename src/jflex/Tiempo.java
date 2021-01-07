public class Tiempo {

    private Cantidad total;
    private Cantidad preparacion;

    public Tiempo(Cantidad total, Cantidad preparacion){
        this.total = total;
        this.preparacion = preparacion;
    }

    public Cantidad getTotal(){
        return this.total;
    }

    public Cantidad getPreparacion(){
        return this.preparacion;
    }
    
    public String toString(){
        return "\"total\": {"+this.total.toString()+"}, \"preparacion\": {"+this.preparacion.toString()+"}";
    }
    
}
