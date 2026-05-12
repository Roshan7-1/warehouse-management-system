package com.wms.warehouse_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wms.warehouse_management.entity.StorageBin;

public interface StorageBinRepository extends JpaRepository<StorageBin, Long> {

}