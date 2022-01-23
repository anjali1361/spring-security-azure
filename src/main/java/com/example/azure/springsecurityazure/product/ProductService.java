package com.example.azure.springsecurityazure.product;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	/*
	 * @Autowired private HibernateTemplate hibernateTemplate;
	 */

	// create
	public void createProduct(Product product) {
		this.productRepository.save(product);
	}

	// get all products
	public List<Product> getProducts() {
		List<Product> products = this.productRepository.findAll();
		return products;
	}

	// delete the single product
	public void deleteProduct(int pid) {
		this.productRepository.deleteById(pid);
	}

	// get the single product
	public Optional<Product> getProduct(int pid) {
		return this.productRepository.findById(pid);
	}
	
	//update single product
	public void updateProduct(Product product) {
	     productRepository.save(product);
	}

}