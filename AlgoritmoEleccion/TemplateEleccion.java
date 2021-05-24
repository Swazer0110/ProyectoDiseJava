package AlgoritmoEleccion;
import FabricaEnemigos.Enemigo;

public abstract class TemplateEleccion {
    Enemigo enemigo;
    public final int eleccion(){
        if(paso1()==true){
            return paso2();
        }
        else
            return 0;
    }
    public abstract boolean paso1();
    public abstract int paso2();
}
