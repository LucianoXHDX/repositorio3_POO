import java.util.ArrayList;
import java.util.List;

public class Main{
    private Juego juego;
    
    public static void main(String[] args) {
    Main mainJuego = new Main();
    mainJuego.mainIniciarJuego();
    mainJuego.moverJugadorMain();
   
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

        List<Propiedad> propiedades= new ArrayList<>();
        propiedades.add(new Propiedad(1,"Hola1",21,21,null,0,false));
        propiedades.add(new Propiedad(2,"Hola2",21,21,null,0,false));
        propiedades.add(new Propiedad(3,"Hola3",21,21,null,0,false));
        propiedades.add(new Propiedad(4,"Hola4",21,21,null,0,false));
        propiedades.add(new Propiedad(5,"Hola5",21,21,null,0,false));
        propiedades.add(new Propiedad(6,"Hola6",21,21,null,0,false));
        propiedades.add(new Propiedad(7,"Hola7",21,21,null,0,false));
        propiedades.add(new Propiedad(8,"Hola8",21,21,null,0,false));
        propiedades.add(new Propiedad(9,"Hola9",21,21,null,0,false));
        propiedades.add(new Propiedad(10,"Hola10",21,21,null,0,false));
        propiedades.add(new Propiedad(11,"Hola11",21,21,null,0,false));
        propiedades.add(new Propiedad(12,"Hola12",21,21,null,0,false));
        propiedades.add(new Propiedad(13,"Hola13",21,21,null,0,false));
        propiedades.add(new Propiedad(14,"Hola14",21,21,null,0,false));
        propiedades.add(new Propiedad(15,"Hola15",21,21,null,0,false));
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
        casillasEspeciales.add(new CasillaEspeciales(10, "Carcel", "Vas a la cárcel"));
        casillasEspeciales.add(new CasillaEspeciales(2, "Suerte", "Saca una carta de suerte"));
        casillasEspeciales.add(new CasillaEspeciales(5, "Comunidad", "Saca una carta de comunidad"));
        List<Carta> todasLasCartas = new ArrayList<>();
        todasLasCartas.addAll(cartasSuerte);
        todasLasCartas.addAll(cartasComunidad);
         //Tablero tablero = new Tablero(casillasEspeciales, propiedades, todasLasCartas);
        this.juego= new Juego(jugadores,1000000,2,null,3,3,3);
        //agrego como jugador inicial al primer jugad
        
        //juego agreagr jugadores modificara el turno actual
        juego.juegoAgregarJugadores();
        juego.setJuegoJugadorActual(juego.getJuegoListaJugadores().get(0));
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