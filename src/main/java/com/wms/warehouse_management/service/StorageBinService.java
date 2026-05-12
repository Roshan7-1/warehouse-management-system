package com.wms.warehouse_management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wms.warehouse_management.entity.StorageBin;
import com.wms.warehouse_management.repository.StorageBinRepository;

@Service
public class StorageBinService {

    private final StorageBinRepository repository;

    public StorageBinService(StorageBinRepository repository) {
        this.repository = repository;
    }

    public StorageBin save(StorageBin bin) {
        return repository.save(bin);
    }

    public List<StorageBin> getAll() {
        return repository.findAll();
    }
}