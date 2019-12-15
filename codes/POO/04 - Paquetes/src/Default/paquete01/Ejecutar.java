package Default.paquete01;

/*
Utilizamos esta clase para obtener atributos de una clase por defecto ubicada en el mismo paquete.
*/

import java.net.http.HttpRequest;

public class Ejecutar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Herencia estudiante = new Herencia();

        p.edad = 35;
        System.out.println(p.edad);
        estudiante.edad = 21;
        estudiante.saludar();
    }
}
