package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {

	@Value("${programming.language}")
	private String language;

	@PostConstruct
	private void print() {
		System.out.println("Hola " + language);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
