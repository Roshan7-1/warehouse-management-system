package com.wms.warehouse_management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.wms.warehouse_management.entity.Warehouse;
import com.wms.warehouse_management.service.WarehouseService;

@RestController
@RequestMapping("/warehouses")
public class WarehouseController {

    private final WarehouseService service;

    public WarehouseController(WarehouseService service) {
        this.service = service;
    }

    @PostMapping
    public Warehouse save(@RequestBody Warehouse warehouse) {
        return service.save(warehouse);
    }

    @GetMapping
    public List<Warehouse> getAll() {
        return service.getAll();
    }
}