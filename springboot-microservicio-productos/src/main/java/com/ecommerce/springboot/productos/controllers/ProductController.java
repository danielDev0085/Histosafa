package com.ecommerce.springboot.productos.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.springboot.productos.entities.Product;
import com.ecommerce.springboot.productos.services.ProductService;

/**
 * @author Daniel de Frutos
 * Controlador de Producto
 */
@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/get/{id}")
	public Optional<Product> getProductById(@PathVariable Long id) {
		return productService.getProductById(id);
	}
	
	@GetMapping("/getAll")
	public Iterable<Product> getAllProduct(){
		return productService.getAllProduct();
	}
}
