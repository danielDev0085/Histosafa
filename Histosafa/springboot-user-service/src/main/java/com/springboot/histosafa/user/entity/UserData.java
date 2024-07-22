package com.springboot.histosafa.user.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que hace referencia a la tabla USUARIO de BD.
 * @author Daniel de Frutos.
 */
@AllArgsConstructor //Constructor con todos los argumentos
@NoArgsConstructor //Constructor sin argumentos
@Data //Getters and setters
@Entity
@Table(name = "user_data")
public class UserData implements Serializable{
	
	//Para poder serializar el objeto como bytes y poder guardarlo en sesión o archivos .txt
	private static final long serialVersionUID = -3233850978120370362L;

	@Id //PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Autoincrement
	private String dni;
	
	private String alias;
	private String pass;
	private String name_user;
	private String lastname1;
	private String lastname2;
	private String email;
	private Integer rol;

	//START Getters and setters
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName_user() {
		return name_user;
	}
	public void setName_user(String name_user) {
		this.name_user = name_user;
	}
	public String getLastname1() {
		return lastname1;
	}
	public void setLastname1(String lastname1) {
		this.lastname1 = lastname1;
	}
	public String getLastname2() {
		return lastname2;
	}
	public void setLastname2(String lastname2) {
		this.lastname2 = lastname2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getRol() {
		return rol;
	}
	public void setRol(Integer rol) {
		this.rol = rol;
	}
	//END Getters and setters
}
