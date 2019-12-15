import java.util.Scanner;

public class JuegoDoWhile {

	public static void main(String[] args) {
				
		int random = (int)(Math.random()*100);
		System.out.println("El número es " + random);

		Scanner entrada = new Scanner(System.in);

		int numero = 0;
		int intentos = 0;

		do {	// Evaluamos Los valores 
			System.out.println("Introduce un número: ");
			numero = entrada.nextInt();

			if(random < numero) {
				System.out.println("Más bajo");
				intentos++;
			}
			else if(random > numero) {
				System.out.println("Más alto");
				intentos++;
			}
		}
		while(numero!=random);	// Si se sigue cumpliendo esta condición se repite lo anterior.
		System.out.println("Correcto!"); // Si no se cumple ejecuta en orden y sale del bucle.
		System.out.println("Intentos: " + intentos);	
			}
	}