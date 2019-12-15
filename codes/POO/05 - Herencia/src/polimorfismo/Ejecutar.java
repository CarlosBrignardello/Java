package polimorfismo;

public class Ejecutar {
    public static void main(String[] args) {
    Figuras formas[] = new Figuras[3];
    formas[0] = new Rectangulo(20, 30);
    formas[1] = new Circulo(15);
    formas[2] = new Triangulo(10, 20);

    for(Figuras v: formas){
        System.out.println("\nEl área del " + v.getFigura() + " es " + v.getArea());
        }
    }
}
