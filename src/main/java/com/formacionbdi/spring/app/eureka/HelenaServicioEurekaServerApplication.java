package com.formacionbdi.spring.app.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class HelenaServicioEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelenaServicioEurekaServerApplication.class, args);
	}

}
