import javax.swing.JOptionPane;

public class CorreoMejorado {

	public static void main(String[] args) {
	
		int arroba = 0;	// Ahora lo establecemos como int para poder llevar una cuenta de los @s identificados.
		boolean punto = false;
		
		String mail = JOptionPane.showInputDialog("Introduce tu correo: ");
		
		for(int i = 0; i < mail.length(); i++ ) {
	
			
			if(mail.charAt(i)=='@') {
				
				arroba++;	
			}
			if(mail.charAt(i)=='.') { // Ahora debemos determinar que tenga punto.
				punto = true;	
			}
		}
		
		if(arroba == 1 && punto == true) {
			
			System.out.println("Correcto!");
		}
		else {
			System.out.println("Mail Incorrecto");
		}
			
		}

}