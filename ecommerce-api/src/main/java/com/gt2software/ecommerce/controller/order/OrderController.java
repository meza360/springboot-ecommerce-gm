package com.gt2software.ecommerce.controller.order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gt2software.ecommerce.model.Order;
import com.gt2software.ecommerce.services.order.OrderService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/sales")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order")
    public ResponseEntity<List<Order>> getOrders() {
        return ResponseEntity.ok(orderService.getOrders());
    }

    @PostMapping("/order")
    public ResponseEntity<Map<String, Object>> postMethodName(@RequestBody Order order) {
        orderService.createOrder(order);
        Map<String, Object> response = new HashMap<String, Object>();
        response.put("message", "Order set");
        response.put("order", order);
        return ResponseEntity.ok(response);
    }

}
