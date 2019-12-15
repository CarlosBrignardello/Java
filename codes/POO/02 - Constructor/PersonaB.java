class PersonaB{
    // Atributos
    // private permite proteger los atributos los metodos
    private String nombre; 
    private int edad;
    private float peso;
    private float estatura;

    // Constructor
    public PersonaB(){
        this.nombre = "Desconocido";
        this.edad = 0;
        this.peso = 0f;
        this.estatura = 0f;
    }
    public PersonaB(String name, int edad, float peso, float estatura){ // Sobre carga: escribir un método con el mismo nombre, pero con distinta firma
        this.nombre = name;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }

    // Métodos para llegar a los atributos
    void setNombre(String n){
        this.nombre = n;
    }
    String getNombre(){
        return this.nombre;
    }
    void setEdad(int e){
        if(e < 0 || e > 120){
            System.out.println("Edad no válida");
        }
        else{
            this.edad = e;
        }
    }
    int getEdad(){
        return this.edad;
    }
    void setPeso(float p){
        this.peso = p;
    }
    float getPeso(){
        return this.peso;
    }
    void setEstatura(float e){
        this.estatura = e;
    }
    float getEstatura(){
        return this.estatura;
    }
}