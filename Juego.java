import java.util.List;  
import java.util.Random;
import java.util.Scanner;
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
    //con esto puedo controlar los turno desde cualquier parte
    private int contadorDeTurnoJugados=0;


    //comenta funcion:
    public Juego(List<Jugador> jugadores,int dineroBanco, int cantidadDados,Jugador jugadorActual, int tasaImpuesto, int maximoCasas, int maximoHoteles){
        this.jugadores=jugadores;
        this.dineroBanco=dineroBanco;
        this.cantidadDados=cantidadDados;
        this.jugadorActual=jugadorActual;
        this.tasaImpuesto=tasaImpuesto;
        this.maximoCasas=maximoCasas;
        this.maximoHoteles=maximoHoteles;
    }
    public void juegoDismunirDineroBanco(int cantDisminuir){
        //aca podrias comprobar si el banco tiene el dinero suficiente  
        this.dineroBanco=dineroBanco-cantDisminuir;
    }



    //comenta funcion:
    public List<Jugador> getJuegoListaJugadores(){
        return jugadores;
    }
    //comenta funcion:
    public int getJuegoDineroBanco(){
        return dineroBanco;
    }
    //comenta funcion:
    public int getJuegoNumeroDados(){
        return cantidadDados;
    }
    //comenta funcion:
    public Jugador getJuegoJugadorActual() {
    List<Jugador> listaJugadores = getJuegoListaJugadores();
    int cantJugadores = listaJugadores.size();
    int indexacionJugadorActual = contadorDeTurnoJugados % cantJugadores;
    return listaJugadores.get(indexacionJugadorActual);
    }
    //comenta funcion:
    public int getJuegoTasaImpuesto(){
        return tasaImpuesto;
    }
    //comenta funcion:
    public int getJuegoMaximoCasas(){
        return maximoCasas;
    }
    //comenta funcion:
    public int getJuegoMaximoHoteles(){
        return maximoHoteles;
    }
    private Random random = new Random();
    public int getJuegoContadorTurnos(){
        return contadorDeTurnoJugados;
    }


    public void aumentarContadorTurnos(){
        this.contadorDeTurnoJugados=contadorDeTurnoJugados+1;
    }
    public void setJuegoJugadorActual(Jugador jugadorActual) {
    this.jugadorActual = jugadorActual;
}
    //comenta funcion:
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
        }
        System.out.println("El dinero del banco actual es: " + getJuegoDineroBanco());
        System.out.println("La cantidad de dados para esta pertida: "+getJuegoNumeroDados() );
        System.out.println("El juegador actual: "+ getJuegoJugadorActual());
        System.out.println("La tasa de impuesto es: "+ getJuegoTasaImpuesto());
        System.out.println("La cantidad maxima de casas de este juego: "+ getJuegoMaximoCasas());
        System.out.println("La cantidad maxima de hoteles de este juego es: " + getJuegoMaximoHoteles());
        System.out.println("-_-_-_-_-_-FIN DE LA INFORMACION-_-_-_-_");
    }
    //comentar funcion:

    //comentar funcion:
    //LANZAR DADO
    //mover jugador podria ser en jugador
    public int juegoLanzarDado() {
        int sumaDados=0;
       
        for(int i=1;i<=cantidadDados; i++){
            int resultado = random.nextInt(6) + 1;
            sumaDados=sumaDados+resultado;
            System.out.println("al tiral el dado "+i+ "el valor es: " + resultado);
            }
        return sumaDados;
    }
    //int cant de jugadore a agreagr es la cant que metre a la lista asi hago un ciclo fro
    public void juegoAgregarJugadores() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuantos jugadores jugaran esta partida? ");
        int cantDeJugadoresAgregar = scanner.nextInt();
        scanner.nextLine(); 
        
        for(int i=0;i<cantDeJugadoresAgregar;i++){
            
            System.out.print("Escribe el nombre del jugador numero "+i+": ");
            String nombre = scanner.nextLine();
            jugadores.add(new Jugador(i+1,nombre,1500,null,0,false,0));
            this.juegoDismunirDineroBanco(1500);

        }
        aumentarContadorTurnos();
        System.out.println("ELIMINA LO DE ABAJO SI LO VES EN LA CONSOLA PAPITOO NO SEA WEON");
        System.out.println("contador de turno"+ getJuegoContadorTurnos());

        //aca hare que se mueva el jugador actual

        //Scanner.close();
    }
}

