class BaseC{
    public static void main(String []args){
        PersonaC persona = new PersonaC(); // Creamos instancia
        PersonaC damaris = new PersonaC("Damaris Bejar", 21, 68f, 1.65f);
        
        persona.setNombre("Carlos Brignardello");
        persona.setEdad(21);
        persona.setPeso(84f);
        persona.setEstatura(1.68f);

        System.out.println("\nNombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Peso: " + persona.getPeso());
        System.out.println("Estatura: " + persona.getEstatura());
        persona.saludar();

        System.out.println("\nNombre: " + damaris.getNombre());
        System.out.println("Edad: " + damaris.getEdad());
        System.out.println("Peso: " + damaris.getPeso());
        System.out.println("Estatura: " + damaris.getEstatura());
    }
}