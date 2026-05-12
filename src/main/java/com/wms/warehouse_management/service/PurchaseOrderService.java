package com.wms.warehouse_management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wms.warehouse_management.entity.PurchaseOrder;
import com.wms.warehouse_management.repository.PurchaseOrderRepository;

@Service
public class PurchaseOrderService {

    private final PurchaseOrderRepository repository;

    public PurchaseOrderService(PurchaseOrderRepository repository) {
        this.repository = repository;
    }

    public PurchaseOrder save(PurchaseOrder purchaseOrder) {
        return repository.save(purchaseOrder);
    }

    public List<PurchaseOrder> getAll() {
        return repository.findAll();
    }
}