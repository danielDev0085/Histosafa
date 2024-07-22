package com.springboot.histosafa.article.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que hace referencia a la tabla ARTICULO de BD.
 * @author Daniel de Frutos.
 */
@AllArgsConstructor //Constructor con todos los argumentos
@NoArgsConstructor //Constructor sin argumentos
@Data //Getters and setters
@Entity 
@Table(name = "article")
public class Article implements Serializable{
	
	//Para poder serializar el objeto como bytes y poder guardarlo en sesión o archivos .txt
	private static final long serialVersionUID = -2917644141329554380L;

	@Id //PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Autoincrement
	@Column(name = "id_article")
	private long id;
	
	private String title;
	private String introduction;
	private String content;
	private String century;
	
	@Lob //Que sea tratado como BLOB en BD
	private byte[] image;
	
	//START Getters and setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCentury() {
		return century;
	}

	public void setCentury(String century) {
		this.century = century;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	
	//END Getters and setters
}
