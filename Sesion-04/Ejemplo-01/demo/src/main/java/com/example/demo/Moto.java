package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Moto {
    Motor motor;

    // inyección por constructor
    @Autowired
    Moto(Motor motor) {
        this.motor = motor;
    }
}
