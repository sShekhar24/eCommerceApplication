package com.ecommerce.service;

public interface PVCSService {
    void registerPVCS(PVCS pvcs);
    PVCS getPVCSDetails(Long id);
}