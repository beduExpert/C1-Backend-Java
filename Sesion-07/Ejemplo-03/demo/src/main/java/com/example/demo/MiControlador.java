package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("borrame")
@Slf4j
public class MiControlador {
    @DeleteMapping("cita")
    @ResponseStatus(code= HttpStatus.NO_CONTENT)
    public void borraCita() {
        log.info("request delete recicbida, borra algo");
    }
}
