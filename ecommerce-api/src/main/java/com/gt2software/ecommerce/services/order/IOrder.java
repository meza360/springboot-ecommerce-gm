package com.gt2software.ecommerce.services.order;

import java.util.List;

import com.gt2software.ecommerce.model.Order;

public interface IOrder {

    void createOrder(Order order);

    List<Order> getOrders();
}
