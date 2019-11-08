package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Taxi {
    Motor motor;
    LLantas llantas;

    // inyección con setter
    @Autowired
    void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Autowired
    void setLlantas(LLantas llantas) {
        this.llantas = llantas;
    }
}
