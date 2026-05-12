package com.wms.warehouse_management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wms.warehouse_management.entity.InventoryItem;
import com.wms.warehouse_management.service.InventoryItemService;

@RestController
@RequestMapping("/inventory-items")
public class InventoryItemController {

    private final InventoryItemService service;

    public InventoryItemController(InventoryItemService service) {
        this.service = service;
    }

    @PostMapping
    public InventoryItem save(@RequestBody InventoryItem item) {
        return service.save(item);
    }

    @GetMapping
    public List<InventoryItem> getAll() {
        return service.getAll();
    }
}