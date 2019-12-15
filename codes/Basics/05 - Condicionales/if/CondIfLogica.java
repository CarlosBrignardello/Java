class CondIfLogica{
    public static void main(String []args){
        final int MAYORIA_EDAD = 18;
        int edad = 17;
        boolean esHombre = true;
        if(edad >= MAYORIA_EDAD && esHombre == true){
            System.out.println("\nEs mayor de edad y es hombre");
        }
        else if(edad >= MAYORIA_EDAD){
            System.out.println("\nEs mayor de edad");
        }
        else if(esHombre == true){
            System.out.println("\nEs hombre");
        }
        else if(edad < MAYORIA_EDAD){
            System.out.println("\nEs menor de edad");
        }
    }
}