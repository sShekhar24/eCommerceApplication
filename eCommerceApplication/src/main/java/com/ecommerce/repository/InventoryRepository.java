package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {}

