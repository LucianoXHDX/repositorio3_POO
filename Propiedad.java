public class Propiedad{
    private int id;
    private String nombre;
    private int precio;
    private int renta;
    private Jugador duenno;
    private int casas; //siguiendo la logica de laboratorios anteriores estan seran un numero
    private boolean estaHipotecada;
    //constructor
    public Propiedad(int id, String nombre, int precio, int renta, Jugador duenno, int casas, boolean estaHipotecada){
        this.id=id;
        this.nombre=nombre;
        this.precio=precio;
        this.renta=renta;
        this.duenno=duenno;
        this.casas=casas;
        this.estaHipotecada=estaHipotecada;
    }
    //getter correspondiente
    public int getId(){
        return id;
    }

}
