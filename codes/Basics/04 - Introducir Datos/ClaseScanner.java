import java.util.*;

public class ClaseScanner {

	public static void main(String[] args) {
		Scanner LeerDato = new Scanner(System.in);
		
		System.out.println("\nIngresa tu nombre:");
		String Nombre = LeerDato.nextLine();
		
		System.out.println("Ingresa tu edad:");
		int Edad = LeerDato.nextInt();
		
		System.out.println("Ingresa tu Cedula");
		int Identidad = LeerDato.nextInt();
		
		System.out.println("\nHola " + Nombre + ".");	
		System.out.println("Tu edad es: " + Edad + " Años.");
		System.out.println("Tu Cedula es: " + Identidad + ".");
	}
}