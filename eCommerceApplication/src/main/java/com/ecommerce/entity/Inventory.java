package com.ecommerce.entity;

import java.util.List;

import com.ecommerce.common.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventory")
public class Inventory extends BaseEntity {

    // ID of the inventory item, automatically generated
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Name of the vegetable stored in the inventory (e.g., "Tomato", "Potato")
    @Column(nullable = false)
    private String vegetableName;

    // Quantity of the vegetable in stock
    @Column(nullable = false)
    private Integer quantity;

    // Price per kilogram for the vegetable
    @Column(nullable = false)
    private Double pricePerKg;

    // Vendor associated with this inventory item (Many-to-One relationship)
    @ManyToOne
    @JoinColumn(name = "vendor_id", nullable = false)
    private Vendor vendor;

    // List of vendors that are associated with this inventory item (Many-to-Many relationship)
    @ManyToMany
    @JoinTable(
        name = "vegetable_vendor",
        joinColumns = @JoinColumn(name = "inventory_id"),
        inverseJoinColumns = @JoinColumn(name = "vendor_id")
    )
    private List<Vendor> associatedVendors;

    // Getter and Setter for 'id'
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for 'vegetableName'
    public String getVegetableName() {
        return vegetableName;
    }

    public void setVegetableName(String vegetableName) {
        this.vegetableName = vegetableName;
    }

    // Getter and Setter for 'quantity'
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    // Getter and Setter for 'pricePerKg'
    public Double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(Double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    // Getter and Setter for 'vendor'
    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    // Getter and Setter for 'associatedVendors'
    public List<Vendor> getAssociatedVendors() {
        return associatedVendors;
    }

    public void setAssociatedVendors(List<Vendor> associatedVendors) {
        this.associatedVendors = associatedVendors;
    }

    // Override toString method for easy debugging and logging
    @Override
    public String toString() {
        return "Inventory{" +
                "id=" + id +
                ", vegetableName='" + vegetableName + '\'' +
                ", quantity=" + quantity +
                ", pricePerKg=" + pricePerKg +
                ", vendor=" + vendor +
                ", associatedVendors=" + associatedVendors +
                '}';
    }
}
