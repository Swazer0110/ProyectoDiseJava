package FabricaEnemigos;

public class GestorEnemigos {
    private FabricaEnemigos fabrica;
    private Enemigo enemigo;
    public GestorEnemigos(int mundo,int enemigo){
        switch (mundo) {
            case 1:
                this.fabrica=new FabricaMundo1();
                break;
            case 2:
                this.fabrica=new FabricaMundo2();
                break;
            case 3:
                this.fabrica=new FabricaMundo3();
                break;
            default:
                this.fabrica=new FabricaMundo1();
                break;
        }
        switch (enemigo) {
            case 1:
                this.enemigo=fabrica.crearGuerrero();
                break;
            case 2:
                this.enemigo=fabrica.crearLadron();
                break;
            case 3:
                this.enemigo=fabrica.crearMago();
                break;
            default:
                this.enemigo=fabrica.crearGuerrero();
                break;
        }
    }

    public void recibeAtaque(int daño){
        this.enemigo.perderVida(daño);
    }
    public Enemigo getEnemigo() {
        return enemigo;
    }
    public FabricaEnemigos getFabrica() {
        return fabrica;
    }
    public void setEnemigo(Enemigo enemigo) {
        this.enemigo = enemigo;
    }
    public void setFabrica(FabricaEnemigos fabrica) {
        this.fabrica = fabrica;
    }
    
}
