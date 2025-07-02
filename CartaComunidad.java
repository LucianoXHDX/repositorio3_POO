/*
 * 
 * COMENTADA CORRECTAMENTE
 * 
 */


/**
 * clase CartaComundad representa las cartas de comunidad del juego CAPITALIA
 * 
 * Esta clase esta extendida de la clase abstracta Carta
 */


public class CartaComunidad extends Carta{
    /**
     * constructor de la carta de comunidad
     * @param id es el identificado de la carta comunidad
     * @param descripcion es la descripcion de lo que hace la carta
     * @param nombre es el nombre de la carta
     * 
     * 
     */
    public CartaComunidad (int id, String descripcion,String nombre){
        super(id,descripcion,nombre);

    }
    /**
     * Es la sobre escritura del metodo accion que tiene la clase abstracta
     * @param jugador es al jugador que se le aplicaran la accion de esta carta
     */
    @Override
    public void accion(Jugador jugador){
        System.out.println("hola aca debe ir lo que hace con ungerr");
        
            //aca debe ir lo que hace la carta
            //jugador.ganarDinero(222)
            //luego el jugador activa ese meotodo
        
    }
}