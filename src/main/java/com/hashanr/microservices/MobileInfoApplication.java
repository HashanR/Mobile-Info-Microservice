package com.hashanr.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;



@SpringBootApplication
@EntityScan("com.hashanr.microservice.commons.model")
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableDiscoveryClient
//@EnableSwagger2
public class MobileInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileInfoApplication.class, args);
	}

}
