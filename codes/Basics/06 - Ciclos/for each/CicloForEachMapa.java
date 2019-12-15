import java.util.HashMap;
import java.util.Map;

class CicloForEachMapa{
    public static void main(String []args){

        Map<Integer, String> nombres = new HashMap<>();
        nombres.put(1, "Carlos");
        nombres.put(2, "Damaris");
        nombres.put(3, "Ale");

        nombres.forEach((id, name) -> {
            System.out.println("\nNombre: " + name + "\nID: " + id);
        });
    }
}