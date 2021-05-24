package FabricaEnemigos;
import EstrategiaEnemigos.AgresivoEstrategia;
import EstrategiaEnemigos.DefensivoEstrategia;
import EstrategiaEnemigos.Estrategia;
import java.util.Random;
import Estado.*;

public abstract class Enemigo {
    int vida,fuerza, resistencia, magia,nivel=1,mundo;
    Estado estado=new Estado();
    Estrategia estrategia;
    boolean muerte=false,defensa=false;
    public void getDescripcion(){}
    public void perderVida(int daño){
        this.resistencia=this.resistencia-daño;
        if(this.resistencia<1)
            muerte=true;
    }
    public void perderMagia(){
        this.magia=this.magia-5;
    }
    public void elegirEstrategia(){
        Random random=new Random();
        if(random.nextBoolean()==false)
            this.estrategia=new AgresivoEstrategia(this);
        else    
            this.estrategia=new DefensivoEstrategia(this);
    }
    public void cambiarDefensa(){
        defensa=!defensa;
    }
    public void quitarDefensa(){
        defensa=false;
    }
    public void cambiarMuerte(){
        this.muerte=!this.muerte;
    }
    public int getFuerza() {
        return fuerza;
    }
    public int getMagia() {
        return magia;
    }
    public int getResistencia() {
        return resistencia;
    }
    public int getNivel() {
        return nivel;
    }
    public boolean getMuerte(){
        return muerte;
    }
    public int getVida() {
        return vida;
    }
    public Estrategia getEstrategia() {
        return estrategia;
    }
    public boolean getDefensa(){
        return defensa;
    }
    public Estado getEstado() {
        return estado;
    }
    public int getMundo() {
        return mundo;
    }
}
