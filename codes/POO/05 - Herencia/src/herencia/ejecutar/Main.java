package herencia.ejecutar;

import herencia.clases.Persona;
import herencia.clases.Profesor;

public class Main {
    public static void main(String[] args) {
        Persona carlos = new Persona();
        Profesor juan = new Profesor();
        carlos.nombre = "Carlos";
        carlos.saludar();
        juan.nombre = "Juan";
        juan.saludar();
        juan.comer();
        juan.enseñar("Redes IV", 7);
    }
}
