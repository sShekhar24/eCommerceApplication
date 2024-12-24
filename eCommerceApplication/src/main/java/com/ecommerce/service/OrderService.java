package com.ecommerce.service;

import com.ecommerce.entity.Order;

public interface OrderService {
    void placeOrder(Order order);
    Order getOrderDetails(Long id);
}
