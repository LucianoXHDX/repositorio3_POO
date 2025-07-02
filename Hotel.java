//hare que herede los atributos y metodos de  las propiedades, y tendra la como atributo propio la de si es o no hotel
public class Hotel extends Propiedad{
    private boolean esHotel;
    public Hotel(int id, String nombre, int precio, int renta, Jugador duenno, int casas, boolean estaHipotecada, boolean esHotel){
        super(id, nombre, precio, renta, duenno, casas, estaHipotecada);
        this.esHotel=esHotel;
    }
    public boolean getEsHotel(){
        return esHotel;

    }
    
}