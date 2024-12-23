package com.ecommerce.service;

public interface CustomerService {
    void registerCustomer(Customer customer);
    Customer getCustomerDetails(Long id);
}
