package Main;
import FabricaEnemigos.*;
import java.util.Random;

public class Combate {

    public void combatir(Enemigo jugador,int num_enemigo){
        GestorEnemigos gestor=new GestorEnemigos(0,num_enemigo);
        Calculadora calculadora=Calculadora.instance();
        Random rd = new Random();
        gestor.getEnemigo().getDescripcion();
        boolean b=rd.nextBoolean();
        int decision;
        while(jugador.getMuerte()==false&&gestor.getEnemigo().getMuerte()==false){
            if(b==true){
                System.out.println("Turno Jugador");
                gestor.getEnemigo().perderVida(calculadora.dañoFisico(jugador));
                if(gestor.getEnemigo().getMuerte()==true){
                    System.out.println("WIN");
                    return;
                }
            }
            else{
                System.out.println("Turno Enemigo");
                decision=gestor.getEnemigo().getEstrategia().decidirAccion();
                if(decision!=0){
                    if(jugador.getDefensa()==true){
                        jugador.cambiarDefensa();
                    }
                    else
                        jugador.perderVida(decision);
                }
                else{
                    gestor.getEnemigo().cambiarDefensa();
                }
                if(jugador.getMuerte()==true){
                        System.out.println("GAME OVER");
                        return;
                }
                System.out.println(jugador.getResistencia());
            }
            b=!b;
        }
    }
    
    public static void main(String[] args) {
        Jugador jugador = new Jugador();
        Combate combate=new Combate();
        combate.combatir(jugador,0);
    }
}
