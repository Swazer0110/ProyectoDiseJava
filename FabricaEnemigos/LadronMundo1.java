package FabricaEnemigos;

public class LadronMundo1 extends Ladron{
    public LadronMundo1(){
        resistencia = 12;
        fuerza = 12;
        magia = 5;
        vida=resistencia;
        mundo=1;
        elegirEstrategia();
    }
}
