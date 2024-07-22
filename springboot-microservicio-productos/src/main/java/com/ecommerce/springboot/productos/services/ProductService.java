package com.ecommerce.springboot.productos.services;

import java.util.Collections;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.springboot.productos.entities.Product;
import com.ecommerce.springboot.productos.repository.ProductRepositoryDTO;

/**
 * @author Daniel de Frutos
 * Servicio que hace las consultas a tabla producto a través del repositorio
 */
@Service
public class ProductService {
	//Inyección de objetos
	@Autowired
	private ProductRepositoryDTO productDTO;
	
	/**
	 * Obtener el producto con el id pasado por parámetro
	 * @param id del producto
	 * @return producto
	 */
	public Optional<Product> getProductById(long id) {
		return Optional.ofNullable(productDTO.findById(id).orElse(null));
	}
	
	/**
	 * Obtener todos los productos
	 * @return lista de productos
	 */
	public Iterable<Product> getAllProduct() {
		 Iterable<Product> products = productDTO.findAll();
		 
		 /**
		  * Si products contiene elementos nulos o está vacío devolver lista vacía
		  */
		 if(products == null || !products.iterator().hasNext()) {
			 return Collections.emptyList();
		 }
		 
		 return products;
	}
	
}
