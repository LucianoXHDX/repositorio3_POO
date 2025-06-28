import java.util.List;  

public class Tablero{
    private List<CasillaEspeciales> casillasEspeciales;
    private List<Propiedad> propiedades;
    private List<Carta> cartas;//aca como es absatracto, puedo decir que son cartas y luego agrego el tipo de cartas que la hereden
    public Tablero(List<CasillaEspeciales> casillasEspeciales,List<Propiedad> propiedades,List<Carta> cartas){
        this.casillasEspeciales=casillasEspeciales;
        this.propiedades=propiedades;
        this.cartas=cartas;
    }
    public List<CasillaEspeciales> getCasillasEspeciales(){
        return casillasEspeciales;
    }
    public List<Propiedad> getPropiedades(){
        return propiedades;
    }
    public List<Carta> getCartas(){
        return cartas;
    }
/*esto es solo para paoder subir un comit
 */


}