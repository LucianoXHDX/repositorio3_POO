//hare que herede los atributos y metodos de  las propiedades, y tendra la como atributo propio la de si es o no hotel
/*
 * 
 * COMENTADA CORRECTAMENTE
 * 
 */

 /** Es una herencia de la clase propiedad, usa los mismos parametros que esta clase, solo agreaga un booleano
  * de si es o no hotel
  * 
  */
public class HotelLucianoCarril_21117582 extends PropiedadLucianoCarril_21117582{
    private boolean esHotel;
    /**
     * Constructor de un hotel 
     * @param id identificador de la propiedad
     * @param nombre nombre de la propiedad
     * @param precio precio de la propiedad
     * @param renta renta base de la propiedad
     * @param duenno duenno de la propiedad
     * @param estaHipotecada estado de hipoteca
     */
    public HotelLucianoCarril_21117582(int id, String nombre, int precio, int renta, JugadorLucianoCarril_21117582 duenno, boolean estaHipotecada) {
        super(id, nombre, precio, renta, duenno, 0, estaHipotecada);
        this.esHotel = true;
    }
    /**
     * Esta funcion es para poder calcular la renta del hotel
     * @return el valor de la renta
     */
    public int calcularRentaHotel() {
        return (int) (2 * getPropiedadRenta() * (1 + 0.2 * 4));
    }
    
    
    
}