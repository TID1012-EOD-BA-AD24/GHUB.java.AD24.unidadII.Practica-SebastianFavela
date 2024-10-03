package lista;
public class Lista<T> {
    //primer elemento de la lista
    private Nodo<T> cabeza;
    //total de elememtos
    private int tamanio;
    //constructor por defecto
    public Lista() {
        this.cabeza=null;
        this.tamanio=0;

    }
    //devuelve el tamaño de la lista
    public int getTamanio() {
        return tamanio;
    }
    public boolean esVacia(){
       
        return (cabeza==null);

    }
    public void agregar(T valor){
        Nodo<T> nuevo = new Nodo<T>();
        
    }
    



}

