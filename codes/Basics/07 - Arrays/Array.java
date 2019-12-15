public class Array {

	public static void main(String[] args) {
		
	int[] matriz = new int[5];  //Forma de declarar matriz.
	int matriz2[] = new int[5]; //Forma de declarar matriz - Recomendada.
	int matriz3[] = {22,55,2,5,7};  //Forma de declarar una matriz(Estableciendo sus valores).
	
	matriz[0] = 4;	// Establecemos valores a la matriz ``matriz``.
	matriz[1] = 6;
	matriz[2] = 8;
	matriz[3] = 11;
	matriz[4] = 7;
		
	for(int i = 0; i < matriz.length; i++) {	// Mostramos todos los valores de la matriz.
		
		System.out.println("Valores Matriz: ");
		System.out.println(matriz[i]);		
	    }
	}
}