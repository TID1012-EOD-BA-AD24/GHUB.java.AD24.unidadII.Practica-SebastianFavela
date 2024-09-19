package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class AppTest {

    
    private Delimitadores objDel;

    @BeforeEach
    public void setUp() {
        objDel = new Delimitadores();
    }

    @Test
    public void testEvaluacionDelimitadores_ExpresionCorrecta() {
        String expr = "while (m<(n[8]+0)) { int p=7; /*comentarios*/ }";
        assertTrue(objDel.evaluacionDelimitadores(expr), "La expresión debería ser correcta");
    }

    @Test
    public void testEvaluacionDelimitadores_ExpresionIncorrecta() {
        String expr = "while (m<(n(8]+0)) {{ int p=7; /*comentarios*/ }";
        assertFalse(objDel.evaluacionDelimitadores(expr), "La expresión debería ser incorrecta");
    }

    @Test
    public void testEvaluacionDelimitadores_ExpresionVacia() {
        String expr = "";
        assertTrue(objDel.evaluacionDelimitadores(expr), "La expresión vacía debería ser correcta");
    }

    @Test
    public void testEvaluacionDelimitadores_ExpresionConSoloDelimitadores() {
        String expr = "{}[]()";
        assertTrue(objDel.evaluacionDelimitadores(expr), "La expresión con solo delimitadores debería ser correcta");
    }
}