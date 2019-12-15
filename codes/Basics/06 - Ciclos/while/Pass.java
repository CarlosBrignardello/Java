import javax.swing.JOptionPane;

public class Pass {

	public static void main(String[] args) {
	
		String clave = "Carlos";
		String pass = "";
		
		while(clave.equals(pass)==false) {
			pass = JOptionPane.showInputDialog("Ingresa contraseña");
		
			if(clave.equals(pass)==false) {	
				System.out.println("Contraseña incorrecta");
			}	
		}
		System.out.println("Muy bien!");
	}
}