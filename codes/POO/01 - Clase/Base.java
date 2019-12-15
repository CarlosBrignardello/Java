class Base{
    public static void main(String []args){
        Persona persona = new Persona(); // Creamos instancia
        
        persona.setNombre("Carlos Brignardello");
        persona.setEdad(21);
        persona.setPeso(84f);
        persona.setEstatura(1.68f);

        System.out.println("\nNombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Peso: " + persona.getPeso());
        System.out.println("Estatura: " + persona.getEstatura());
    }
}