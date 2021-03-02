package com.microservicios.perfilamiento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PerfilamientoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PerfilamientoApplication.class, args);
	}

}
