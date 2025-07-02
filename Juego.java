import java.util.List;  
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * esta clase es la representacion del juego CAPITALIA aca se cordinan algunas clases para simular el juego
 */
public class Juego{
    //lista de jugadores
    //comenta funcion: comentar metodos
    private List<Jugador> jugadores;
    private int dineroBanco;
    private int cantidadDados;
    private Jugador jugadorActual;
    private int tasaImpuesto;
    private int maximoCasas;
    private int maximoHoteles;
    //esto es para poder trabajar de forma simple con los de tablero
    private Tablero tablero;

    //con esto puedo controlar los turno desde cualquier parte
    private int contadorDeTurnoJugados=0;


    //comenta funcion:
    /**
     * Es el contructor de la clase Juego
     * @param jugadores es una lista de Jugador, que representa a los jugadores del juego
     * @param dineroBanco es el dinero del banco
     * @param cantidadDados es la cantidad de dados que se usaran para la partida
     * @param jugadorActual es el jugador al cual le toca el jugar, es de tipo Jugador
     * @param tasaImpuesto es la tasa de impuesto del juego
     * @param maximoCasas es el maximo de casas del juego en este caso 4
     * @param maximoHoteles es el maximo de hoteles del juego
     * @param tablero es el tablero del juego de tipo Tablero
     */
    public Juego(List<Jugador> jugadores,int dineroBanco, int cantidadDados,Jugador jugadorActual, int tasaImpuesto, int maximoCasas, int maximoHoteles,Tablero tablero){
        this.jugadores=jugadores;
        this.dineroBanco=dineroBanco;
        this.cantidadDados=cantidadDados;
        this.jugadorActual=jugadorActual;
        this.tasaImpuesto=tasaImpuesto;
        this.maximoCasas=maximoCasas;
        this.maximoHoteles=maximoHoteles;
        this.tablero=tablero;
    }
    /**
     * esta funcion permite quitarle dinero al banco, el valor se pasa positivo ya que en el juego el banco nunca gana dinero
     * @param cantDisminuir
     */
    public void juegoDismunirDineroBanco(int cantDisminuir){
        //aca podrias comprobar si el banco tiene el dinero suficiente  
        this.dineroBanco=dineroBanco-cantDisminuir;
    }



    //comenta funcion:
    /**
     * esta funcion entrega la lista de jugadores del juego
     * @return jugadores
     */
    public List<Jugador> getJuegoListaJugadores(){
        return jugadores;
    }
    //comenta funcion:
    /**
     * esta funcion devulve el dinero del banco 
     * @return dineroBanco
     */
    public int getJuegoDineroBanco(){
        return dineroBanco;
    }
    //comenta funcion:
    /**
     * esta funcion devuelve el numero de dados del juego
     * @return cantidadDados
     */
    public int getJuegoNumeroDados(){
        return cantidadDados;
    }
    //comenta funcion:
    //esta funcion se propcupa de los controlar quien va en tunro
    /**
     * Esta funcion nos devuelve el jugador actual, osea el jugador que esta en turno
     * @return Jugador
     */
    public Jugador getJuegoJugadorActual() {
    List<Jugador> listaJugadores = getJuegoListaJugadores();
    int cantJugadores = listaJugadores.size();
    int indexacionJugadorActual = contadorDeTurnoJugados % cantJugadores;   
    return listaJugadores.get(indexacionJugadorActual);
    }


    //comenta funcion:
    /**
     * esta funcion nos devuelve la taza de impuesto
     * 
     * @return tasaImpuesto
     */
    public int getJuegoTasaImpuesto(){
        return tasaImpuesto;
    }
   
    //comenta funcion:
    /**
     * esta funcion entrega la cantidad maxima de hoteles del juego
     * @return maximoHoteles
     */
    public int getJuegoMaximoHoteles(){
        return maximoHoteles;
    }
    /**
     * se cre un Random para ser usado mas adelante con los dados
     */
    private Random random = new Random();
    /**
     * esta funcion devuelve el numero del contador de turno, es util en funciones mas adelante
     * @return contadorDeTurnoJugados
     */
    public int getJuegoContadorTurnos(){
        return contadorDeTurnoJugados;
    }

    
    /**
     * esta funcion nos permite sumar uno al contador de turno
     */
    public void aumentarContadorTurnos(){
        this.contadorDeTurnoJugados=contadorDeTurnoJugados+1;
    }
    /**
     * esta funcion configura el jugador actual del juego a uno que nosotros le pasemos
     * @param jugadorActual
     */
    public void setJuegoJugadorActual(Jugador jugadorActual) {
    this.jugadorActual = jugadorActual;
}
    //comenta funcion:
    /**
     * esta funcion imprime la informacion relevante del juego
     * 
     */
    public void juegoImprimirInformacion(){
        System.out.println("-_-_-_-_-_-_INFORMACION IMPORTANTE DEL JUEGO-_-_-_-_-_-_");
        for (Jugador jugador : jugadores) {
        System.out.println("Id del jugador "+jugador.getJugadorId());    
        System.out.println("EL nombre del jugador es: "+ jugador.getJugadorNombre());
        System.out.println("El dinero del jugador es: "+ jugador.getJugadorDinero());
        System.out.println("Propiedades del jugador: "+jugador.getJugadorPropiedades());
        System.out.println("Se encuentar en la posicion: "+ jugador.getJugadorPosicionActual());
        if (jugador.getJugadorEstaEnCarcel()==false) {
            System.out.println("El jugador no esta en la carcel.");
            
        }
        else{
            System.out.println("El jugador esta en la carcel");
        }
        System.out.println("El jugador es");
        System.out.println("la cantidad de cartas para salir de la carcel es: "+jugador.getJugadorTotalCartasSalirCarcel());
        System.out.println("fin del a informacion particular para ese jugador");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        }


        System.out.println("El dinero del banco actual es: " + getJuegoDineroBanco());
        System.out.println("La cantidad de dados para esta pertida: "+getJuegoNumeroDados() );
        System.out.println("El juegador actual: "+ getJuegoJugadorActual());
        System.out.println("La tasa de impuesto es: "+ getJuegoTasaImpuesto());
        System.out.println("La cantidad maxima de casas de este juego: 4");
        System.out.println("La cantidad maxima de hoteles de este juego es: " + getJuegoMaximoHoteles());
        System.out.println("-_-_-_-_-_-FIN DE LA INFORMACION-_-_-_-_");
        System.out.println();
        System.out.println();
    }
    /**
     * esta funcion simula el lanzamiento del los dados, los lanza uno a uno y suma el resultado,
     * devuelve la suma de todos los dados lanzados
     * @return sumdaDados
     */
    public int juegoLanzarDado() {
        int sumaDados=0;
       
        for(int i=1;i<=cantidadDados; i++){
            int resultado = random.nextInt(6) + 1;
            sumaDados=sumaDados+resultado;
            System.out.println("al tiral el dado "+i+ "el valor es: " + resultado);
            }
        return sumaDados;
    }
    /**
     * esta funcion nos permite agregar jugadores al juego, nos pregunta por cuanto jugadores agregaremos, 
     * les agreaga el id partiendo desde el cero y le pide el nombre de cada jugador para agreagarlo
     * tambien le quita la cantidad de dinero inicial a al jugador
     */
    public void juegoAgregarJugadores() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuantos jugadores jugaran esta partida? ");
        int cantDeJugadoresAgregar = scanner.nextInt();
        scanner.nextLine(); 
        
        for(int i=1;i<=cantDeJugadoresAgregar;i++){
            
            System.out.print("Escribe el nombre del jugador numero "+i+": ");
            String nombre = scanner.nextLine();
            jugadores.add(new Jugador(i-1,nombre,1500,0,false,0));
            this.juegoDismunirDineroBanco(1500);

        }
        
        //Scanner.close();
    }

    /**
     * esta funcion nos permite que el jugador pueda comprar una propieda, hace verificaciones primero
     * que no sea una cassilla especial y que el jugador tenga el dinero suficiente para comprarla
     * 
     * no verifica que la propiedad no tenga duenno 
     * 
     */
    public void juegoComprarPropiedadJugador() {

        Jugador jugadorActual = getJuegoJugadorActual();
        int posicionDelJugador = jugadorActual.getJugadorPosicionActual();
        if (posicionDelJugador % 5 == 0) {
            System.out.println("No se puede comprar las casillas especiales.");
            System.out.println("Despericiaste tu turno.");
            return;
            }
    
        List<Propiedad> listaPropiedades = tablero.getPropiedades();
        for (Propiedad propiedad : listaPropiedades) {
            int idDePropiedad = propiedad.getPropiedadId();
            if (idDePropiedad == posicionDelJugador) {
                int precio = propiedad.getPropiedadprecio();
                jugadorActual.jugadorCambioDinero(-precio);
                propiedad.setPropiedadDuenno(jugadorActual);
                jugadorActual.imprimirInformacionJugador();
                jugadorActual.setJugadorPropiedad(propiedad);
            
            }
        }
    }
    /**
     * esta funcion sirve para caluclar la renta haciendo una serie de verificaciones, primero que no sea una casilla especial
     * que no este hipotecada
     * busca la propiedad donde esta parado el jugador 
     * luego busca si es hotel para hacerl el calculo
     * @return renta de la propiedad
     */

   public int juegoCalcularRenta() {
    Jugador jugadorActual = getJuegoJugadorActual();
    int valorRenta = 0;
    int posicionDelJugador = jugadorActual.getJugadorPosicionActual();

    if (posicionDelJugador % 5 == 0) {
        System.out.println("El jugador se encuentra en una casilla especial.");
        return 0;
    }

    List<Propiedad> listaPropiedades = tablero.getPropiedades();
    Propiedad propiedadParticular = null;
    for (Propiedad propiedad : listaPropiedades) {
        if (propiedad.getPropiedadId() == posicionDelJugador) {
            propiedadParticular = propiedad;
        }
    }

    if (propiedadParticular.getPropiedadEstadoHipoteca()) {
        System.out.println("La propiedad está hipotecada");
        return 0;
    }
    if (propiedadParticular instanceof Hotel) {
        valorRenta = ((Hotel) propiedadParticular).calcularRentaHotel();
    } else {
        int rentaPropiedadParticular = propiedadParticular.getPropiedadRenta();
        int cantCasasPropiedadParticular = propiedadParticular.getPropiedadCasas();
        valorRenta = (int)(rentaPropiedadParticular * (1 + 0.2 * cantCasasPropiedadParticular));
    }

    return valorRenta;
    }



    
}




