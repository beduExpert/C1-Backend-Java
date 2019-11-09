package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j // anotación para incluir un logger que estará disponible en esta clase
public class DemoApplication {

	public static void main(String[] args) {
		log.info("hola desde spring");
		log.debug("hola soy un mensaje para depurar");
		log.error("hola, pasó algo horrible");
		SpringApplication.run(DemoApplication.class, args);
	}

}
