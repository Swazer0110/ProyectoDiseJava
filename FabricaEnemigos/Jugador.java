package FabricaEnemigos;
import java.util.*; 
import Main.*;

public class Jugador extends Enemigo{
    private String arma;
    public Jugador(){
        setArma(eleccion());
        switch(this.arma){
        case "Hacha":
            setFuerza(13);
            setResistencia(30);
            setMagia(5);
            break;
        case "Espada":
            setFuerza(10);
            setResistencia(45);
            setMagia(5);
            break;
        case "Baston":
            setFuerza(8);
            setResistencia(30);
            setMagia(15);
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
        return arma;
    }
    public void imprimirStats(){
        System.out.println("Fuerza:"+getFuerza()+" Vida:"+getResistencia()+" Magia:"+getMagia());
    }
    public int decidirAccion(){
        Scanner sc= new Scanner(System.in);
        imprimirStats();
        System.out.println("Eleccion: 1-Ataque Normal 2-Ataque Magico 3-Defender 4-Rendirse");
        int i= sc.nextInt();
        Calculadora calculadora=Calculadora.instance();
        switch (i) {
            case 1:
                return calculadora.dañoFisico(this);
            case 2:
                this.perderMagia();
                return calculadora.dañoMagico(this);
            case 3:
                this.cambiarDefensa();
                return 0;
            case 4:
                this.cambiarMuerte();
            default:
                return 0;
        }
    }
}