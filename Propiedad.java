
/*
 * 
 * COMENTADA CORRECTAMENTE
 * 
 */

 /**
  * esta clase represnta una propiedad dentro del juego CAPITALIA
  */

public class Propiedad{
    private int id;
    private String nombre;
    private int precio;
    private int renta;
    private Jugador duenno;
    private int casas; //siguiendo la logica de laboratorios anteriores estan seran un numero
    private boolean estaHipotecada;
    //constructor
    /**
     * Es el contructor de una propiedad del juego
     * @param id identificador de la propiedad
     * @param nombre es el nombre de la propiedad
     * @param precio es el precio de la propiedad
     * @param renta es la renta de la propiedad
     * @param duenno es dueno de la propiedad, es de tipo Jugador
     * @param casas es la cantidad de casas que tiene la propiedad
     * @param estaHipotecada es un booleano que dice si esta o no la propiedad hipotecada
     */

    public Propiedad(int id, String nombre, int precio, int renta, Jugador duenno, int casas, boolean estaHipotecada){
        this.id=id;
        this.nombre=nombre;
        this.precio=precio;
        this.renta=renta;
        this.duenno=duenno;
        this.casas=casas;
        this.estaHipotecada=estaHipotecada;
    }
    //getter correspondiente
    /**
     * esta funcion devuelve el nombre de la propiedad
     * @return nombre
     */
    public String getPropiedadNombre(){
        return nombre;
    }
    /**
     * esta funcion devuelve el identificador de la propiedad
     * @return id
     */
    public int getPropiedadId(){
        return id;
    }
    /**
     * esta funcion devuelve el precio de la propiedad
     * @return precio
     */
    public int getPropiedadprecio(){
        return precio;
    }
    /**
     * esta funcion devuelve la renta de la propiedad
     * @return renta
     */
    public int getPropiedadRenta(){
        return renta;
    }
    /**
     * esta funcion devuelve el duenno de la funcion que sera del tipo Jugador
     * @return duenno
     */
    public Jugador getPropiedadDuenno(){
        return duenno;
    }
    /**
     * esta funcion devuelve la cantidad de casas que tiene la propiedad
     * @return casas
     */
    public int getPropiedadCasas(){
        return casas;
    }
    /**
     * esta funcion devulve el booleano si esta o no hipotecada,false para no esta hipotecada
     * @return estaHipotecada
     */
    public boolean getPropiedadEstadoHipoteca(){
        return estaHipotecada;
    }
    /**
     * Esta funcion sirve para definir un duenno en la propiedad, no devuelve nada solo cambia cambia el null por un duenno
     * @param jugador el jugador que compro la casa
     * 
     */
    public void setPropiedadDuenno(Jugador jugador){
        this.duenno=jugador;
    }

}
