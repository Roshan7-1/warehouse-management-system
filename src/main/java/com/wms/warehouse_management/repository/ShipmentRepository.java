package com.wms.warehouse_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wms.warehouse_management.entity.Shipment;

public interface ShipmentRepository extends JpaRepository<Shipment, Long> {

}