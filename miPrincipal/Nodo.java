package miPrincipal;
public class Nodo <T> {
    //Atributo valor de tipo T. Almacena la referencia al
    //objeto que se guarda en el nodo
    private T valor;
    //Referencia al siguiente nodo enlazado
    Nodo<T> siguiente;
    //constructor por defector
    public Nodo(T valor, Nodo<T> siguiente) {
        this.valor = valor;
        this.siguiente = siguiente;
    }
    
    
}