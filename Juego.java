import java.util.List;  
import java.util.Random;
public class Juego{
    //lista de jugadores
    private List<Jugador> jugadores;
    private int dineroBanco;
    private int numeroDados;
    private Jugador jugadorActual;
    private int tasaImpuesto;
    private int maximoCasas;
    private int maximoHoteles;
    public Juego(List<Jugador> jugadores,int dineroBanco, int numeroDados,Jugador jugadorActual, int tasaImpuesto, int maximoCasas, int maximoHoteles){
        this.jugadores=jugadores;
        this.dineroBanco=dineroBanco;
        this.numeroDados=numeroDados;
        this.jugadorActual=jugadorActual;
        this.tasaImpuesto=tasaImpuesto;
        this.maximoCasas=maximoCasas;
        this.maximoHoteles=maximoHoteles;
    }
    public List<Jugador> getJuegoListaJugadores(){
        return jugadores;
    }
    public int getJuegoDineroBanco(){
        return dineroBanco;
    }
    public int getJuegoNumeroDados(){
        return numeroDados;
    }
    public Jugador getJuegoJugadorActual(){
        return jugadorActual;
    }
    public int getJuegoTasaImpuesto(){
        return tasaImpuesto;
    }
    public int getJuegoMaximoCasas(){
        return maximoCasas;
    }
    public int getJuegoMaximoHoteles(){
        return maximoHoteles;
    }
    private Random random = new Random();


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



    //LANZAR DADO
    //mover jugador podria ser en jugador
    public int juegoLanzarDado(int cantidadDados) {
        int sumaDados=0;
        for(int i=1;i<=cantidadDados; i++){
            int resultado = random.nextInt(6) + 1;
            sumaDados=sumaDados+resultado;
            System.out.println("al tiral el dado "+i+ "el valor es: " + resultado);
            }
        return sumaDados;
    }
}

