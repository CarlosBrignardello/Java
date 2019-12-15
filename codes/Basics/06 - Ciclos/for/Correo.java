import javax.swing.JOptionPane;

public class Correo {

	public static void main(String[] args) {
	
		boolean arroba = false; // Lo utilizamos para indicar la existencia o no existencia del arroba.
		
		String mail = JOptionPane.showInputDialog("Introduce tu correo: ");
		
		for(int i = 0; i < mail.length();i++ ) { //La idea es que el for recorra todo el texto en busca del @.
			//mail.length averigua el largo del texto introducido, asi nos aseguramos que siempre se busque en todo el String.
		
			if(mail.charAt(i)=='@') {	//El metodo charAt compara cada letra para ver si es igual a @.
				arroba = true;	// Si la letra evaluada es igual a @ entonces la variable sera verdadera.
			}
		}
		
		if(arroba == true) {	// Una vez se encuentra el arroba.
			
			System.out.println("Correcto");
		}
		else {
			System.out.println("Mail Incorrecto");
		}
			
		}
}