package hash;
import java.util.Hashtable;


public class TestHashTable {
    public static void main(String[] args) {
        //instanciar varias personas
        Persona p1 = new Persona("Pablo",33,"Argentino");
        Persona p2 = new Persona("Juan", 25, "Mexicano");
        Persona p3 = new Persona("Pedro",18, "Español");

        //crear una tabla hash
        Hashtable<String,Persona> tabla = new Hashtable<String,Persona>();
        //agregar las personas a la tabla tomando su nombre como clave
        tabla.put(p1.getNombre(),p1);
        tabla.put(p2.getNombre(),p2);
        tabla.put(p3.getNombre(),p3);

        //acceder a cada elemento de la tabla por su clase
        System.out.println(tabla.get("Pablo"));
        System.out.println(tabla.get("Juan"));
        System.out.println(tabla.get("Pedro"));

        //acceo a un elemento que no exite, regresa un null
        System.out.println(tabla.get("Luis"));

        //Recorrer todos los elementos de la collección y mostrarlos por pantalla
        

     
        
    }
    
}
