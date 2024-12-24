package com.ecommerce.entity;

import com.ecommerce.common.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pvcs")
public class PVCS extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String location;

    @ManyToOne
    @JoinColumn(name = "union_id", nullable = false)
    private Union union;

    @Column(nullable = false)
    private String chairmanName;

    @Column(nullable = false)
    private String chairmanContact;

    // Additional fields related to PVCS can be added here

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Union getUnion() {
        return union;
    }

    public void setUnion(Union union) {
        this.union = union;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public String getChairmanContact() {
        return chairmanContact;
    }

    public void setChairmanContact(String chairmanContact) {
        this.chairmanContact = chairmanContact;
    }
}
