import java.util.List;  

public class Jugador{
    //atributos
    private int id;
    private String nombre;
    private int dinero;
    private List<Propiedad> propiedades;
    private int posicionActual;
    private boolean estaEnCarcel;
    private int totalCartasSalirCarcel;
    //fin atributos
    //constructor
    public Jugador(int id,String nombre,int dinero, List<Propiedad> propiedades, int posicionActual, boolean estaEnCarcel, int totalCartasSalirCarcel){
        this.id=id;
        this.nombre=nombre;
        this.dinero=dinero;
        this.propiedades=propiedades;
        this.posicionActual=posicionActual;
        this.estaEnCarcel=estaEnCarcel;
        this.totalCartasSalirCarcel=totalCartasSalirCarcel;
    }
    //fin constructor
//METODOS
    //inicio de getters de todo
    public int getJugadorId(){
        return id;
    }
    //tal vez este no es necesario si no lo usas eliminalo
    public String getJugadorNombre(){
        return nombre;
    }
    public int getJugadorDinero(){
        return dinero;
    }
    public List<Propiedad> getJugadorPropiedades(){
        return propiedades;
    }
    public int getJugadorPosicionActual(){
        return posicionActual;
    }
    public boolean getJugadorEstaEnCarcel(){
        return estaEnCarcel;
    }
    public int getJugadorTotalCartasSalirCarcel(){
        return totalCartasSalirCarcel;
    }
    public void setJugadorSumaPosicion(int cantAvanzar){
        this.posicionActual=posicionActual+cantAvanzar;
    }
   public void moverJugador(int posiciones) {
    this.posicionActual += posiciones;
    System.out.println("Jugador " + nombre + " avanza " + posiciones + " posiciones. Nueva posición: " + posicionActual);
}
//fin metodos

//inico setter
    //mover jugador
   

//fin setter
}
