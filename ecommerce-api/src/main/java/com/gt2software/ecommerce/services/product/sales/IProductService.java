package com.gt2software.ecommerce.services.product.sales;

import java.util.List;

import com.gt2software.ecommerce.model.Product;

public interface IProductService {
    public List<Product> listProducts();

    public Product getProductById(Long productId);
}
