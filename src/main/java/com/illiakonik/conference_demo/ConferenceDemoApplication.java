package com.illiakonik.conference_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConferenceDemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello word");

		SpringApplication.run(ConferenceDemoApplication.class, args);
	}

}
