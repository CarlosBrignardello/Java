import javax.swing.*;

public class Peso {

	public static void main(String[] args) {

//Hombre: altura-110
//Mujer: altura-120
		
		String genero = ""; // Establecemos un String.
		
		do {
			
			genero = JOptionPane.showInputDialog("Introduce tu genero");
			
		}while(genero.equalsIgnoreCase("Hombre")==false && genero.equalsIgnoreCase("Mujer")==false);
		// Mientras nos equivocamos al introducir hombre o mujer vuelve a preguntar.
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm")); // Solicitamos altura y la convertimos a entero.
		int peso = 0;
		
		if(genero.equalsIgnoreCase("Hombre")) {
			peso = altura - 110;
			System.out.println("Tu peso ideal es: " + peso);
			
		}
		else if(genero.equalsIgnoreCase("Mujer")) {
			peso = altura - 120;
			System.out.println("Tu peso ideal es: " + peso);		
		}
	}
}