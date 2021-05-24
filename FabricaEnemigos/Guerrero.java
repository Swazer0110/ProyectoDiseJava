package FabricaEnemigos;

public class Guerrero extends Enemigo{
    
    public void getDescripcion(){
        System.out.println("Guerrero Mundo"+this.getMundo()+":\tResistencia:"+ resistencia + "\tFuerza: " + fuerza + "\tMagia: " + magia);
    }
}
