package herencia.clases;

public class Profesor extends Persona { // Heredamos las caracteristicas de otra clase.
    public void enseñar(String asignatura, int horas){
        System.out.println("Voy a enseñarte " + asignatura + " durante " + horas + " horas.");
    }
}
