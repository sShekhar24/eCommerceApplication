package com.ecommerce.entity;

import java.util.List;

import com.ecommerce.common.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "unions")
public class Union extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String location;

    @OneToMany(mappedBy = "union")
    private List<PVCS> pvcsList;

    @Column(nullable = false)
    private String chairmanName;

    @Column(nullable = false)
    private String chairmanContact;

    // Additional fields related to Union can be added here

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

    public List<PVCS> getPvcsList() {
        return pvcsList;
    }

    public void setPvcsList(List<PVCS> pvcsList) {
        this.pvcsList = pvcsList;
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
