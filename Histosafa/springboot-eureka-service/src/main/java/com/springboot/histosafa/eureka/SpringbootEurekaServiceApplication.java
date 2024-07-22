package com.springboot.histosafa.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer //Habilitar el servicio Eureka
@SpringBootApplication
public class SpringbootEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEurekaServiceApplication.class, args);
	}

}
