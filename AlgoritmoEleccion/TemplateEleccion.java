package AlgoritmoEleccion;
import FabricaEnemigos.Enemigo;

public abstract class TemplateEleccion {   //Clase abstracta para el cuerpo del algoritmo a seguir por los enemigos en la toma de acciones
    Enemigo enemigo;                       //(Template)
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
