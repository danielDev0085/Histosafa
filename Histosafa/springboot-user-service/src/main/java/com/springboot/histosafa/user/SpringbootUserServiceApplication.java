package com.springboot.histosafa.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient //Registro como cliente de Eureka
@SpringBootApplication
public class SpringbootUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootUserServiceApplication.class, args);
	}

}
