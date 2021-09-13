package com.cipheric.bluepine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cipheric")
public class BluePineApplication {

	public static void main(String[] args) {
		SpringApplication.run(BluePineApplication.class, args);
	}

}
