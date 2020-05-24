package com.hashanr.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EntityScan("com.hashanr.microservice.commons.model")
@EnableResourceServer
public class MobileInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileInfoApplication.class, args);
	}

}
