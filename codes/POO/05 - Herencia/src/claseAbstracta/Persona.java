package claseAbstracta;

public abstract class Persona { // Creamos una clase abstracta
    public String nombre;
    public int edad;

// No utilizamos constructores
/*    public Persona(){
        this.nombre = "Desconocido";
    }
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
*/
    public void saludar(String mensaje){
            System.out.println(mensaje);
    }

    public abstract void reirse(); // Creamos método que debera ser implementado por otras clases.
}