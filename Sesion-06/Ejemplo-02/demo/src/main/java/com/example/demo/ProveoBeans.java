package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

// Con esta anotación le decimos a spring que esta clase proveé beans
@Configuration
public class ProveoBeans {
    // Con @Bean le decimos a spring que registre a restTemplate
    // como un bean en su contenedor
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
