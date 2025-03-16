package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Practica5FinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(Practica5FinalApplication.class, args);
	}

}
