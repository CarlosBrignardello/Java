class CicloFor{
    public static void main(String []args){
        for( int i = 0; i < 10; i++){
            System.out.println("Valor: " + i);
            if(i == 5){
                break;
            }
        }
    }
}