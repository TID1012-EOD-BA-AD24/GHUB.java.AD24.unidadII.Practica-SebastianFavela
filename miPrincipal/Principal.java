package miPrincipal;
import pila.Pila;
import java.util.Stack;


public class Principal {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
       // System.out.println(new Principal().getGreeting()); 
       //Crear una nueva pilla de Enteros
       Pila<Integer> pila1 = new Pila<Integer>();
       //apilar datos Enteros
       pila1.apilar(2);
       pila1.apilar(5);
       pila1.apilar(7);
       System.out.println("El tope de la pila  es "+pila1.cima());
       //se desapila
       pila1.retirar();//7
       System.out.println("El tope de la pila  es "+pila1.cima());
       //se desapila
       pila1.retirar();//5
       System.out.println("El tope de la pila  es "+pila1.cima());
       //se desapila
       pila1.retirar(); //2
       System.out.println("El tope de la pila  es "+pila1.cima());
       System.out.println("Pila Vacia? "+pila1.esVacia());

       //  USO DE LA CLASE STACK
       //crear una pila de Enteros
       Stack<Integer> pila = new Stack<Integer>();
       //apilar elementos
       pila.push(2);
       pila.push(5);
       pila.push(7);
       System.out.println("El tope de la pila;"+pila.peek());
       //desapilamos elementos
       pila.pop();
       System.out.println("El tope de la pila;"+pila.peek());
       pila.pop();
       System.out.println("El tope de la pila;"+pila.peek());

       pila.pop();
       //System.out.println("El tope de la pila;"+pila.peek()); //pendiente tratar la excepcion
       pila.push(10);
       pila.push(8);
       pila.push(20);
       System.out.println("El elemento 8 se encuentra en la poscion: "+pila.search(8));
       System.out.println("El elemento 10 se encuentra en la poscion: "+pila.search(10));
       System.out.println("El elemento 20 se encuentra en la poscion: "+pila.search(20));





    }
}