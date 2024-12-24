package com.ecommerce.service;

import com.ecommerce.entity.Farmer;

public interface FarmerService {
    void registerFarmer(Farmer farmer);
    Farmer getFarmerDetails(Long id);
}
