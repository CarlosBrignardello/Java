package claseAbstracta;

public class PersonaNivelDos extends Persona {

    // Al heredar de una clase abstacta debemos sobre escribir obligatoriamente
    // el contenido de los métodos abstractos de la clase.
    @Override
    public void reirse() {
        System.out.println("La clase abstracta me ha heredado esta capacidad\nJAJAJAJAJA");
    }
}


