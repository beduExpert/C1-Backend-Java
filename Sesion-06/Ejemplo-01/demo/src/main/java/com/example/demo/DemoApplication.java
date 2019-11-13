package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

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
            AvailableBooks availableBooks =
                    restTemplate.getForObject("https://api.bitso.com/v3/available_books/", AvailableBooks.class);
            log.info(availableBooks.toString());
        };
    }

}
