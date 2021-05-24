package Estado;

public class Estado {                               //Clase para controlar los tipos de estado de los personajes durante el combate (State)
    EstadosPersonaje estado=new EstadoNormal();    
    String descrString=new String("Normal");
    public void nextEstado(){
        estado.next(this);
        estado.printEstado(this);
    }

    public void printEstado(){
        estado.printEstado(this);
    }

    public void setEstado(EstadosPersonaje estado) {
        this.estado = estado;
    }

    public EstadosPersonaje getEstado() {
        return estado;
    }
    public void setDescrString(String descrString) {
        this.descrString = descrString;
    }
    public String getDescrString() {                            //Metodo para recibir la string con el estado del perosnaje
        return descrString;
    }
}
