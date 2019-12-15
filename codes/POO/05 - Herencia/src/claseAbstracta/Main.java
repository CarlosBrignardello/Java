package claseAbstracta;

public class Main {
    public static void main(String[] args) {
    //  Persona pobre = new Persona(); // No podemos instanciar, no se pueden crear objetos
    //  Las clases que hereden de una clase abstracta podran utilizar todas sus caracteristicas
        PersonaNivelDos carlos = new PersonaNivelDos();
        carlos.reirse();
    }
}
