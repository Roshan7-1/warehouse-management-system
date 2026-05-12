package com.wms.warehouse_management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.wms.warehouse_management.entity.Product;
import com.wms.warehouse_management.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public Product create(@Valid @RequestBody Product product) {
        return service.save(product);
    }

    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {

        service.delete(id);

        return "Product deleted successfully";
    }
}