package com.ecommerce.service;

import com.ecommerce.entity.Admin;

public interface AdminService {
    void registerAdmin(Admin admin);
    Admin getAdminDetails(Long id);
}
