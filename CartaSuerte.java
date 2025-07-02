/*
 * 
 * COMENTADA CORRECTAMENTE
 * 
 */


/**
 * clase CartaSuerteLucianoCarril_21117582 representa las cartas de comunidad del juego CAPITALIA
 * 
 * Esta clase esta extendida de la clase abstracta CartaLucianoCarril_21117582
 */


public class CartaSuerteLucianoCarril_21117582 extends CartaLucianoCarril_21117582{
    /**
     * constructor de la carta de suerte
     * @param id es el identificado de la carta comunidad
     * @param descripcion es la descripcion de lo que hace la carta
     * @param nombre es el nombre de la carta
     * 
     * 
     */
 
    public CartaSuerteLucianoCarril_21117582(int id, String descripcion,String nombre){
        super(id,descripcion,nombre);

    }
     /**
     * Es la sobre escritura del metodo accion que tiene la clase abstracta
     * @param jugador es al jugador que se le aplicaran la accion de esta carta
     */
    @Override
    public void accion(JugadorLucianoCarril_21117582 jugador){
        System.out.println("hola aca debe ir lo que hace con ungerr");
        
            //aca debe ir lo que hace la carta
            //jugador.ganarDinero(222)
            //luego el jugador activa ese meotodo
        
    }
}