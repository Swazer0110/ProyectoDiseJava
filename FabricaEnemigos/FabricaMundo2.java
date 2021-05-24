package FabricaEnemigos;

public class FabricaMundo2 implements FabricaEnemigos{
    public Guerrero crearGuerrero(){
        return new GuerreroMundo2();
    }
    public Mago crearMago(){
        return new MagoMundo2();
    }
    public Ladron crearLadron(){
        return new LadronMundo2();
    }
}
