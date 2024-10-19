package listaContactos;
    public class Contacto{
        private string nombres;
        private string apellidos;
        private string direccion;
        private string correo;
        private string telefono;
        private string celular;

        public Contacto(String nombres, String apellido, string direccion, string correo, string telefono, string celular){
            this.nombres = nombres;
            this.apellido = apellidos;
            this.direcion = direccion;
            this.correo = correo;
            this.telefono = telefono;
            this.celular = celular;
        }
        public String getNombres(){
            return nombres;
        }
        public void setNombre(String Nombres){
            this.nombres = nombres;
        }
        public String getapellido(){
            return apellidos;
        }
        public void setapellido(String apellidos){
            this.apellidos = apellidos;
        }
        public String getDireccion(){
            return direccion;
        }
        public void setDireccion(String direccion){
            this.direccion = direccion;
        }
        public String getCorreo(){
            return correo;
        }
        public void setCorreo(String correo){
            this.correo = correo;
        }
        public String getTelefono(){
            return telefono;   
        }
        public void setTelefono(String telefono){
            this.telefono = telefono;
        }
        public String getCelular(){
            return celular;   
        }
        public void setCelular(String celular){
            this.celular = celular;
        }
        public String toString(){
            return nombres + ", " + apellido + ", " + direccion + ", " + correo + ", " + telefono + ", " + celular;
        }


    }
