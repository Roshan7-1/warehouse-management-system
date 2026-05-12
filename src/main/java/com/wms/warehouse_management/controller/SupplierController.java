package com.wms.warehouse_management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wms.warehouse_management.entity.Supplier;
import com.wms.warehouse_management.service.SupplierService;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {

    private final SupplierService service;

    public SupplierController(SupplierService service) {
        this.service = service;
    }

    @PostMapping
    public Supplier save(@RequestBody Supplier supplier) {
        return service.save(supplier);
    }

    @GetMapping
    public List<Supplier> getAll() {
        return service.getAll();
    }
}