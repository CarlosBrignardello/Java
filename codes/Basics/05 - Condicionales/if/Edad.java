import java.util.*;

public class Edad {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("\nIngresa tu edad: ");
		int edad = entrada.nextInt();

		if(edad<18) {
			System.out.println("Eres Menor");
		}
		else if(edad <= 30) {
			System.out.println("Eres Joven");
		}
		else if(edad <= 50) {
			System.out.println("Eres Adulto");
		}
		else{
			System.out.println("Eres Anciano");
		}
	}
}