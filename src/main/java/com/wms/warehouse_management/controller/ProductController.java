package com.wms.warehouse_management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.wms.warehouse_management.entity.Product;
import com.wms.warehouse_management.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        return service.save(product);
    }

    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }
}