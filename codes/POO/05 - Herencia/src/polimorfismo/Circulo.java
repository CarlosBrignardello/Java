package polimorfismo;

public class Circulo implements Figuras {
    String figura = "Circulo";
    double radio;

    public Circulo(double radio){
        this.radio = radio;
    }
    public String getFigura(){
        return figura;
    }
    @Override
    public double getArea() {
        return PI * this.radio * this.radio;
    }
}
