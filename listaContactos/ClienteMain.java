package listaContactos;

public class ClienteMain{

    public static void main(String[] args){
        ListaDeContactos ldc = new ListaDeContactos();
            try{
                ldc.agregarContacto("Lana", "Castro", "Valle alto verde", "pedropipirin334@gmail.com", "6673178234", "6673488348");
                ldc.agregarContacto("mia", "Parra", "la primavera", "miaparra@gmail.com", "6673242355", "6667239525");

            }catch (PosicionIlegalException e){
                e.printStackTrace();

            }
            
        }
    }
