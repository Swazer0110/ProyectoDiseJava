package FabricaEnemigos;

public class LadronMundo2 extends Ladron{
    public LadronMundo2(){
        resistencia = 10;
        fuerza = 10;
        magia = 5;
        vida=resistencia;
        mundo=2;
        elegirEstrategia();
    }
}
