package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// le decimos al contenedor de spring que registre este bean
@RestController
// vamos a regresar JSON, la conversión de objeto a JSON la hará spring
@RequestMapping(produces = {"application/json"})
public class MiControlador {
    // GET request sin parametros
    @GetMapping
    public Cita hola() {
        Cita cita = new Cita();
        cita.setAutor("feynman");
        cita.setTexto("hola");
        return cita;
    }

    // GET request con parametros
    @GetMapping("/saluda/{nombre}")
    public Cita saluda(@PathVariable("nombre") String nombre) { // le asignamos el parametro de la request a una variable
        Cita cita = new Cita();
        cita.setAutor(nombre);
        cita.setTexto("Hola "+nombre);
        return cita;
    }
}
