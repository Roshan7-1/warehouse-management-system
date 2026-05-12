package com.wms.warehouse_management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.wms.warehouse_management.entity.Supplier;
import com.wms.warehouse_management.service.SupplierService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {

    private final SupplierService service;

    public SupplierController(SupplierService service) {
        this.service = service;
    }

    @PostMapping
    public Supplier create(@Valid @RequestBody Supplier supplier) {
        return service.save(supplier);
    }

    @GetMapping
    public List<Supplier> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Supplier getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {

        service.delete(id);

        return "Supplier deleted successfully";
    }
}