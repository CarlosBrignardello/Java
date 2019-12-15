class Incremento{
    public static void main(String []args){
        int valorA = 20;
        int valorB = valorA++; /* Post incremento */
        int valorC = ++valorA; /* Pre incremento */
        
        System.out.println("\nValor inicial: 20\n" + "\nVariable Original: " + valorA + "\nPost Incremento: " + valorB + "\nPre incremento: " + valorC);
    }
}