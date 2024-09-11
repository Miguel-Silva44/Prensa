package com.siteSimples.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.siteSimples.backend.model.Product;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Long>{

}
