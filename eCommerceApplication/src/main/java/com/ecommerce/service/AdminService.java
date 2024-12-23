package com.ecommerce.service;

public interface AdminService {
    void registerAdmin(Admin admin);
    Admin getAdminDetails(Long id);
}
