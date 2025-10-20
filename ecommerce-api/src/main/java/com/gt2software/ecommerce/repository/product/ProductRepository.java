package com.gt2software.ecommerce.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gt2software.ecommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}