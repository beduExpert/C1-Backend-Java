package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class TareaProgramada {
    // Inyección de dependencias
    // obtenemos una RestTemplate del contenedor de spring
    @Autowired
    RestTemplate restTemplate;

    // Ejemplo de petición POST
    @Scheduled(fixedRate = 30000)
    public void pruebaPOST() {
        // esta información vamos a mandar
        Ejemplo ejemplo = new Ejemplo();
        ejemplo.setId(123);
        ejemplo.setMensaje("hola");

        // en este caso recibimos la misma información
        Ejemplo infoRecibida =
                restTemplate.postForObject("https://jsonplaceholder.typicode.com/posts", ejemplo, Ejemplo.class);

        // lo que hace este endpoint con el método post es regresar la misma información que le mandaron
        // ver la pagina https://jsonplaceholder.typicode.com/

        // imprimimos la info recibida, en este caso es la misma que mandamos
        log.info(infoRecibida.toString());
    }
}
