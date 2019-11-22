package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;

// Con esta anotación le decimos a spring que registre
// esta clase en el contenedor como un bean
@Component
@Slf4j // anotación para obtener un logger
public class TareaProgramada {
    @Autowired
    RestTemplate restTemplate;

    // Una request GET con parametros
    @Scheduled(fixedRate = 30000)
    public void getTicker() {
        // construimos la url
        String uri = "https://jsonplaceholder.typicode.com/posts";

        UriComponents builder = UriComponentsBuilder.fromHttpUrl(uri)
                .queryParam("userId", 1).build();

        // esto nos da como resultado https://jsonplaceholder.typicode.com/posts?userId=1

        Respuesta[] respuestas =
                restTemplate.getForObject(builder.toUriString(), Respuesta[].class);

        // logeamos la información que nos interesa
        for(Respuesta respuesta: respuestas) {
            log.info("titulo: {} \n body: {}", respuesta.getTitle(), respuesta.getBody());
        }
    }
}
