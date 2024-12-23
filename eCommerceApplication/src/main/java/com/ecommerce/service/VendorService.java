package com.ecommerce.service;

public interface VendorService {
    void registerVendor(Vendor vendor);
    Vendor getVendorDetails(Long id);
}
