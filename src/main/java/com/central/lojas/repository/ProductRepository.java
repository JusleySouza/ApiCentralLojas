package com.central.lojas.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.central.lojas.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
	Product findById(long id);
}
