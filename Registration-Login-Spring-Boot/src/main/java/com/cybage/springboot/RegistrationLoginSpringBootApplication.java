package com.cybage.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cybage")
public class RegistrationLoginSpringBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(RegistrationLoginSpringBootApplication.class, args);
	}
}
