package com.ecommerce.service;

public interface FarmerService {
    void registerFarmer(Farmer farmer);
    Farmer getFarmerDetails(Long id);
}
