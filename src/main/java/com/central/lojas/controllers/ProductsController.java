package com.central.lojas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping(value="/produtos")
@Api(value="API CENTRAL LOJAS produtos")
@CrossOrigin(origins="*")
public class ProductsController {
	
	@Autowired
	ProductServices productServices;

	@GetMapping
	@ApiOperation(value="Listar produtos")
	public List<Product> listProducts(){
		return productServices.allProducts();
	}
		
	@GetMapping("/{id}")
	@ApiOperation(value="Filtrar produto")
	public Product findById(@PathVariable(value="id")long id){
		return productServices.findProduct(id);	
	}
	
	@PostMapping
	@ApiOperation(value="Salvar produto")
	public  Product saveProduct(@RequestBody Product product) {
		return productServices.saveProduct(product);
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation(value="Deletar produto")
	public void deleteProduct(@PathVariable(value="id")long id) {
		productServices.deleteProduct(id);
	}
	
	@PutMapping
	@ApiOperation(value="Atualizar produtos")
	public Product updateProduct(@RequestBody Product product) {
		return productServices.saveProduct(product);
	}
}
