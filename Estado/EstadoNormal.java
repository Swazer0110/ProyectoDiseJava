package Estado;

public class EstadoNormal implements EstadosPersonaje{          //Clase para definir el eatsod normal del personaje
    public void next(Estado estado){
        estado.setEstado(new EstadoConfuso());
    }
    public void printEstado(Estado estado){
        estado.setDescrString("Normal");
    }
}
