import java.util.List;  
import java.util.Random;

/*
 * 
 * COMENTADA CORRECTAMENTE
 * 
 */

/**
 * esta clase representa el tablero del juego CAPITALIA
 */

public class TableroLucianoCarril_21117582{
    private List<CasillaEspecialesLucianoCarril_21117582> casillasEspeciales;
    private List<PropiedadLucianoCarril_21117582> propiedades;
    private List<CartaLucianoCarril_21117582> cartas;
    /**
     * Es el contructor del tablero del juego
     * @param casillasEspeciales es una lista de las casillas especiales que tienen el id que son multiplos de 5
     * @param propiedades es una lista de  propiedades del juego que no son multiplos de 5
     * @param cartas es una lista de cartas del juego que representa los mazos de cartas de suerte o comunidad
     */
    public TableroLucianoCarril_21117582(List<CasillaEspecialesLucianoCarril_21117582> casillasEspeciales,List<PropiedadLucianoCarril_21117582> propiedades,List<CartaLucianoCarril_21117582> cartas){
        this.casillasEspeciales=casillasEspeciales;
        this.propiedades=propiedades;
        this.cartas=cartas;
    }
    /**
     * esta funcion devuelve la lista de las casillas especiales
     * @return lista de casillas especiales
     */
    public List<CasillaEspecialesLucianoCarril_21117582> getCasillasEspeciales(){
        return casillasEspeciales;
    }
    /**
     *  esta funcion devuelve la lista de las propiedades 
     * @return lista de las propiedades
     */
    public List<PropiedadLucianoCarril_21117582> getPropiedades(){
        return propiedades;
    }
    /**
     * esta funcion devuelve la lista de las cartas
     * @return lista de cartas
     */
    public List<CartaLucianoCarril_21117582> getCartas(){
        return cartas;
    }
    
    private Random random = new Random();  

 public CartaLucianoCarril_21117582 extraeCarta(){
        //20 es el total de cartas
        int resultado = random.nextInt(20);
        CartaLucianoCarril_21117582 cartaExtraida=cartas.get(resultado);
        System.out.println("la carta extraida es:"+cartaExtraida.getNombre());
        return cartaExtraida;
    }
}