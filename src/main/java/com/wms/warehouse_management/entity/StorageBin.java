package com.wms.warehouse_management.entity;

import jakarta.persistence.*;

@Entity
public class StorageBin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String binCode;

    private int capacity;

    public StorageBin() {
    }

    public Long getId() {
        return id;
    }

    public String getBinCode() {
        return binCode;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBinCode(String binCode) {
        this.binCode = binCode;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}