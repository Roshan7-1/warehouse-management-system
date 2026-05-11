package com.wms.warehouse_management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wms.warehouse_management.entity.Warehouse;
import com.wms.warehouse_management.repository.WarehouseRepository;

@Service
public class WarehouseService {

    private final WarehouseRepository repository;

    public WarehouseService(WarehouseRepository repository) {
        this.repository = repository;
    }

    public Warehouse save(Warehouse warehouse) {
        return repository.save(warehouse);
    }

    public List<Warehouse> getAll() {
        return repository.findAll();
    }
}