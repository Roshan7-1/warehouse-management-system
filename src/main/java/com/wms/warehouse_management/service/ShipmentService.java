package com.wms.warehouse_management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wms.warehouse_management.entity.Shipment;
import com.wms.warehouse_management.repository.ShipmentRepository;

@Service
public class ShipmentService {

    private final ShipmentRepository repository;

    public ShipmentService(ShipmentRepository repository) {
        this.repository = repository;
    }

    public Shipment save(Shipment shipment) {
        return repository.save(shipment);
    }

    public List<Shipment> getAll() {
        return repository.findAll();
    }
}