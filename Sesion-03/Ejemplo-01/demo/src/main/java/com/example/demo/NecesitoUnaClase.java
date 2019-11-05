package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

// Con esta anotacion registramos esta clase como un bean de spring
@Component
public class NecesitoUnaClase {
    // esta anotacion va a obtener un bean del tipo MiInterface del contenedor de spring
    @Autowired
    private MiInterface miInterface;

    // este metodo se ejecuta cuando se termina de construir una instancia
    @PostConstruct
    public void mensaje() {
        System.out.println("necesito una clase "+miInterface.mimetodo());
    }
}
