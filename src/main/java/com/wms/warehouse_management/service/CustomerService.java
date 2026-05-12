package com.wms.warehouse_management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wms.warehouse_management.entity.Customer;
import com.wms.warehouse_management.repository.CustomerRepository;

@Service
public class CustomerService {

    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public Customer save(Customer customer) {
        return repository.save(customer);
    }

    public List<Customer> getAll() {
        return repository.findAll();
    }
}