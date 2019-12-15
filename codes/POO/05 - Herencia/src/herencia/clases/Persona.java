package herencia.clases;

// Generamos una clase que sera heredada

public class Persona {
    public String nombre;
    public int edad;
    public float altura;
    public float peso;

    public void saludar(){
        System.out.println("Hola soy: " + nombre);
    }

    public void comer(){
        System.out.println("Para esta basura de comida mejor no me des nada");
    }
}
