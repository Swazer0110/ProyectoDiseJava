package Main;
import java.util.Random;

import FabricaEnemigos.*;
public class MainJuego {
    public static void main(String[] args) {
        int c=1,i=0,j=1,mundo;
        Jugador jugador = new Jugador();
        Random rd = new Random();
        mundo=rd.nextInt(4);
        while(c==1){
         if(i==3){
            mundo=rd.nextInt(4);
            i=0;
         }
         System.out.println("Ronda "+j);
         Combate combate=new Combate();
         c=combate.combatir(jugador,mundo,rd.nextInt(4));
         i++;
         j++;
        }
        j--;
        System.out.println("Game Over: "+j+" rondas");
    }
}
