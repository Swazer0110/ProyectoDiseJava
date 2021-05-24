package FabricaEnemigos;

public class Ladron extends Enemigo{
    
    public void getDescripcion(){
        System.out.println("Ladron Mundo"+this.getMundo()+":\tResistencia: " + resistencia + "\tFuerza: " + fuerza + "\tMagia: " + magia);
    }
}
