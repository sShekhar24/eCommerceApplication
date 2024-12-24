package com.ecommerce.service;

import com.ecommerce.entity.PVCS;

public interface PVCSService {
    void registerPVCS(PVCS pvcs);
    PVCS getPVCSDetails(Long id);
}