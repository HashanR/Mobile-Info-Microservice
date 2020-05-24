package com.hashanr.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.hashanr.microservice.commons.model")
public class MobileInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileInfoApplication.class, args);
	}

}
