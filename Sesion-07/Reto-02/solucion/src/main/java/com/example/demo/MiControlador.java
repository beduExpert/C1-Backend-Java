package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MiControlador {
    @PostMapping(path = "/hola", consumes="application/json", produces = "application/json")
    public Cita hola(@RequestBody Peticion peticion) {
        Cita cita = new Cita();
        cita.setAutor("feynman");
        cita.setTexto(peticion.getCadena());
        return cita;
    }

    @PostMapping(path = "/adios", consumes = "application/json", produces = "application/json")
    public Peticion adios(@RequestBody Cita cita) {
        Peticion peticion = new Peticion();
        peticion.setCadena("hola desde spring "+cita.getAutor());
        peticion.setBandera(false);
        return peticion;
    }
}
