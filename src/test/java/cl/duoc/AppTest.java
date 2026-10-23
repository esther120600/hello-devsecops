package cl.duoc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void saludarDevuelveMensajeEsperado() {
        assertEquals("Hello World DevSecOps", App.saludar());
    }
}