package sobreEscritura;

public class Rico extends Pobre {

    public void invertir(){
        System.out.println("Voy a invertir, como me sobra el dinero...");
    }

    @Override
    public void comer() {
        System.out.println("Iré a un restaurant");
    }
}