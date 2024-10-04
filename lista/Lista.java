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
    /**
     * Agrega un nuevo nodo al final de la lista
     * @param valor
     */
    public void agregar(T valor){
        Nodo<T> nuevo = new Nodo<T>();
        nuevo.setValor(valor);
        if(!esVacia())
           cabeza = nuevo;
        else{
            //Agregar al final de la lista
            Nodo<T> aux = cabeza;
            while (aux.getSiguiente() !=null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);

        }
        tamanio++;
        
    }

    /**
     * inserta un nuevo nodo en la lista
     * @param valor a agregar
     * @param pos posicion donde se insertará el nodo
     */
    public void insertar(T valor, int pos) throws PosicionIlegalException{
        if(pos>=0 && pos<=tamanio){
            

        } else {
            throw new PosicionIlegalException();
        }

    }
    



}

