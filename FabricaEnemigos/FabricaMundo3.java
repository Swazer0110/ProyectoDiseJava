public class FabricaMundo3  implements FabricaEnemigos{
    public Guerrero crearGuerrero(){
        return new GuerreroMundo3();
    }
    public Mago crearMago(){
        return new MagoMundo3();
    }
    public Ladron crearLadron(){
        return new LadronMundo3();
    }
}
