package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controlador {
    @GetMapping("/")
    public String hola() {
        return "Hola";
    }

    @GetMapping("/saluda/{nombre}")
    public String saludar(@PathVariable(value = "nombre") String nombre) {
        return "Hola " + nombre;
    }
}
