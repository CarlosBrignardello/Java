import javax.swing.*;

public class ClaseJOptionPane {

	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
		System.out.println("Hola " + nombre + ".");
		
		
		String edad = JOptionPane.showInputDialog(nombre + ", introduce tu edad porfavor: ");
		int edadInt = Integer.parseInt(edad);
		System.out.println("Tienes " + edad + " Años.");
		
		String año = JOptionPane.showInputDialog(nombre + ", introduce un número, este sera sumado a tu edad.");
		int añoInt = Integer.parseInt(año);
		System.out.println(nombre + ", en " + año + " años más tendras: " + (edadInt+añoInt));
	}
}