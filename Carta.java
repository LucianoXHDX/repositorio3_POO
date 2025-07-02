/*
 * 
 * COMENTADA CORRECTAMENTE
 * 
 */


/**
 * Clase abstracta que representa una carta del juego CAPITALIOA
 * Las cartas tienen un id, una descripción y un nombre.
 * 
 * Esta clase debe ser extendida por cartas concretas como
 * CartaSuerte o CartaComunidad, que definirán el comportamiento
 * de la acción de la carta.
 */
public abstract class Carta {
    private int id;
    private String descripcion;
    private String nombre;

    /**
     * Constructor de la clase Carta.
     *
     * @param id el identificador único de la carta
     * @param descripcion la descripción de la carta
     * @param nombre el nombre de la carta
     */
    public Carta(int id, String descripcion, String nombre) {
        this.id = id;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    /**
     * Obtiene el identificador de la carta.
     *
     * @return el id de la carta
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene la descripción de la carta.
     *
     * @return la descripción de la carta
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Obtiene el nombre de la carta.
     *
     * @return el nombre de la carta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define la acción que realiza la carta sobre un jugador.
     * Este método debe ser implementado por las subclases.
     *
     * @param jugador el jugador sobre el que actúa la carta
     */
    public abstract void accion(Jugador jugador);
}
