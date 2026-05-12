package com.wms.warehouse_management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wms.warehouse_management.entity.PurchaseOrder;
import com.wms.warehouse_management.service.PurchaseOrderService;

@RestController
@RequestMapping("/purchase-orders")
public class PurchaseOrderController {

    private final PurchaseOrderService service;

    public PurchaseOrderController(PurchaseOrderService service) {
        this.service = service;
    }

    @PostMapping
    public PurchaseOrder save(@RequestBody PurchaseOrder purchaseOrder) {
        return service.save(purchaseOrder);
    }

    @GetMapping
    public List<PurchaseOrder> getAll() {
        return service.getAll();
    }
}