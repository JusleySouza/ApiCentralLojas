package com.central.lojas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.central.lojas.models.Product;
import com.central.lojas.repository.ProductRepository;

@Service
public class ProductServices {

	@Autowired
	ProductRepository productRepository;
	
	public List<Product> allProducts() {
		return productRepository.findAll();
	}
}
