package com.gwanghyeonkim7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gwanghyeonkim7.model.Product;
import com.gwanghyeonkim7.repository.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class JpaController {
	@Autowired
	ProductRepository productRepository;

	@GetMapping("/jpa/product2")
	public Product product2(String name) {
		
		Product list = null;
		try {
			list = productRepository.findByName(name);
		} catch (Exception e) {
			list = new Product();
			list.setName("오류!!!!");
		}
		
		return list;

		}
		

	@GetMapping("/jpa/product")
	public List<Product> product() {
		List<Product> list = productRepository.findAll();
		return list;
	}
	@PostMapping("/jpa/product")
	public String productPost(@ModelAttribute Product product) {
		Product pro = productRepository.save(product);
		log.error(pro.toString());
		return "redirect:/jpa/product";
	}
}