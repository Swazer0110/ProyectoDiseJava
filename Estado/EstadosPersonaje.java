package Estado;

public interface EstadosPersonaje {             //Interfaz para definir los tipos de estado (State)
    void next(Estado estado);
    void printEstado(Estado estado);
}
