class BusquedaLineal{
    public static void main(String []args){
        int []valores = new int [4];

        for (int i = 0; i < valores.length; i++) { /* Asignamos valores aleatorios al array */
            valores[i] = (int) (Math.random() * 100);
        }
        for(int valor : valores){ /* Mostramos los valores nuevos */
            System.out.println("Valores: " + valor);
        }

        valores[2] = 50;
        int busqueda = 50;

        for(int i = 0; i < valores.length; i++){
            if(valores[i] == busqueda){ /* Busqueda Lineal */
                System.out.println("El número: " + busqueda + " existe en el índice #" + i);
                break;
            }
        }
    }
}