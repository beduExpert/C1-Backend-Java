package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controlador {
    @GetMapping("/")
    public String hola() {
        return "hola";
    }

    @GetMapping("/adios")
    public String adios() {
        return "adios";
    }
}
