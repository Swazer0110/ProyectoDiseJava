package FabricaEnemigos;
import java.util.*; 
import Main.*;

public class Jugador extends Enemigo{           //Clase para controlar al jugador
    private String arma;
    public Jugador(){
        setArma(eleccion());
        switch(this.arma){
        case "Hacha":
            setFuerza(11);
            setResistencia(40);
            setMagia(5);    
            break;
        case "Espada":
            setFuerza(9);
            setResistencia(45);
            setMagia(5);
            break;
        case "Baston":
            setFuerza(8);
            setResistencia(35);
            setMagia(15);
            break;
        }
        this.vida=resistencia;
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
    public String eleccion(){                       //Metodo para elegir el arma al principio del juego
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
    public int decidirAccion(){                      //Metodo para elegir accion en cada turno
        Scanner sc= new Scanner(System.in);
        imprimirStats();
        System.out.println("Eleccion: 1-Ataque Normal 2-Ataque Magico 3-Defender ");
        int i= sc.nextInt();
        Calculadora calculadora=Calculadora.instance();
        switch (i) {
            case 1:
                return calculadora.dañoFisico(this);
            case 2:
                if(this.getMagia()==0){
                    System.out.println("No te queda mana!");
                    return calculadora.dañoFisico(this);
                }    
                this.perderMagia();
                return calculadora.dañoMagico(this);
            case 3:
                this.cambiarDefensa();
                return 0;
            default:
                return 0;
        }
    }
    public void curar(){                            //Metodo para curar al juagador cada tres rondas
        this.setResistencia(this.getVida());
        if(this.getArma().equals("Baston")){
            this.setMagia(this.getMagia()+10);
        }
        else{
            this.setMagia(this.getMagia()+5);
        }
        this.setMagia(this.getMagia());
    }
}