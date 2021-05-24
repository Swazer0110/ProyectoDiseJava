package Estado;

public class Estado {
    EstadosPersonaje estado=new EstadoNormal();
    String descrString=new String("Normal");
    public void nextEstado(){
        estado.next(this);
        estado.printEstado(this);
    }

    public void printEstado(){
        estado.printEstado(this);
    }

    public void setEstadoSemaforo(EstadosPersonaje estado) {
        this.estado = estado;
    }

    public EstadosPersonaje getEstadoSemaforo() {
        return estado;
    }
    public void setDescrString(String descrString) {
        this.descrString = descrString;
    }
    public String getDescrString() {
        return descrString;
    }
}
