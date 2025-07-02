import java.util.List;  
import java.util.ArrayList;
/**
 * esta funcion representa un jugador del juego CAPITALIA
 */



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
    /**
     * Es el constructor del Jugador
     * @param id identificador del jugador
     * @param nombre es el nombre del jugador
     * @param dinero es el dienro del jugador
     * @param posicionActual es la posicion actual del jugador
     * @param estaEnCarcel es un booleano si esta o no en la carcel, falso si no esa en la carcel
     * @param totalCartasSalirCarcel es la cantidad de cartas que tiene para salir de al carcel
     */
    public Jugador(int id,String nombre,int dinero, int posicionActual, boolean estaEnCarcel, int totalCartasSalirCarcel){
        this.id=id;
        this.nombre=nombre;
        this.dinero=dinero;
        this.propiedades = new ArrayList<>(); 
        this.posicionActual=posicionActual;
        this.estaEnCarcel=estaEnCarcel;
        this.totalCartasSalirCarcel=totalCartasSalirCarcel;
    }
    //fin constructor
//METODOS
    //inicio de getters de todo
    /**
     *esta funcion devuelve el id del Jugador
     * @return id
     */
    public int getJugadorId(){
        return id;
    }
    /**
     * esta funcion devuelve el nombre del jugador
     * @return nombre
     */
    public String getJugadorNombre(){
        return nombre;
    }
    /**
     * esta funcion devuelve el dinero que posee el jugador
     * @return dinero
     */
    public int getJugadorDinero(){
        return dinero;
    }
    //deberia ser una lista?
    /**
     * esta funcion devuelve la lista de propiedades de los que el jugador es duenno
     * @return propiedades
     */
    public List<Propiedad> getJugadorPropiedades(){
        return propiedades;
    }
    /**
     * esta funcion devuelve la posicion actual del jugador
     * @return posicionActual
     */
    public int getJugadorPosicionActual(){
        return posicionActual;
    }
    /**
     * esta funcion obtiene el valor para saber si el jugador esta o no en la carcel
     * @return estaEnCarcel
     */
    public boolean getJugadorEstaEnCarcel(){
        return estaEnCarcel;
    }
    /**
     * esta funcion devuelve la cantidad de cartas que posee el jugador para salir gratis de la carcel
     * @return totalCartasSalirCarcel
     */
    public int getJugadorTotalCartasSalirCarcel(){
        return totalCartasSalirCarcel;
    }
    /**
     *  esta funcion es para poder mover al jugador, el cual puede avanzar o retroceder dependiendo de lo que el juego necesite
     * @param cantAvanzar
     */
    public void setJugadorSumaPosicion(int cantAvanzar){
        this.posicionActual=posicionActual+cantAvanzar;
         
    }
    //Reviasar aca para que agrege solo la id
    /**
     * esta funcion agrega una id de propiedad a la lista de propiedades del jugador
     * @param propiedad
     */
    public void setJugadorPropiedad(Propiedad propiedad){
    this.propiedades.add(propiedad);
    }
  
    //sirve para hacer cambio segun un monto
    /**
     * Esta funcion sirve para moficar el dinero que posee el jugador segun un monto que puede ser positivo o negativo
     * @param monto
     */
    public void jugadorCambioDinero(int monto){
        this.dinero=dinero+monto;

    }
     public void moverJugador(int posiciones) {
    this.posicionActual += posiciones;
    System.out.println("Jugador " + nombre + " avanza " + posiciones + " posiciones. Nueva posición: " + posicionActual);
     }
    /**
     * Esta funcion devuelve toda la inforamcion del jugador, o sea imprime todos los atrubutos
     * 
     * 
     */
    public void imprimirInformacionJugador(){
        //public Jugador(int id,String nombre,int dinero, List<Propiedad> propiedades, int posicionActual, boolean estaEnCarcel, int totalCartasSalirCarcel){
      System.out.println("El id Del jugador es:  " + getJugadorId());
        System.out.println("El nombre del jugador es:  "+getJugadorNombre() );
        System.out.println("El dinero del jugador es: "+ getJugadorDinero());
        System.out.println("La/s propiedade/s que pertenece/n al jugador es/son: "+ getJugadorPropiedades());
        System.out.println("El jugador se encuntra en la posicion: "+ getJugadorPosicionActual());
        //ponele un  if si alcanzas para que quede mas bonito
        System.out.println("¿El jugador esta en la carcel?: " + getJugadorEstaEnCarcel());
        System.out.println("Las cartas que tiene para salir de la carcel son: " + getJugadorTotalCartasSalirCarcel());
        System.out.println("-_-_-_-_-_-FIN DE LA INFORMACION DEL JUGADOR-_-_-_-_");
        System.out.println();
        System.out.println();
}




//fin metodos

//inico setter
    //mover jugador
   

//fin setter
}
