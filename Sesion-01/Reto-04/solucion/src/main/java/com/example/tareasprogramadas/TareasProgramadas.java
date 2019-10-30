package com.example.tareasprogramadas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

// Anotacion de spring, se cubriran mas adelante
@Component
public class TareasProgramadas {
    private static final Logger log = LoggerFactory.getLogger(TareasProgramadas.class);

    // La tarea se ejecuta cada 10 segundos
    @Scheduled(fixedRate = 10000)
    public void saludar() {
        log.info("Hola mundo");
    }
    @Scheduled(fixedRate = 3000)
    public void despedir() {
        log.info("Adios");
    }

}
