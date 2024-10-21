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
    public boolean agregarContacto(String nombres, String apellidos, String direccion, 
    string correo, string telefono, String celular) throws PosicionIlegalException{
        Contacto con = buscarContacto(nombres,apellidos);
        if(con == null)
        {
            Contacto nuevo = new Contacto(nombres,apellidos,direccion, correo, telefono, celular);
                (contactos).agregar(nuevo);
                return true;
            }else{
                return false;

            }

        }
        //Elimina un contacto dando su nombres y sus apellidos
        // 
        public boolean eliminarContacto(String nombres, String apellidos)throws PosicionIlegalException{
            Contacto con = buscarContacto(nombres,apellidos);
            if(con!=null){
                for(int i=0;i<this.contactos.getTamanio();i++){
                    Contacto contAux=contactos.getValor(i);
                    if(contAux.getNombres().equals(nombres) && contAux.getApellido().equals(apellidos) ){
                       contactos.remover();
                    }

                }
                return true;

            }else
            return false;

        }

        /**
         * @param nombres
         * @param apellidos
         * @param direccion
         * @param correo
         * @param telefono
         * @param celular
         * @return true si se pudo modificar y false si no se pudo
         * @throws PosicionIlegalException
         */

         public boolean modificarContacto(String nombres, String apellidos, String direccion, String correo, String telefono, String celular)throws PosicionIlegalException{
            //verificar que el contacto existe 
            Contacto con = buscarContacto(nombres, apellidos);
            if(con==null){
                return false;

            }
            //modifica el contacto con los datos nuevos
            con.setDireccion(direccion);
            con.setCorreo(correo);
            con.setTelefono(telefono);
            con.setCelular(celular);
            return true;
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
