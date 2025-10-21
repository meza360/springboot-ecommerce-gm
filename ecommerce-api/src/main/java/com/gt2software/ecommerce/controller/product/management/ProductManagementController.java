package com.gt2software.ecommerce.controller.product.management;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.gt2software.ecommerce.model.Product;
import com.gt2software.ecommerce.services.product.management.ProductManagementService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/management")
public class ProductManagementController {

    @Autowired
    private ProductManagementService productService;

    @PostMapping(value = "/products", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> createProduct(@RequestBody Product data) {
        productService.addProduct(data);
        Map<String, Object> response = new HashMap<String, Object>();
        response.put("message", "Product created successfully");
        response.put("product", data);
        return ResponseEntity.ok(response);
    }

    @PutMapping(value = "/products", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> updateProduct(@RequestBody Product data) {
        productService.addProduct(data);
        Map<String, Object> response = new HashMap<String, Object>();
        response.put("message", "Product updated successfully");
        response.put("product", data);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping(value = "/products/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        Map<String, Object> response = new HashMap<String, Object>();
        response.put("message", "Product deleted successfully");
        return ResponseEntity.ok(response);
    }

}
