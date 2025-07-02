import java.util.ArrayList;
import java.util.List;
/**
 * Esta funcion es el main del juego, el cual se encargara de cordinar acciones para que el 
 * juego CAPITALIA, funcione correctamente
 */

public class Main{
    private Juego juego;
    
    public static void main(String[] args) {
    Main mainJuego = new Main();
    mainJuego.mainIniciarJuego();
    mainJuego.moverJugadorMain();
    mainJuego.juego.juegoComprarPropiedadJugador();
    mainJuego.juego.juegoComprarPropiedadJugador();
    mainJuego.juego.juegoComprarPropiedadJugador();
    mainJuego.juego.juegoComprarPropiedadJugador();
   
    //empezare un contador para el manejo de los turnos asi es una variable global y puedo usarla desde cualquie parte, lo pondra aca por mientra
    //pero podria sacarlo en algun momento 
    

}      

    
    public void mainIniciarJuego(){
        
        System.out.println("-_-_-_-_-_-_INICIANDO EL  JUEGO -_-_");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        //public Propiedad(int id, String nombre, int precio, int renta, Jugador duenno, int casas, boolean estaHipotecada){
        List<Jugador> jugadores=new ArrayList<>();
        /* private int id;
    private String nombre;
    private int dinero;
    private List<Propiedad> propiedades;
    private int posicionActual;
    private boolean estaEnCarcel;
    private int totalCartasSalirCarcel; */
        

        //esto corresponde al agragar propiedades
        //id corresponde a la posicion cosas especiales estaran en los multiplos de 5, el 0 es salida
        List<Propiedad> propiedades= new ArrayList<>();
        propiedades.add(new Propiedad(1,"Hola1",21,21,null,0,false));
        propiedades.add(new Propiedad(2,"Hola2",21,21,null,0,false));
        propiedades.add(new Propiedad(3,"Hola3",21,21,null,0,false));
        propiedades.add(new Propiedad(4,"Hola4",21,21,null,0,false));
        
        propiedades.add(new Propiedad(6,"Hola6",21,21,null,0,false));
        propiedades.add(new Propiedad(7,"Hola7",21,21,null,0,false));
        propiedades.add(new Propiedad(8,"Hola8",21,21,null,0,false));
        propiedades.add(new Propiedad(9,"Hola9",21,21,null,0,false));
        
        propiedades.add(new Propiedad(11,"Hola11",21,21,null,0,false));
        propiedades.add(new Propiedad(12,"Hola12",21,21,null,0,false));
        propiedades.add(new Propiedad(13,"Hola13",21,21,null,0,false));
        propiedades.add(new Propiedad(14,"Hola14",21,21,null,0,false));
        

        propiedades.add(new Propiedad(16,"Hola16",21,21,null,0,false));
        propiedades.add(new Propiedad(17,"Hola17",21,21,null,0,false));
        propiedades.add(new Propiedad(18,"Hola18",21,21,null,0,false));
        List<Carta> cartasSuerte=new ArrayList<>();
        cartasSuerte.add(new CartaSuerte(1,"carta1","HOLAS11"));
        cartasSuerte.add(new CartaSuerte(2,"carta2","HOLAS22"));
        cartasSuerte.add(new CartaSuerte(3,"carta3","HOLAS33"));
        cartasSuerte.add(new CartaSuerte(4,"carta4","HOLAS44"));
        List<Carta> cartasComunidad=new ArrayList<>();
        cartasComunidad.add(new CartaComunidad(1,"carta1","HOLAS1"));
        cartasComunidad.add(new CartaComunidad(2,"carta2","HOLAS2"));
        cartasComunidad.add(new CartaComunidad(3,"carta3","HOLAS3"));
        cartasComunidad.add(new CartaComunidad(4,"carta4","HOLAS4"));
         List<CasillaEspeciales> casillasEspeciales = new ArrayList<>();
        casillasEspeciales.add(new CasillaEspeciales(0, "Salida", "Casilla de inicio"));
        casillasEspeciales.add(new CasillaEspeciales(5, "Carcel", "Vas a la cárcel"));
        casillasEspeciales.add(new CasillaEspeciales(10, "Suerte", "Saca una carta de suerte"));
        casillasEspeciales.add(new CasillaEspeciales(15, "Comunidad", "Saca una carta de comunidad"));
        List<Carta> todasLasCartas = new ArrayList<>();
        todasLasCartas.addAll(cartasSuerte);
        todasLasCartas.addAll(cartasComunidad);
         //Tablero tablero = new Tablero(casillasEspeciales, propiedades, todasLasCartas);
         //ojo que los parametro de est ejuego estan inventado
        Tablero tablero = new Tablero(casillasEspeciales, propiedades, todasLasCartas);
        this.juego= new Juego(jugadores,1000000,2,null,3,3,3,tablero);
        //agrego como jugador inicial al primer jugad
        
        //juego agreagr jugadores modificara el turno actual
        juego.juegoAgregarJugadores();
        juego.juegoImprimirInformacion();
    

    }
    public void moverJugadorMain() {
        //debo ver el tema de que no se vaya a caer del mapa con el mood ojitoo
    System.out.println("-_-_-_-_-_-Prueba Mover jugador-_-_-");
    int resultadoDados = juego.juegoLanzarDado();
    Jugador jugadorAMover=juego.getJuegoJugadorActual();
    jugadorAMover.moverJugador(resultadoDados);
    }      


   
}
    
