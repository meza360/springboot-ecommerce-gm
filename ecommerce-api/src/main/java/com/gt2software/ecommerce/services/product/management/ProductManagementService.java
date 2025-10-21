package com.gt2software.ecommerce.services.product.management;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.gt2software.ecommerce.model.Product;
import com.gt2software.ecommerce.repository.product.ProductRepository;
import com.gt2software.ecommerce.services.product.sales.ProductSaleService;

@Service
public class ProductManagementService implements IProductManagementService {

    private Logger logger = LoggerFactory.getLogger(ProductManagementService.class);
    private final ProductRepository productRepository;
    private final ProductSaleService productSaleService;

    public ProductManagementService(ProductRepository productRepository, ProductSaleService productSaleService) {
        this.productRepository = productRepository;
        this.productSaleService = productSaleService;
    }

    @Override
    public void addProduct(Product product) {
        logger.info("Updating product");
        productRepository.save(product);
        logger.info("Product updated");
    }

    @Override
    public void deleteProduct(Long productId) {
        Product productToDelete = productSaleService.getProductById(productId);
        if (productToDelete != null) {
            logger.info("Deleting product: {}", productId);
            productRepository.delete(productToDelete);
            logger.info("Product deleted: {}", productId);
        }
    }

}
