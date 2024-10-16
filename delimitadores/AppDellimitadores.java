package delimitadores;

public class AppDellimitadores {
    public static void main(String[] args) {
        String expresion = "while ( m<(n[8]+o) ){"+
                           "   int p=7;"+
                           " /*comentario*/"+
                           "} ";

        Delimitadores objDel = new Delimitadores();

        if(objDel.evaluacionDelimitadores(expresion))
            System.out.println("Expresion correcta");
        else
            System.out.println("Expresion incorrecta");


        expresion = "while ( m<(n[8)+o) ){"+
            "   int p=7;"+
            " /*comentario*/"+
            "} ";

        if(objDel.evaluacionDelimitadores(expresion))
            System.out.println("Expresion correcta");
        else
            System.out.println("Expresion incorrecta");

        expresion = "(A+b)";

        if(objDel.evaluacionDelimitadores(expresion))
            System.out.println("Expresion correcta");
        else
            System.out.println("Expresion incorrecta");

    expresion = "A+b) ";

    if(objDel.evaluacionDelimitadores(expresion))
        System.out.println("Expresion correcta");
    else
        System.out.println("Expresion incorrecta");



        


        
    }
    
}
