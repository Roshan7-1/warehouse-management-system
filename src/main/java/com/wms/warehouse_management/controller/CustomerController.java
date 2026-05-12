package com.wms.warehouse_management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.wms.warehouse_management.entity.Customer;
import com.wms.warehouse_management.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @PostMapping
    public Customer create(@RequestBody Customer customer) {
        return service.save(customer);
    }

    @GetMapping
    public List<Customer> getAll() {
        return service.getAll();
    }
}