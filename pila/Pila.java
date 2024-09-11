package pila;

public class Pila<T> {
    //Atributo cabeza, que apunta al tope de la pila;
    private Nodo<T> cabeza;
    //Atributo almacena el total de elememtos de la pila
    private int tamanio;
    //constructor por defecto
    public Pila() {
        cabeza = null;
        tamanio= 0;

    }
    //devuelva el total de elementos de la pila
    public int getTamanio() {
        return tamanio;
    }

    //verificar si la pila esta vacia
    public boolean esVacia(){
        return (cabeza == null);
    }

    //Apilar elementos nuevo
    public void apilar(T valor){
        //crear un nuevo nodo
        Nodo<T> nuevo = new Nodo<T>();
        //fijar el valor dentro del Nodo
        nuevo.setValor(valor);
        if(esVacia()){
            //Cabeza apunta al nuevo nodo
            cabeza = nuevo;
        }else{
            //se enlaza el campo siguiente de nuevo con la cabeza
            nuevo.setSiguiente(cabeza);
            //la nueva cabeza de la pila pasa a ser nuevo
            cabeza = nuevo;
        }
        

    }
    
    
    

}
