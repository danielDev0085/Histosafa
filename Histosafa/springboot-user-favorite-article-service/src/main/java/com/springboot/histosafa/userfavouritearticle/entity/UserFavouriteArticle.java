package com.springboot.histosafa.userfavouritearticle.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que hace referencia a la tabla USER_FAVOURITE_ARTICLE de BD.
 * @author Daniel de Frutos.
 */
@AllArgsConstructor //Constructor con todos los argumentos
@NoArgsConstructor //Constructor sin argumentos
@Data //Getters and setters
@Entity
@Table (name="user_favourite_article")
public class UserFavouriteArticle implements Serializable{
	
	//Para poder serializar el objeto como bytes y poder guardarlo en sesión o archivos .txt
	private static final long serialVersionUID = 8480543856135392359L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idFavourite;
	
	private String dniUser;
	private Long idArticle;
	
	//START Getters and setters
	public Long getIdFavourite() {
		return idFavourite;
	}

	public void setIdFavourite(Long idFavourite) {
		this.idFavourite = idFavourite;
	}

	public String getDniUser() {
		return dniUser;
	}

	public void setDniUser(String dniUser) {
		this.dniUser = dniUser;
	}

	public Long getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}
	//END Getters and setters
}
