package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
@Slf4j
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    // El RestTemplate que toma como argumento lo proveé spring de su contenedor
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Respuesta[] respuesta =
                    restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts", Respuesta[].class);
            for(Respuesta item: respuesta) {
                log.info("{}", item);
            }
        };
    }

}
