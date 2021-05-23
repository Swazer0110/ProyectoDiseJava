package FabricaEnemigos;

public abstract class Enemigo {
    int fuerza, resistencia, magia,nivel=1;
    boolean muerte=false;
    public void getDescripcion(){}
    public void perderVida(int daño){
        this.resistencia=this.resistencia-daño;
        if(this.resistencia<1)
            muerte=true;
    }
    public int getFuerza() {
        return fuerza;
    }
    public int getMagia() {
        return magia;
    }
    public int getResistencia() {
        return resistencia;
    }
    public int getNivel() {
        return nivel;
    }
    public boolean getMuerte(){
        return muerte;
    }
}
