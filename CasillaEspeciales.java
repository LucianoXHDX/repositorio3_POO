
/*
 * 
 * COMENTADA CORRECTAMENTE
 * 
 */



/**
 * es la clase que reprenta las casillas especiales, todas tendran ids multiplos de 5
 * 
 * 
 */


public class CasillaEspeciales{
    private int id;
    private String nombre;
    private String descripcion;
    /**
     * 
     * @param id es el identificador de la carta
     * @param nombre el nombre de la casilla especial
     * @param descripcion es la descripcion de esta casilla especial
     */
    public CasillaEspeciales(int id, String nombre ,String descripcion){
        this.id=id;
        this.nombre=nombre;
        this.descripcion=descripcion;
    }
    /**
     * esta funcion sirve para devolver el identificador de la casilla especial
     * @return identificador 
     */
    public int getId(){
        return id;
    }
    /**
     * esta funcion sirve para devolver el nombre de la casilla especial
     * @return nombre
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Esta funcion sirve para devolver la descripcion de la carta
     * @return descripccion
     */
    public String getDescripcion(){
        return descripcion;
    }

    
}