package com.wms.warehouse_management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wms.warehouse_management.entity.InventoryItem;
import com.wms.warehouse_management.repository.InventoryItemRepository;

@Service
public class InventoryItemService {

    private final InventoryItemRepository repository;

    public InventoryItemService(InventoryItemRepository repository) {
        this.repository = repository;
    }

    public InventoryItem save(InventoryItem item) {
        return repository.save(item);
    }

    public List<InventoryItem> getAll() {
        return repository.findAll();
    }
}