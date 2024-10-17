import lista.PosicionIlegalException;

public class ListaDeContactos{
    public ListaDeContactos(){

    }























    public boolean(String nombres, String apellido, string direccion, 
    string correo, string telefono, String celular) throws PosicionIlegalException{
        Contacto con = buscarContacto(nombres,apellidos);
        if(con == null)
        {
            Contacto nuevoo = new Contacto(nombres,apellidos,direccion, correo, telefono, telefono){
                contactos.agregar(nuevo);
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

}