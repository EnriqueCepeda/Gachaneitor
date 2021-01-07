public class Ingrediente {
    
    private String nombre;
    private Cantidad cantidad; 

    public Ingrediente(){
    }

    public Ingrediente(String nombre, Cantidad cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre(){
        return nombre;
    }

    public Cantidad getCantidad(){
        return cantidad;
    }

    public String toString(){
        return "\""+this.nombre+"\": {"+this.cantidad.toString()+"}";
    }

}
