//abstract?

public abstract class Carta{
    private int id;
    private String descripcion;
    private String nombre;
    public Carta(int id,String descripcion,String nombre){
        this.id=id;
        this.descripcion=descripcion;
        this.nombre=nombre;
    }
    public int getId(){
        return id;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public String getNombre(){
        return nombre;
    }
    //jugador va a mantener los metodos para que lso modifique
    public abstract void accion(Jugador jugador);
}