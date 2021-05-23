import FabricaEnemigos.*;
import java.util.Random;

public class Combate {

    public void combatir(Enemigo jugador,int num_enemigo){
        GestorEnemigos gestor=new GestorEnemigos(0,num_enemigo);
        Calculadora calculadora=Calculadora.instance();
        Random rd = new Random();
        gestor.getEnemigo().getDescripcion();
        if(rd.nextBoolean()==false){
            System.out.println("Turno Jugador");
            jugador.perderVida(calculadora.dañoFisico(gestor.getEnemigo()));
            if(jugador.getMuerte()==true){
                System.out.println("GAME OVER");
                return;
            }
        }
        while(jugador.getMuerte()==false||gestor.getEnemigo().getMuerte()==false){
            System.out.println("Turno Enemigo");
            gestor.getEnemigo().perderVida(calculadora.dañoFisico(jugador));
            if(gestor.getEnemigo().getMuerte()==true){
                System.out.println("WIN");
                return;
            }
            System.out.println("Turno Jugador");
            jugador.perderVida(calculadora.dañoFisico(gestor.getEnemigo()));
            if(jugador.getMuerte()==true){
                System.out.println("GAME OVER");
                return;
            }
        }
    }
    public static void main(String[] args) {
        Jugador jugador = new Jugador();
        Combate combate=new Combate();
        combate.combatir(jugador,0);
    }
}
