package Estado;

public class EstadoConfuso implements EstadosPersonaje{     //Clase para definir el estado de confuso del personaje
    public void next(Estado estado){
        estado.setEstado(new EstadoNormal());
    }
    public void printEstado(Estado estado){
        estado.setDescrString("Confuso");
    }
}
