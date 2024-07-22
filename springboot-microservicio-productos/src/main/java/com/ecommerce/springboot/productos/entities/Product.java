package com.ecommerce.springboot.productos.entities;

import java.io.File;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Daniel de Frutos 
 * Entidad de la tabla artículo.
 */
@Entity
@Table(name = "articulo")
@Data //Obtenemos todos los getters and setters
@AllArgsConstructor //Obtenemos un constructor con todos los parámetros
@NoArgsConstructor //Obtenemos constructor sin parámetros
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_articulo")
	long idProducto;
	
	@Column(name = "id_categoria")
	long idCategory;
	
	@Column(name = "id_marca")
	long idTrademarkt;
	
	@Column(name = "modelo")
	String model;
	
	@Column(name = "precio")
	float price;
	
	@Column(name = "stock")
	long stock;
	
	@Column(name = "num_ventas")
	long sales;
	
	@Column(name = "imagen")
	File image;
}
