import java.util.*;
import javax.swing.*;

public class FigurasGeometricas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nSeleccione una opción: \n1) Cuadrado\n2) Circulo\n3) Triangulo\n4) Rectangulo");
		
		int seleccion = entrada.nextInt();
		
		switch(seleccion){
		case 1:
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			System.out.println("El Área del cuadrado es: " + Math.pow(lado, 2));
			break;
		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El Área del rectangulo es: " + (base*altura));
			break;
		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El Área del triangulo es: " + ((base*altura)/2));
			break;
		case 4:
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			System.out.println("El Área del circulo es: ");
			System.out.printf("%1.2f",Math.PI*(Math.pow(radio, 2)));
			break;
			
		default:
			System.out.println("Ingrese una opción valida.");
		}
	}
}