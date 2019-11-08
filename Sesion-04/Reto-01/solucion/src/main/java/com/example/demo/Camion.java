package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Camion {
    // inyección a un campo
    @Autowired
    Motor motor;

    @Autowired
    LLantas llantas;
}
