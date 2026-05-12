package com.wms.warehouse_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wms.warehouse_management.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}