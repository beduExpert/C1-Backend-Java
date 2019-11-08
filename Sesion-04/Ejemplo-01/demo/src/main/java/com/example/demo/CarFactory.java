package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Usamos esta clase para registrar beans en el contenedor de Spring
@Configuration
public class CarFactory {
    // Registramos un bean
    @Bean
    Motor motor() {
        return new Motor();
    }
}
