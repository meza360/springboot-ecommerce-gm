package com.gt2software.ecommerce.services.product.management;

import com.gt2software.ecommerce.model.Product;

public interface IProductService {

    public void addProduct(Product product);

    public void deleteProduct(Product product);
}
