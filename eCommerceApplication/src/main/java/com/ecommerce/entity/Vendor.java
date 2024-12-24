package com.ecommerce.entity;

import java.util.List;

import com.ecommerce.common.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "vendors")
public class Vendor extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String businessName;

    @OneToMany(mappedBy = "vendor", cascade = CascadeType.ALL)
    private List<Inventory> inventoryItems;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public List<Inventory> getInventoryItems() {
        return inventoryItems;
    }

    public void setInventoryItems(List<Inventory> inventoryItems) {
        this.inventoryItems = inventoryItems;
    }

    // Optionally, you can add toString(), equals(), and hashCode() methods if needed.
}
