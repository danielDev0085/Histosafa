package com.springboot.histosafa.userfavouritearticle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringbootUserFavoriteArticleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootUserFavoriteArticleServiceApplication.class, args);
	}

}
