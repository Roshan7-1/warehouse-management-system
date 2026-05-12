package com.wms.warehouse_management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wms.warehouse_management.entity.Supplier;
import com.wms.warehouse_management.repository.SupplierRepository;

@Service
public class SupplierService {

    private final SupplierRepository repository;

    public SupplierService(SupplierRepository repository) {
        this.repository = repository;
    }

    public Supplier save(Supplier supplier) {
        return repository.save(supplier);
    }

    public List<Supplier> getAll() {
        return repository.findAll();
    }
}