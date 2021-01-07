public class Cantidad{

    int cantidad;
    String unidad;

    public Cantidad(int cantidad, String unidad){
        this.cantidad = cantidad;
        this.unidad = unidad;
    }

    public String toString(){
        return "cantidad: "+this.cantidad+", unidad: "+this.unidad;
    }

}