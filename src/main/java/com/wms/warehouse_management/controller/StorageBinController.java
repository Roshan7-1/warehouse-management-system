package com.wms.warehouse_management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.wms.warehouse_management.entity.StorageBin;
import com.wms.warehouse_management.service.StorageBinService;

@RestController
@RequestMapping("/storage-bins")
public class StorageBinController {

    private final StorageBinService service;

    public StorageBinController(StorageBinService service) {
        this.service = service;
    }

    @PostMapping
    public StorageBin save(@RequestBody StorageBin bin) {
        return service.save(bin);
    }

    @GetMapping
    public List<StorageBin> getAll() {
        return service.getAll();
    }
}