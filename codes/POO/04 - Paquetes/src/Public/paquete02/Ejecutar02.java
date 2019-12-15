package Public.paquete02;
import Public.paquete01.Persona;    // Importamos el paquete y la clase

/*
Utilizamos esta clase para obtener atributos de una clase publica ubicada en otro paquete.
*/

public class Ejecutar02 {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.edad = 10;
        System.out.println(p.edad);
    }
}
