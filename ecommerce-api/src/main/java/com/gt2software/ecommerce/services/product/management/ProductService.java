package com.gt2software.ecommerce.services.product.management;

import org.springframework.beans.factory.annotation.Autowired;

import com.gt2software.ecommerce.model.Product;
import com.gt2software.ecommerce.repository.product.ProductRepository;

public class ProductService implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }

}
