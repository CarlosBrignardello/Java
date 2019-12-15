public class Cien {

	public static void main(String[] args) {

		int matriz[] = new int[100];
		
		for(int i=0; i<matriz.length; i++) {
			
			matriz[i] = (int)Math.round(Math.random()*100);
			
			
		}
		int conteo = 0;
		for(int valores:matriz) {
			conteo++;
			System.out.println("Número Aleatorio " + conteo + ": " + valores);
			
		}
	}
}