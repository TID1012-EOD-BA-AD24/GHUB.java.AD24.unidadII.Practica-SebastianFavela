package lista;
import java.util.ArrayList;
public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<>();
        colores.add("azul");
        colores.add("rojo");
        colores.add("verde");

        System.out.println("ArrayList: "+colores);

        for(String aux:colores){
            System.out.println("Elemento :"+aux);
        }

        for(int i=0;i<colores.size();i++){
            System.out.println("Valo del elemento "+i+": "+colores.get(i));
        }

        String color = colores.remove(1);

        System.out.println("Elemento removido: "+color);

        System.out.println("ArrayList: "+colores);

        colores.remove("azul");

        System.out.println("ArrayList: "+colores);

    }
    
}
