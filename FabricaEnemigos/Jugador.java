package FabricaEnemigos;
/**
* Jugador
*/
import java.util.*; 
public class Jugador extends Enemigo{
    private String arma;
    public Jugador(){
        setArma(eleccion());
        switch(this.arma){
        case "Hacha":
            setFuerza(0);
            setResistencia(50);
            setMagia(30);
            break;
        case "Espada":
            setFuerza(40);
            setResistencia(70);
            setMagia(40);
            break;
        case "Baston":
            setFuerza(30);
            setResistencia(40);
            setMagia(80);
            break;
        }
    }
    public String getArma() {
        return arma;
    }
    public int getFuerza() {
        return fuerza;
    }
    public int getMagia() {
        return magia;
    }
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    public void setMagia(int magia) {
        this.magia = magia;
    }
    public void setArma(String arma) {
        this.arma = arma;
    }
    public String eleccion(){
        Scanner sc= new Scanner(System.in);
        String arma=new String();
        System.out.println("Elige tu arma:\n1-Hacha\n2-Espada\n3-Baston");
        int i= sc.nextInt();
        switch(i) {
            case 1:
                arma="Hacha";
                break;
            case 2:
                arma="Espada";
                break;
            case 3:
                arma="Baston";
                break;
            default:
                arma="Espada";
                break;
        }
        sc.close();
        return arma;
    }
}