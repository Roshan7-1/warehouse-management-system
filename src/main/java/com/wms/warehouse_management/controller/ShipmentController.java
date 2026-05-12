package com.wms.warehouse_management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wms.warehouse_management.entity.Shipment;
import com.wms.warehouse_management.service.ShipmentService;

@RestController
@RequestMapping("/shipments")
public class ShipmentController {

    private final ShipmentService service;

    public ShipmentController(ShipmentService service) {
        this.service = service;
    }

    @PostMapping
    public Shipment save(@RequestBody Shipment shipment) {
        return service.save(shipment);
    }

    @GetMapping
    public List<Shipment> getAll() {
        return service.getAll();
    }
}