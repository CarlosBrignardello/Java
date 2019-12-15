public class MatrizBi {

	public static void main(String[] args) {

		int matrizB[][] = {
			{1,2,3,4,5},
			{6,7,8,9,10},
			{11,12,13,14,15},
			{16,17,18,19,20}
			};
		
		for(int fila[]:matrizB) {
			System.out.println("");
			for(int columna: fila) {
				System.out.print(columna + " ");
			}
		}
	}
}