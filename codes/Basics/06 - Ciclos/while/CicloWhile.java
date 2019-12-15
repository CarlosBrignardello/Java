class CicloWhile{
    public static void main(String []args){
        int i = 0;

        while (i < 10){
            System.out.println("El valor es: " + i);
            i++;
            if(i == 5){
                break;
            }
        }
    }
}