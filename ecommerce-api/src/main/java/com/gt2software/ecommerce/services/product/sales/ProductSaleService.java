package com.gt2software.ecommerce.services.product.sales;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gt2software.ecommerce.model.Product;
import com.gt2software.ecommerce.repository.product.ProductRepository;

@Service
public class ProductSaleService implements IProductSaleService {

    private final Logger logger = LoggerFactory.getLogger(ProductSaleService.class);
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> listProducts() {
        logger.info("Listing all products");
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long productId) {
        logger.info("Fetching product with ID: {}", productId);
        return productRepository.findById(productId).orElse(null);
    }

}
