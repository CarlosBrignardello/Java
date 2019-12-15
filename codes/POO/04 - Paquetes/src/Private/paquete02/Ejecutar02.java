package Private.paquete02;
import Private.paquete01.Persona;    // Importamos el paquete y la clase

/*
Utilizamos esta clase para obtener atributos de una clase privada ubicada en otro paquete, NO es posible
sin el uso de métodos getters y setters.
*/

public class Ejecutar02 {
    public static void main(String[] args) {
        Persona p = new Persona();
        //p.edad = 10;
        //System.out.println(p.edad);
    }
}
