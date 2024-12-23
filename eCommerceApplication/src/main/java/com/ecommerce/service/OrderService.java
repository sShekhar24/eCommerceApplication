package com.ecommerce.service;

public interface OrderService {
    void placeOrder(Order order);
    Order getOrderDetails(Long id);
}
