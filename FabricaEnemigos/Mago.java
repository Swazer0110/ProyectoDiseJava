package FabricaEnemigos;

public class Mago extends Enemigo{

    public void getDescripcion(){
        System.out.println("Mago Mundo"+this.getMundo()+":\tResistencia: " + resistencia + "\tFuerza: " + fuerza + "\tMagia: " + magia);
    }
}
