import java.util.List;  
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * esta clase es la representacion del juego CAPITALIA aca se cordinan algunas clases para simular el juego
 */
public class JuegoLucianoCarril_21117582{
    //lista de jugadores
    //comenta funcion: comentar metodos
    private List<JugadorLucianoCarril_21117582> jugadores;
    private int dineroBanco;
    private int cantidadDados;
    private JugadorLucianoCarril_21117582 jugadorActual;
    private int tasaImpuesto;
    private int maximoCasas;
    private int maximoHoteles;
    //esto es para poder trabajar de forma simple con los de tablero
    private TableroLucianoCarril_21117582 tablero;
    

    //con esto puedo controlar los turno desde cualquier parte
    private int contadorDeTurnoJugados=0;


    //comenta funcion:
    /**
     * Es el contructor de la clase JuegoLucianoCarril_21117582
     * @param jugadores es una lista de JugadorLucianoCarril_21117582, que representa a los jugadores del juego
     * @param dineroBanco es el dinero del banco
     * @param cantidadDados es la cantidad de dados que se usaran para la partida
     * @param jugadorActual es el jugador al cual le toca el jugar, es de tipo JugadorLucianoCarril_21117582
     * @param tasaImpuesto es la tasa de impuesto del juego
     * @param maximoCasas es el maximo de casas del juego en este caso 4
     * @param maximoHoteles es el maximo de hoteles del juego
     * @param tablero es el tablero del juego de tipo TableroLucianoCarril_21117582
     */
    public JuegoLucianoCarril_21117582(List<JugadorLucianoCarril_21117582> jugadores,int dineroBanco, int cantidadDados,JugadorLucianoCarril_21117582 jugadorActual, int tasaImpuesto, int maximoCasas, int maximoHoteles,TableroLucianoCarril_21117582 tablero){
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
    public List<JugadorLucianoCarril_21117582> getJuegoListaJugadores(){
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
     * @return JugadorLucianoCarril_21117582
     */
    public JugadorLucianoCarril_21117582 getJuegoJugadorActual() {
    List<JugadorLucianoCarril_21117582> listaJugadores = getJuegoListaJugadores();
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
    public void setJuegoJugadorActual(JugadorLucianoCarril_21117582 jugadorActual) {
    this.jugadorActual = jugadorActual;
}
    //comenta funcion:
    /**
     * esta funcion imprime la informacion relevante del juego
     * 
     */
    public void juegoImprimirInformacion(){
        System.out.println("-_-_-_-_-_-_INFORMACION IMPORTANTE DEL JUEGO-_-_-_-_-_-_");
        for (JugadorLucianoCarril_21117582 jugador : jugadores) {
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
            jugadores.add(new JugadorLucianoCarril_21117582(i-1,nombre,1500,0,false,0));
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

        JugadorLucianoCarril_21117582 jugadorActual = getJuegoJugadorActual();
        int posicionDelJugador = jugadorActual.getJugadorPosicionActual();
        if (posicionDelJugador % 5 == 0) {
            System.out.println("No se puede comprar las casillas especiales.");
            return;
            }
    
        List<PropiedadLucianoCarril_21117582> listaPropiedades = tablero.getPropiedades();
        for (PropiedadLucianoCarril_21117582 propiedad : listaPropiedades) {
            int idDePropiedad = propiedad.getPropiedadId();
            if (idDePropiedad == posicionDelJugador) {
                int precio = propiedad.getPropiedadprecio();
                jugadorActual.jugadorCambioDinero(-precio);
                propiedad.setPropiedadDuenno(jugadorActual);
                jugadorActual.imprimirInformacionJugador();
                jugadorActual.setJugadorPropiedad(idDePropiedad);
            
            }
        }
    }
    //comentar esta nueva
    public void comprarcasa(){
        JugadorLucianoCarril_21117582 jugadorActual = getJuegoJugadorActual();
        int posicionDelJugador = jugadorActual.getJugadorPosicionActual(); 


    }
    /**esta funcion calucla la renta de todas la propiedades del jugador
     * 
     * @return rentaJugador
     */
    public int juegoCalcularRentaJugador(){
    int rentaJugador = 0;
    JugadorLucianoCarril_21117582 jugadorActual = getJuegoJugadorActual();
    List<PropiedadLucianoCarril_21117582> listaPropiedades = tablero.getPropiedades();
    List<Integer> listaIdsPropiedadesJugador = jugadorActual.getJugadorPropiedades();

    for (Integer idPropiedad : listaIdsPropiedadesJugador) {
        for (PropiedadLucianoCarril_21117582 propiedad : listaPropiedades) {
            if (propiedad.getPropiedadId() == idPropiedad) {
                rentaJugador += propiedad.getPropiedadRenta();
                break;
            }
        }
    }
        return rentaJugador;
    }
    /**
     * esta funcion nos permite construir un hotel, busca la posicion donde esta el jugador, verifica que tenaga la cantidad maxima de casa
     * que son 4, crea el hotel y deja las casas en 0, ademas hace el cambio en la lista de propiedades
     */
    public void jugadorConstruirHotel(){
        JugadorLucianoCarril_21117582 jugadorActual = getJuegoJugadorActual();
        List<PropiedadLucianoCarril_21117582> listaPropiedades = tablero.getPropiedades();
        List<Integer> listaIdsPropiedadesJugador = jugadorActual.getJugadorPropiedades();
        int idPropiedad = jugadorActual.getJugadorPosicionActual(); 
        
        //esto pregunta si es o no duenno
        PropiedadLucianoCarril_21117582 propiedadActual = null;
        for (PropiedadLucianoCarril_21117582 propiedad : listaPropiedades) {
            if (propiedad.getPropiedadId() == idPropiedad) {
                propiedadActual = propiedad;
                break;
            }
        }
        if (propiedadActual.getPropiedadCasas()<4) {
            return;
            
        }

        HotelLucianoCarril_21117582 hotel = new HotelLucianoCarril_21117582(propiedadActual.getPropiedadId(),propiedadActual.getPropiedadNombre(),propiedadActual.getPropiedadprecio(),propiedadActual.getPropiedadRenta(),propiedadActual.getPropiedadDuenno(),propiedadActual.getPropiedadEstadoHipoteca());
        for (int i = 0; i <=15; i++) {
             if (listaPropiedades.get(i).getPropiedadId() == idPropiedad) {
                listaPropiedades.set(i, hotel);
                break;
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
    JugadorLucianoCarril_21117582 jugadorActual = getJuegoJugadorActual();
    int valorRenta = 0;
    int posicionDelJugador = jugadorActual.getJugadorPosicionActual();

    if (posicionDelJugador % 5 == 0) {
        System.out.println("El jugador se encuentra en una casilla especial.");
        return 0;
    }

    List<PropiedadLucianoCarril_21117582> listaPropiedades = tablero.getPropiedades();
    PropiedadLucianoCarril_21117582 propiedadParticular = null;
    for (PropiedadLucianoCarril_21117582 propiedad : listaPropiedades) {
        if (propiedad.getPropiedadId() == posicionDelJugador) {
            propiedadParticular = propiedad;
        }
    }

    if (propiedadParticular.getPropiedadEstadoHipoteca()) {
        System.out.println("La propiedad está hipotecada");
        return 0;
    }
    if (propiedadParticular instanceof HotelLucianoCarril_21117582) {
        valorRenta = ((HotelLucianoCarril_21117582) propiedadParticular).calcularRentaHotel();
    } else {
        int rentaPropiedadParticular = propiedadParticular.getPropiedadRenta();
        int cantCasasPropiedadParticular = propiedadParticular.getPropiedadCasas();
        valorRenta = (int)(rentaPropiedadParticular * (1 + 0.2 * cantCasasPropiedadParticular));
    }

    return valorRenta;
    }
    /**
     * esta funcion simula el pago entre jugadores
     * @param jugadorPagador es el jugador que paga y se le descuenta el dinero
     * @param jugadorReceptor es el jugador que se le aga y se le aumenta el dinero
     * @param montoAPagar es el monto que se transa en la funcion
     */
    public void pagarRentaAJugador(JugadorLucianoCarril_21117582 jugadorPagador,JugadorLucianoCarril_21117582 jugadorReceptor,int montoAPagar){
        jugadorPagador.jugadorCambioDinero(-montoAPagar);
        jugadorReceptor.jugadorCambioDinero(montoAPagar);
    }
    /**
     * Esta funcion permite verificar si un jugador esta o no en bancarrota
     * @param jugador es el jugador que se verifica que este en bancarrota
     * @return booleano, donde es verdadero si el jugador esta en bancarrota
     */
    public boolean verificaBancarrota(JugadorLucianoCarril_21117582 jugador){
        if(jugador.getJugadorDinero()>=0){

            System.out.println("el jugador "+jugador.getJugadorNombre()+"esta en bancarrota.");
            System.out.println("SE TERMINO EL JUEGO");
            return true;
        }
        return false;
    }
    public void hipotecarPropiedad(JugadorLucianoCarril_21117582 jugador,PropiedadLucianoCarril_21117582 propiedadAHipotecar){
        int rentaPropiedad=propiedadAHipotecar.getPropiedadRenta();
        jugador.jugadorCambioDinero(rentaPropiedad);
        propiedadAHipotecar.setHipotecadapropiedad();
        System.out.println("la propiedad se ha hipotecado y usted recibe"+rentaPropiedad);
    }



    
}




