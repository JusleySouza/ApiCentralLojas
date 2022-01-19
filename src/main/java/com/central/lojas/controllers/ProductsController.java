package com.central.lojas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
