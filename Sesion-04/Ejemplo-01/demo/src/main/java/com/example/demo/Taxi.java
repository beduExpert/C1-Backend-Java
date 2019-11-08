package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Taxi {
    Motor motor;

    // inyección con setter
    @Autowired
    void setMotor(Motor motor) {
        this.motor = motor;
    }
}
