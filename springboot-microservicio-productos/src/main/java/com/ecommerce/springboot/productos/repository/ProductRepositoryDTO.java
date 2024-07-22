package com.ecommerce.springboot.productos.repository;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.springboot.productos.entities.Product;

/**
 * @author Daniel de Frutos
 * @see CrudRepository
 * Interfaz que tiene los métodos para hacer las operaciones con BD.
 */
public interface ProductRepositoryDTO extends CrudRepository<Product, Long>{
	
}
