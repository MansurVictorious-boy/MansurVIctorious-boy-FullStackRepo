package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerspringbootdeploymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerspringbootdeploymentApplication.class, args);
		System.out.println("Welcome to spring boot application deployment using docker");
	}

}
