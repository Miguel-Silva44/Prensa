package com.siteSimples.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.siteSimples.backend.model.Product;
import com.siteSimples.backend.repository.ProductsRepository;
@Service
public class ProductServices extends ProductsServices<Product,Long> {
	
	@Autowired
	protected ProductsRepository productsRepository;
	
	@Override
	JpaRepository<Product, Long> getRepository() {
		return this.productsRepository;
	}

}
