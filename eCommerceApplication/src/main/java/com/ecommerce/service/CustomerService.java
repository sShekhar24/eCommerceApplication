package com.ecommerce.service;

import com.ecommerce.entity.Customer;

public interface CustomerService {
    void registerCustomer(Customer customer);
    Customer getCustomerDetails(Long id);
}
