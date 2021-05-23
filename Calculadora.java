import FabricaEnemigos.Enemigo;

public final class Calculadora {
    private static Calculadora instance;
    private Calculadora(){
    }
    public static Calculadora instance(){
        if(instance==null)
            instance=new Calculadora();
        return instance;
    }
    public int dañoFisico(Enemigo personaje) {
        return personaje.getFuerza();
    }
}
