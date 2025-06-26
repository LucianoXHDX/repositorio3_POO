import java.util.List;  

public class Jugador{
    //atributos
    private int id;
    private String nombre;
    private int dinero;
    private List<Propiedad> propiedades;
    private int posicionActual;
    private boolean estaEnCarcel;
    private int totalCartasSalirCarcel;
    //fin atributos
    //constructor
    public Jugador(int id,String nombre,int dinero, List<Propiedad> propiedades, int posicionActual, boolean estaEnCarcel, int totalCartasSalirCarcel){
        this.id=id;
        this.nombre=nombre;
        this.dinero=dinero;
        this.propiedades=propiedades;
        this.posicionActual=posicionActual;
        this.estaEnCarcel=estaEnCarcel;
        this.totalCartasSalirCarcel=totalCartasSalirCarcel;
    }
    //fin constructor
//METODOS
    //inicio de getters de todo
    public int getId(){
        return id;
    }
    //tal vez este no es necesario si no lo usas eliminalo
    public String getNombre(){
        return nombre;
    }
    public int getDinero(){
        return dinero;
    }
    public List<Propiedad> getPropiedades(){
        return propiedades;
    }
    public int getPosicionActual(){
        return posicionActual;
    }
    public boolean getEstaEnCarcel(){
        return estaEnCarcel;
    }
    public int getTotalCartasSalirCarcel(){
        return totalCartasSalirCarcel;
    }

//fin metodos

//inico setter


//fin setter
}
