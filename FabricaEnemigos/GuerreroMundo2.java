package FabricaEnemigos;

public class GuerreroMundo2 extends Guerrero {
    public GuerreroMundo2() {
        resistencia = 15;
        fuerza = 8;
        magia = 5;
        vida=resistencia;
        mundo=2;
        elegirEstrategia();
    }
}
