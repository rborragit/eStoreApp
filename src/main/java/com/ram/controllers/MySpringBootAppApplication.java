package com.ram.controllers;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.")
public class MySpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootAppApplication.class, args);
	}

}
