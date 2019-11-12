package com.example.demo;

import lombok.Data;

// anotación de lombok para generar los getters y el constructor
@Data
public class Cita {
    private final String nombre;
    private final String libro;
    private final String texto;
}
