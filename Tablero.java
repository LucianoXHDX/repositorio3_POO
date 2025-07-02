import java.util.List;  
/*
 * 
 * COMENTADA CORRECTAMENTE
 * 
 */

/**
 * esta clase representa el tablero del juego CAPITALIA
 */

public class Tablero{
    private List<CasillaEspeciales> casillasEspeciales;
    private List<Propiedad> propiedades;
    private List<Carta> cartas;
    /**
     * Es el contructor del tablero del juego
     * @param casillasEspeciales es una lista de las casillas especiales que tienen el id que son multiplos de 5
     * @param propiedades es una lista de  propiedades del juego que no son multiplos de 5
     * @param cartas es una lista de cartas del juego que representa los mazos de cartas de suerte o comunidad
     */
    public Tablero(List<CasillaEspeciales> casillasEspeciales,List<Propiedad> propiedades,List<Carta> cartas){
        this.casillasEspeciales=casillasEspeciales;
        this.propiedades=propiedades;
        this.cartas=cartas;
    }
    /**
     * esta funcion devuelve la lista de las casillas especiales
     * @return lista de casillas especiales
     */
    public List<CasillaEspeciales> getCasillasEspeciales(){
        return casillasEspeciales;
    }
    /**
     *  esta funcion devuelve la lista de las propiedades 
     * @return lista de las propiedades
     */
    public List<Propiedad> getPropiedades(){
        return propiedades;
    }
    /**
     * esta funcion devuelve la lista de las cartas
     * @return lista de cartas
     */
    public List<Carta> getCartas(){
        return cartas;
    }



}