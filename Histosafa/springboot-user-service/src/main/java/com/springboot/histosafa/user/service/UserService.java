package com.springboot.histosafa.user.service;

import java.util.List;

import com.springboot.histosafa.user.entity.UserData;

/**
 * Interfaz del servicio para la tabla USUARIO de BD.
 * @author Daniel de Frutos.
 */
public interface UserService {
	
	List<UserData> getAllUser();
	
	UserData getUserByDni(String dni);
	
	void createUser(UserData userData);
	
	void updateUser(String dni, UserData usarData);
	
	void deleteUser(String dni);
}
