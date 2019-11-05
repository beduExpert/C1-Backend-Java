package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnitControllerTests {
    @Test
    public void testControlador() {
        Controlador controlador = new Controlador();
        String resultado = controlador.hola();
        assertEquals(resultado, "hola");
    }
}
