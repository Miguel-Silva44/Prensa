package com.siteSimples.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siteSimples.backend.model.Product;
import com.siteSimples.backend.service.IServices;
import com.siteSimples.backend.service.ProductServices;
@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController extends ProdControllers<Product, Long>{
	@Autowired
	private ProductServices productServices;
	@Override
	IServices<Product, Long> getService() {
		return this.productServices;
	}

	@Override
	public ResponseEntity<Product> update(Long id, Product entity) {
		return null;
	}

}
