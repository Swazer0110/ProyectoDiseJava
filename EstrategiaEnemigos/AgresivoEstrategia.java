package EstrategiaEnemigos;
import AlgoritmoEleccion.EleccionAgresiva;
import AlgoritmoEleccion.TemplateEleccion;
import FabricaEnemigos.Enemigo;

public class AgresivoEstrategia implements Estrategia{
    private TemplateEleccion eleccion;
    public AgresivoEstrategia(Enemigo enemigo){
        eleccion=new EleccionAgresiva(enemigo);
    }
    public int decidirAccion(){
        return eleccion.eleccion();
    }
}
