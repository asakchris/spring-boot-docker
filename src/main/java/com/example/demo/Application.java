package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		String dbPassword = System.getenv("DB-PASSWORD");
        System.out.println("dbPassword: " + dbPassword);
	}
	
	@RequestMapping("/")
	public String home() {
		return "Hello Docker World!";
	}

	@RequestMapping("/health")
	public String health() {
		return "OK";
	}
}
