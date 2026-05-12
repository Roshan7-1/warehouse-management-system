package com.wms.warehouse_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wms.warehouse_management.entity.PurchaseOrder;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {

}