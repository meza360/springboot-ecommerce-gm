package com.gt2software.ecommerce.services.product.management;

import com.gt2software.ecommerce.model.Product;

public interface IProductManagementService {

    public void addProduct(Product product);

    public void deleteProduct(Long productId);
}
