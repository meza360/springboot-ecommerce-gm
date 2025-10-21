package com.gt2software.ecommerce.repository.order;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gt2software.ecommerce.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
