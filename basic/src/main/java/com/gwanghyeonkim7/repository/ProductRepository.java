package com.gwanghyeonkim7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gwanghyeonkim7.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


	public Product findByName(String name);
	
}