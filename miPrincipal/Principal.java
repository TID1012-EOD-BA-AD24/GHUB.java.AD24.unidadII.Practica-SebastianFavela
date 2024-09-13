package miPrincipal;
import pila.Pila;

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





    }
}