package sobreEscritura;

public class Main {
    public static void main(String[] args) {
        Pobre pobre = new Pobre();
        Rico rico = new Rico();

        pobre.nombre = "Carlos";
        pobre.saludar();
        pobre.salario();
        pobre.comer();

        rico.nombre = "Damaris";
        rico.saludar();
        rico.salario();
        rico.comer();
        rico.invertir();
    }
}
