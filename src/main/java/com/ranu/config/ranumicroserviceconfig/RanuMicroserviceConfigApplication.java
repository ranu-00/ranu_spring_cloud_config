package com.ranu.config.ranumicroserviceconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RanuMicroserviceConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(RanuMicroserviceConfigApplication.class, args);
	}

}
