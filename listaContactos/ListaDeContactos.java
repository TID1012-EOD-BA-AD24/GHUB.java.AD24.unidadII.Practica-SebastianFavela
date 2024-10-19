package listaContactos;
import lista.Lista;
import lista.PosicionIlegalException;

public class ListaDeContactos{
    private Lista<Contacto> contactos;

    public ListaDeContactos(){
        contactos = new Lista<Contacto>();

    }
    public Lista<Contacto> mostrarTodosLosContactos(){
        return contactos;
    }
    public boolean agregarContacto(String nombres, String apellido, string direccion, 
    string correo, string telefono, String celular) throws PosicionIlegalException{
        Contacto con = buscarContacto(nombres,apellidos);
        if(con == null)
        {
            Contacto nuevo = new Contacto(nombres,apellidos,direccion, correo, telefono, telefono){
                (contactos).agregar(nuevo);
                return true;
            }else{
                return false;

            }

        }
        public Contacto buscarContacto(String nombres, String apellidos)
        throws PosicionIlegalException{
            for (int i=0; i<contactos.getTamanio();i++){
                Contacto con = contactos.getValor(i);
                if(nombres.equals(con.getNombre())&& apellidos.equals(con.getApellidos())){
                    return con;
                }
            }
            return null;
    }

}
