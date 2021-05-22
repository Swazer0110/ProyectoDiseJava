public class FabricaMundo1 implements FabricaEnemigos{
    public Guerrero crearGuerrero(){
        return new GuerreroMundo1();
    }
    public Mago crearMago(){
        return new MagoMundo1();
    }
    public Ladron crearLadron(){
        return new LadronMundo1();
    }
}
