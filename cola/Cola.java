package cola;

public class Cola <T>{
    //Atributos
    //Atributo cabeza, que apunta al primer elemento de la cola
    private Nodo<T> cabeza;
    //Atributo cola, que apunta al último elemento de la cola
    private Nodo<T> cola;
    //
    private int tamanio;
    //contructor por defecto
    public Cola() {
        cabeza = null;
        cola = null;
        tamanio = 0;
    }
    //devuelve el total de elementos de la cola
    public int getTamanio(){
        return tamanio;
    }
    //verifica si la cola esta vacia
    public boolean esVacia(){
        return (cabeza==null);
    }
    public void encolar(T valor){
        //Crear un nuevo nodo
        Nodo<T> nuevo = new Nodo<T>();
        //fijar el valor dentro del nodo
        nuevo.setValor(valor);
        if (esVacia()){
            //cabeza y cola apuntat al nuevo nodo
            cabeza = nuevo;
            cola = nuevo;
        }else{
            //se enlaza el campo siguiente de cola con el nuevo elemento
            cola.setSiguiente(nuevo);
            //la nueva cola pasa a sefr nuevo
            cola = nuevo;
        }
        //incrementa el tamaño porque hay un nuevo elememto
        tamanio++;

    }
    



    
    
}
