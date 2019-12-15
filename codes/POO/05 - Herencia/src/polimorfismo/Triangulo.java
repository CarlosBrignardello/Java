package polimorfismo;

public class Triangulo implements Figuras{
    String figura = "Triangulo";
    double base;
    double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public String getFigura(){
        return figura;
    }

    @Override
    public double getArea() {
        return (this.base * this.altura) / 2;
    }

}
