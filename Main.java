import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Esta funcion es el main del juego, el cual se encargara de cordinar acciones para que el 
 * juego CAPITALIA, funcione correctamente
 */

public class Main{

    private JuegoLucianoCarril_21117582 juego;
     
    
    public static void main(String[] args) {
    Main mainJuego = new Main();
    mainJuego.cargarJuegoMain();
    Scanner scanner = new Scanner(System.in);

    System.out.println("ingrese 1 para acceder al menu de prueba de funciones de CAPITALIA ");
    System.out.println("ingrese 2 para iniciar CAPITALIA");
    System.out.println("ingrese 3 para salir de CAPITLIA");
    int opcionMenu = scanner.nextInt();
    if (opcionMenu==1) {
        mainJuego.probarFunciones();
    }else if (opcionMenu==2) {
        System.out.println("aca debe ir a la funcion de jugar partida");
        System.out.println("si ve este mensaje la partida no fue implementada");
    }else if (opcionMenu==3) {
        System.out.println("gracias por jugar CAPITALIA");
        
    }else{
        System.out.println("la opcion ingresada no es valida");
    }



  
     
    

}      

    
    public void cargarJuegoMain(){
        
        System.out.println("-_-_-_-_-_-_INICIANDO EL  JUEGO -_-_");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        //public PropiedadLucianoCarril_21117582(int id, String nombre, int precio, int renta, JugadorLucianoCarril_21117582 duenno, int casas, boolean estaHipotecada){
        List<JugadorLucianoCarril_21117582> jugadores=new ArrayList<>();

        //esto corresponde al agragar propiedades
        //id corresponde a la posicion cosas especiales estaran en los multiplos de 5, el 0 es salida
        List<PropiedadLucianoCarril_21117582> propiedades= new ArrayList<>();
        propiedades.add(new PropiedadLucianoCarril_21117582(1,"UNAB",21,21,null,0,false));
        propiedades.add(new PropiedadLucianoCarril_21117582(2,"Deportes Temuco",21,21,null,0,false));
        propiedades.add(new PropiedadLucianoCarril_21117582(3,"U.Catolica",21,21,null,0,false));
        propiedades.add(new PropiedadLucianoCarril_21117582(4,"INACAP",21,21,null,0,false));
        
        propiedades.add(new PropiedadLucianoCarril_21117582(6,"DUOC UC",21,21,null,0,false));
        propiedades.add(new PropiedadLucianoCarril_21117582(7,"MCdonals",21,21,null,0,false));
        propiedades.add(new PropiedadLucianoCarril_21117582(8,"Burger King",21,21,null,0,false));
        propiedades.add(new PropiedadLucianoCarril_21117582(9,"UIA",21,21,null,0,false));
        
        propiedades.add(new PropiedadLucianoCarril_21117582(11,"Usach",21,21,null,0,false));
        propiedades.add(new PropiedadLucianoCarril_21117582(12,"U.Chile",21,21,null,0,false));
        propiedades.add(new PropiedadLucianoCarril_21117582(13,"Colo-colo",21,21,null,0,false));
        propiedades.add(new PropiedadLucianoCarril_21117582(14,"UTFSM",21,21,null,0,false));
        

        propiedades.add(new PropiedadLucianoCarril_21117582(16,"ALGO",21,21,null,0,false));
        propiedades.add(new PropiedadLucianoCarril_21117582(17,"DINF",21,21,null,0,false));
        propiedades.add(new PropiedadLucianoCarril_21117582(18,"FAE",21,21,null,0,false));
        List<CartaLucianoCarril_21117582> cartasSuerte=new ArrayList<>();
        cartasSuerte.add(new CartaSuerteLucianoCarril_21117582(1,"avance a la salida","te vas a la salida"));
        cartasSuerte.add(new CartaSuerteLucianoCarril_21117582(2,"avance 3 pasos","avanza un poco "));
        cartasSuerte.add(new CartaSuerteLucianoCarril_21117582(3,"retroceda 5 pasos","debes devolverte a buscar algo"));
        cartasSuerte.add(new CartaSuerteLucianoCarril_21117582(4,"directo a la carcel","estabas manejando ebrio"));
        cartasSuerte.add(new CartaSuerteLucianoCarril_21117582(5,"MULTA debe pagar 50","exceso de velocidad por la autopista"));
        cartasSuerte.add(new CartaSuerteLucianoCarril_21117582(6,"El bitcoin a subido","es momento de vender tus bitcoins"));
        cartasSuerte.add(new CartaSuerteLucianoCarril_21117582(7,"Ganaste una herencia","un tio millonario fallecio"));
        cartasSuerte.add(new CartaSuerteLucianoCarril_21117582(8,"Beca intersional","Debes pagar por los pasajes de la beca"));
        cartasSuerte.add(new CartaSuerteLucianoCarril_21117582(9,"Salio parito","Hay paro puedes trabajar"));
        cartasSuerte.add(new CartaSuerteLucianoCarril_21117582(10,"Almuerzo gratis en la U","Te ahorraste dinero del almuerzo"));
        List<CartaLucianoCarril_21117582> cartasComunidad=new ArrayList<>();
        cartasComunidad.add(new CartaComunidadLucianoCarril_21117582(11,"Donaste a AEDA","le diste felicidad a los perros de AEDA"));
        cartasComunidad.add(new CartaComunidadLucianoCarril_21117582(12,"te encontraste 10 en el piso","encontras te dinero en el piso"));
        cartasComunidad.add(new CartaComunidadLucianoCarril_21117582(13,"error del abanco","el banco se equivoco asi que te pagaran"));
        cartasComunidad.add(new CartaComunidadLucianoCarril_21117582(14,"salir de la carcel gratis","podras salir de la carcel si haces algun delito"));
         cartasComunidad.add(new CartaComunidadLucianoCarril_21117582(15,"regalos de navidad","debes comprar regalos de navidad"));
        cartasComunidad.add(new CartaComunidadLucianoCarril_21117582(16,"14F","debes comprar regalo para tu pareja"));
        cartasComunidad.add(new CartaComunidadLucianoCarril_21117582(17,"es tu cumpleaños","te pagaran por tu cumple"));
        cartasComunidad.add(new CartaComunidadLucianoCarril_21117582(18,"es el cumpleaños del siguiente jugador","Debes comprar un regalo de cumpleaños"));
        cartasComunidad.add(new CartaComunidadLucianoCarril_21117582(19,"debes reparar tu telefono","Debes reparar tu telefono asi que perderas dinero"));
        cartasComunidad.add(new CartaComunidadLucianoCarril_21117582(20,"debes reparar tu computador","Debes reparar tu pc asi que perdera diner"));
         List<CasillaEspecialesLucianoCarril_21117582> casillasEspeciales = new ArrayList<>();
        casillasEspeciales.add(new CasillaEspecialesLucianoCarril_21117582(0, "SALIDA", "Casilla de inicio"));
        casillasEspeciales.add(new CasillaEspecialesLucianoCarril_21117582(5, "Carcel", "Vas a la cárcel"));
        casillasEspeciales.add(new CasillaEspecialesLucianoCarril_21117582(10, "Saca una carta", "Saca una carta de suerte"));
        casillasEspeciales.add(new CasillaEspecialesLucianoCarril_21117582(15, "parada libre", "Saca una carta de comunidad"));
        List<CartaLucianoCarril_21117582> todasLasCartas = new ArrayList<>();
        todasLasCartas.addAll(cartasSuerte);
        todasLasCartas.addAll(cartasComunidad);
         
         //ojo que los parametro de est ejuego estan inventado
        TableroLucianoCarril_21117582 tablero = new TableroLucianoCarril_21117582(casillasEspeciales, propiedades, todasLasCartas);
        System.out.println("con cuantos dados quieres jugar? ");
        Scanner scanner = new Scanner(System.in);
        int cantidadDados = scanner.nextInt();

        this.juego= new JuegoLucianoCarril_21117582(jugadores,20000,cantidadDados,null,10,4,8,tablero);
        //agrego como jugador inicial al primer jugad
        
        //juego agreagr jugadores modificara el turno actual
        juego.juegoAgregarJugadores();
        juego.juegoImprimirInformacion();
    

    }
    public void moverJugadorMain() {
        //debo ver el tema de que no se vaya a caer del mapa con el mood ojitoo
    System.out.println("-_-_-_-_-_-Prueba Mover jugador-_-_-");
    int resultadoDados = juego.juegoLanzarDado();
    JugadorLucianoCarril_21117582 jugadorAMover=juego.getJuegoJugadorActual();
    jugadorAMover.moverJugador(resultadoDados);
    }

    public void probarFunciones() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("===== MENÚ DE JUEGO CAPITALIA =====");
            System.out.println("1 SALIR DEL JUEGO");
            System.out.println("2. mover al jugador, lanzando los dados");
            System.out.println("3. Calcular renta del jugador");
            System.out.println("4. Imprimir informacion del juego y del jugador en turno");
            System.out.println("5. Terminar el turno y darle le paso al siguiente jugador");
            System.out.println("6. Obtener jugador actual");
            System.out.println("7. Comprar propiedad");
            System.out.println("8. agreagar una casa a la propiedad");
            System.out.println("9. pagar renta a un jugador");
            System.out.println("10. hipotecar la propiedad");
            System.out.println("11. Extraer carta");
            System.out.println("12. verifica la bancarrota del jugador");
            System.out.print("Elige una opción: ");
            System.out.println("(Para que tenga sentido debes ir haciendo que el jugador actual finalice su turno)");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 2:
                    moverJugadorMain();
                    System.out.println("Se completo con exito la operacion");
                    break;
                case 3:
                int renta = juego.juegoCalcularRentaJugador();
                    System.out.println("La renta total del jugador actual es: " + renta);
                    System.out.println("Se completo con exito la operacion");
                    break;
                   
                case 4:

                    juego.juegoImprimirInformacion();
                    System.out.println("Se completo con exito la operacion");
                    break;
                    
                case 5:
                    juego.aumentarContadorTurnos();
                    System.out.println("Se completo con exito la operacion");
                case 6:
                    juego.getJuegoJugadorActual();
                    System.out.println("Se completo con exito la operacion");
                case 7:
                //comprar propiedad
                    juego.juegoComprarPropiedadJugador();
                    System.out.println("Se completo con exito la operacion");
                    break;
                case 8:
                 juego.juegoComprarPropiedadJugador();
                 System.out.println("Se completo con exito la operacion");
                    break;

                case 9:
                 System.out.print("ID del jugador que paga: ");
                int idPagador = scanner.nextInt();
                System.out.print("ID del jugador que recibe: ");
                int idReceptor = scanner.nextInt();
                System.out.print("Monto a pagar: ");
                int monto = scanner.nextInt();
                scanner.nextLine();

                JugadorLucianoCarril_21117582 pagador = buscarJugadorPorId(idPagador);
                JugadorLucianoCarril_21117582 receptor = buscarJugadorPorId(idReceptor);

                
                    juego.pagarRentaAJugador(pagador, receptor, monto);
                    System.out.println("Se completo con exito la operacion");
                break;
                case 10:
                //hipotecar
                System.out.println("Ingrese el ID de la propiedad a hipotecar:");
                int idPropiedad = scanner.nextInt();
                scanner.nextLine(); 

                PropiedadLucianoCarril_21117582 propiedad = buscarPropiedadPorId(idPropiedad);

                propiedad.setHipotecadapropiedad();
                System.out.println("Se completo con exito la operacion");
    
                    break;
                    case 11:
                //extraer carta

                    juego.getTablero().extraeCarta();
                    System.out.println("Se completo con exito la operacion");
                    
                    break;
                case 12:
                //verifica bacnarrota
                    System.out.println("para esto debes ingresar el jugador que quieres verificar");
                    System.out.println("Se completo con exito la operacion");
                    //juego.verificaBancarrota();
                    break;
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        } while (opcion != 1);
    }




    private JugadorLucianoCarril_21117582 buscarJugadorPorId(int id) {
    for (JugadorLucianoCarril_21117582 jugador : juego.getJuegoListaJugadores()) {
        if (jugador.getJugadorId() == id) {
            return jugador;
        }
    }
    return null;
    }
    private PropiedadLucianoCarril_21117582 buscarPropiedadPorId(int idPropiedad) {
    for (PropiedadLucianoCarril_21117582 propiedad : juego.getTablero().getPropiedades()) {
        if (propiedad.getPropiedadId() == idPropiedad) {
            return propiedad;
        }
    }
    return null;
}
 }
   

   

    
