class MetodoBurbuja{
    public static void main(String []args){

        int []valores = new int [4];

        for (int i = 0; i < valores.length; i++) { /* Asignamos valores aleatorios al array */
            valores[i] = (int) (Math.random() * 100);
        }
        for(int valor : valores){ /* Mostramos los valores nuevos */
            System.out.println("Valores: " + valor);
        }
        for(int reco = 0; reco < valores.length - 1; reco++){ /* Ordenamos con el metodo burbuja */
            for(int element = 0; element < valores.length -1; element++){
                if( valores[element] > valores[element + 1]){
                    int temp = valores[element];
                    valores[element] = valores[element + 1];
                    valores[element + 1] = temp;
                }
            }
        }
        System.out.println("\n");
        for(int valor : valores){ /* Mostramos los valores nuevos */
            System.out.println("Valores ordenados: " + valor);
        }
    }
}