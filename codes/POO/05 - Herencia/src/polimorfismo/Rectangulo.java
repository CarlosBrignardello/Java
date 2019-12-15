package polimorfismo;

public class Rectangulo implements Figuras{
    String figura = "Rectangulo";
    double alto;
    double ancho;

    public Rectangulo(double alto, double ancho){
        this.alto = alto;
        this.ancho = ancho;
    }
    public String getFigura(){
        return figura;
    }
    @Override
    public double getArea() { // Este proceso se denomina dar un comportamiento
        return this.alto * this.ancho;
    }
}
