package com.gt2software.ecommerce.controller.product.management;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.gt2software.ecommerce.model.Product;
import com.gt2software.ecommerce.services.product.management.ProductService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> createProduct(@RequestBody Product data) {
        productService.addProduct(data);
        Map<String, Object> response = new HashMap<String, Object>();
        response.put("message", "Product created successfully");
        response.put("product", data);
        return ResponseEntity.ok(response);
    }

    @PostMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> updateProduct(@RequestBody Product data) {
        productService.addProduct(data);
        Map<String, Object> response = new HashMap<String, Object>();
        response.put("message", "Product created successfully");
        response.put("product", data);
        return ResponseEntity.ok(response);
    }

}
