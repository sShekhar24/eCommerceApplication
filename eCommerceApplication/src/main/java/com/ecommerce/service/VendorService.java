package com.ecommerce.service;

import com.ecommerce.entity.Vendor;

public interface VendorService {
    void registerVendor(Vendor vendor);
    Vendor getVendorDetails(Long id);
}
