package Estado;

public class EstadoNormal implements EstadosPersonaje{
    public void next(Estado estado){
        estado.setEstadoSemaforo(new EstadoConfuso());
    }
    public void printEstado(Estado estado){
        estado.setDescrString("Normal");
    }
}
