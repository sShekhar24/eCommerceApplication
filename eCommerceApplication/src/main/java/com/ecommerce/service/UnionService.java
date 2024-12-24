package com.ecommerce.service;

import com.ecommerce.entity.Union;

public interface UnionService {
    void registerUnion(Union union);
    Union getUnionDetails(Long id);
}
