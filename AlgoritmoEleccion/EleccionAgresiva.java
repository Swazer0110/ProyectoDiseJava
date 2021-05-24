package AlgoritmoEleccion;
import java.util.Random;
import FabricaEnemigos.Enemigo;
import Main.*;

public class EleccionAgresiva extends TemplateEleccion{
    public EleccionAgresiva(Enemigo enemigo){
        this.enemigo=enemigo;
    }
    public boolean paso1(){
        Random random = new Random();
        if((enemigo.getResistencia()<=enemigo.getVida()/3)&&(random.nextInt(3)==2)){
            return false;
        }
        else{
            return true;
        }
    }
    public int paso2(){
        Calculadora calculadora = Calculadora.instance();
        if(enemigo.getMagia()!=0){
            enemigo.perderMagia();
            return calculadora.dañoMagico(enemigo);
        }
        else
            return calculadora.dañoFisico(enemigo);
    }
}
