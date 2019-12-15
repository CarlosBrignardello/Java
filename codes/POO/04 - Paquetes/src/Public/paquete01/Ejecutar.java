package Public.paquete01;

/*
Utilizamos esta clase para obtener atributos de una clase publica ubicada en el mismo paquete.
*/

public class Ejecutar {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.edad = 35;
        System.out.println(p.edad);
    }
}
