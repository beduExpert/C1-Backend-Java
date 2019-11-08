package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Moto {
    Motor motor;
    LLantas llantas;

    // inyección por constructor
    @Autowired
    Moto(Motor motor, LLantas llantas) {
        this.motor = motor;
        this.llantas = llantas;
    }
}
