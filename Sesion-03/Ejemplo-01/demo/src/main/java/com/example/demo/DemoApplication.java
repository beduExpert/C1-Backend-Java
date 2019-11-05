package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
	// IMPORTANTE
	// registramos un bean en el contenedor de spring
	// spring guarda los beans por tipo, en este caso
	// estamos registrando un bean de tipo MiInterface
	// cuando otra clase necesite una clase de tipo MiInterface
	// podemos decirle a spring que nos de una instancia de ese tipo
    @Bean
    public MiInterface mibean() {
    	// usamos una factory para obtener una instancia del tipo
		// MiClase que implementa la interfaz MiInterfaz
    	return new MiFactory().getClase();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
