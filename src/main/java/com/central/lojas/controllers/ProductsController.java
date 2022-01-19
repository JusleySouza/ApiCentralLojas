package com.central.lojas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.central.lojas.models.Product;
import com.central.lojas.services.ProductServices;

@RestController
@RequestMapping(value="/central-lojas/produtos")
public class ProductsController {
	
	@Autowired
	ProductServices productServices;

	@GetMapping
	public List<Product> listProducts(){
		return productServices.allProducts();
	}
		
	@GetMapping("/{id}")
	public Product findById(@PathVariable(value="id")long id){
		return productServices.findProduct(id);	
	}
	
	@PostMapping
	public  Product saveProduct(@RequestBody Product product) {
		return productServices.saveProduct(product);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable(value="id")long id) {
		productServices.deleteProduct(id);
	}
	
	@PutMapping
	public Product updateProduct(@RequestBody Product product) {
		return productServices.saveProduct(product);
	}
}
