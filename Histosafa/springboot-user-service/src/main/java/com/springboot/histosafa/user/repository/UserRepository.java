package com.springboot.histosafa.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.histosafa.user.entity.UserData;

/**
 * Repositorio de BD para la tabla USUARIO.
 * @author Daniel de Frutos
 */
@Repository
public interface UserRepository extends JpaRepository<UserData, String>{

}
