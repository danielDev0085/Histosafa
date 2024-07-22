package com.springboot.histosafa.user.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.histosafa.user.entity.UserData;
import com.springboot.histosafa.user.service.UserService;

@FeignClient(name="User-service")
@RestController
@RequestMapping("/users")
public class UserController {
	private final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private CircuitBreakerFactory cbFactory;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/list")
	private List<UserData> getAllUsers() {
		return userService.getAllUser();
	}
	
	@GetMapping("/dni/{dni}")
	private UserData getUserByDni(@PathVariable String dni) {
		return cbFactory.create("users").run(() -> userService.getUserByDni(dni), e -> alternativeMethod(e));
	}
	
	/**
	 * Método para devolver un artículo por defecto em caso de fallo.
	 * @return User
	 */
	private UserData alternativeMethod(Throwable  e) {
		UserData userData = new UserData();
		
		userData.setAlias("Desconocido");
		userData.setName_user("Sin nombre");
		userData.setLastname1("Sin apellidos");
		userData.setDni("00000000A");
		userData.setEmail("desconocido@desconocido.com");
		
		logger.info(e.getMessage());
		return userData;
	}
}
