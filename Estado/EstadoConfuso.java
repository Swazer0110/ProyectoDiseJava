package Estado;

public class EstadoConfuso implements EstadosPersonaje{
    public void next(Estado estado){
        estado.setEstadoSemaforo(new EstadoNormal());
    }
    public void printEstado(Estado estado){
        estado.setDescrString("Confuso");
    }
}
