package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration // Esta anotación le dice a spring que esta clase proveé beans
public class ProveoBeans {
    @Bean // Con esta anotación registramos el bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
