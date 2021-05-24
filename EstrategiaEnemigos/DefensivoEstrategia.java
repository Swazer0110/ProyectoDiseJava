package EstrategiaEnemigos;
import AlgoritmoEleccion.EleccionAgresiva;
import AlgoritmoEleccion.TemplateEleccion;
import FabricaEnemigos.Enemigo;

public class DefensivoEstrategia implements Estrategia{ //Clase para las estrategias defensivas de los enemigos
    private TemplateEleccion eleccion;
    public DefensivoEstrategia(Enemigo enemigo){
        eleccion=new EleccionAgresiva(enemigo);
    }
    public int decidirAccion(){
        return eleccion.eleccion();
    }
}