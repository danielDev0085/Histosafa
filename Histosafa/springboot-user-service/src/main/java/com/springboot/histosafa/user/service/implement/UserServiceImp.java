package com.springboot.histosafa.user.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.histosafa.user.entity.UserData;
import com.springboot.histosafa.user.repository.UserRepository;
import com.springboot.histosafa.user.service.UserService;

/**
 * Implementación del servicio para la tabla USUARIO de BD.
 * @author Daniel de Frutos.
 * @see UserService.
 */
@Service
public class UserServiceImp implements UserService{
	
	@Autowired
	UserRepository userRepository;

	/**
	 * Obtener todos los usuarios de BD.
	 * @return usuarios.
	 */
	@Override
	public List<UserData> getAllUser() {
		return userRepository.findAll();
	}
	
	/**
	 * Obtener usuario por DNI de BD.
	 * @param dni. String DNI de usuario.
	 * @return usuario.
	 */
	@Override
	public UserData getUserByDni(String dni) {
		return userRepository.findById(dni).orElse(null);
	}
	
	/**
	 * Crear usuario.
	 * @param userData. Objeto usuario.
	 */
	@Override
	public void createUser(UserData userData) {
		userRepository.save(userData);
	}
	
	/**
	 * Actualizar usuario.
	 * @param dni. String DNI de usuario.
	 * @param userData. Objeto usuario.
	 */
	@Override
	public void updateUser(String dni, UserData userData) {
		UserData userUpdate = userRepository.findById(dni).orElse(null);
		
		if(userUpdate != null) {
			userUpdate.setDni(userData.getDni());
			userUpdate.setAlias(userData.getAlias());
			userUpdate.setPass(userData.getPass());
			userUpdate.setEmail(userData.getEmail());
			userUpdate.setLastname1(userData.getLastname1());
			userUpdate.setLastname2(userData.getLastname2());
			userUpdate.setName_user(userData.getName_user());
		}
	}
	
	/**
	 * Borrar usuario.
	 * @param dni. String DNI de usuario.
	 */
	@Override
	public void deleteUser(String dni) {
		userRepository.deleteById(dni);
	}

}
