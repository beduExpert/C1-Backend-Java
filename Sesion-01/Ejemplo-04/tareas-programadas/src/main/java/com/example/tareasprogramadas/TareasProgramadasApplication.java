package com.example.tareasprogramadas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // Con esto activamos la planificación de tareas
public class TareasProgramadasApplication {

	public static void main(String[] args) {
		SpringApplication.run(TareasProgramadasApplication.class, args);
	}

}
