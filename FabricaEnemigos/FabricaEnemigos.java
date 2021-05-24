package FabricaEnemigos;

public interface FabricaEnemigos {          //Interfaz para cada una de las fabricas de cada mundo
    Guerrero crearGuerrero();
    Mago crearMago();
    Ladron crearLadron();
}
