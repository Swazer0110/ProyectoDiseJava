package Main;
import FabricaEnemigos.Enemigo;

public final class Calculadora {                //Clase para el calculo de daños (Singleton)
    private static Calculadora instance;
    private Calculadora(){
    }
    public static Calculadora instance(){       //metodo para instanciar la claculadora 
        if(instance==null)
            instance=new Calculadora();
        return instance;
    }
    public int dañoFisico(Enemigo personaje) {  //metodo para calcualr un ataque fisico
        return personaje.getFuerza();
    }
    public int dañoMagico(Enemigo personaje){   //metodo para calcular un ataque magico
        return (personaje.getFuerza()/2)+personaje.getFuerza();
    }
}
