package com.example.demo.controllers;

import com.example.demo.Cita;
import com.example.demo.data.CitaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

// Esta anotación le dice a spring que guarde esta clase
// en su contenedor como un bean
@Controller
// Esta anotación es para usar el logger
@Slf4j
public class CitaController {
    private final CitaRepository citaRepository;

    // inyección de dependencias
    // el contenedor de spring nos pasa un CitaRepository
    @Autowired
    public CitaController(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }

    @PostConstruct
    public void Hola() {
        log.info("Hola desde el controlador");
        for(Cita cita: citaRepository.encuentraTodos()) {
            log.info(cita.getTexto());
        }
    }
}
