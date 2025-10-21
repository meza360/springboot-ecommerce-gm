package com.gt2software.ecommerce.services.order;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gt2software.ecommerce.model.Order;
import com.gt2software.ecommerce.repository.order.OrderRepository;
import com.gt2software.ecommerce.repository.product.ProductRepository;
import com.gt2software.ecommerce.services.product.management.ProductManagementService;
import com.gt2software.ecommerce.services.product.sales.ProductSaleService;

@Service
public class OrderService implements IOrder {

    private Logger logger = LoggerFactory.getLogger(ProductManagementService.class);

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void createOrder(Order order) {
        logger.info("Setting new order");
        orderRepository.save(order);
    }

    @Override
    public List<Order> getOrders() {
        logger.info("Retrieving all orders");
        return orderRepository.findAll();
    }

}
