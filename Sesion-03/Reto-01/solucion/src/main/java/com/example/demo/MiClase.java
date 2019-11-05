package com.example.demo;

import javax.annotation.PostConstruct;

public class MiClase implements MiInterface {
    @Override
    public String mimetodo() {
        return "mi clase";
    }

    // este metodo se ejecuta cuando se termina de construir una instancia
    @PostConstruct
    public void mensaje() {
        System.out.println("construido");
    }
}
