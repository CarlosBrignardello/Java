class IfContinue {
    public static void main(String []args){
        int i = 0;
        do{
            i++;
            if (i % 2 == 0){
                System.out.println("El valor es " + i);
                continue;
            }
            System.out.println("No se cumple la condición i == " + i);

        }while(i < 5);
    }
}