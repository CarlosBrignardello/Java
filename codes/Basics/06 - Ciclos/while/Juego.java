import java.util.*;
public class Juego {

	public static void main(String[] args) {
		
		int random = (int)(Math.random()*100); 
		//System.out.printf("%1.0f",(Math.random()*100));
		System.out.println("\nEl número es " + random);

		Scanner entrada = new Scanner(System.in); // Creamos un objeto de la clase Scanner para poder introducir valores.
		
		int numero = 0;
		int intentos = 0;
		
		while(numero!=random) {
			System.out.println("Introduce un número: ");
			numero = entrada.nextInt(); // Establecemos numero como igual al valor introducido por consola.
			
			if(random < numero) {
				System.out.println("Más bajo"); // Se nos indica que el numero es mas pequeño.
				intentos++; // El contador de intentos incrementa
			}
			else if(random > numero) {
				System.out.println("Más alto");
				intentos++;
			}
		}
		System.out.println("Correcto!"); // Salimos del bucle cuando el valor que introducimos es igual al valor aleatorio.
		System.out.println("Intentos: " + intentos); //Mostramos la cantidad de intentos.
		
	}

}