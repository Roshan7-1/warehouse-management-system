package com.wms.warehouse_management.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @PostMapping("/create")
    public Map<String, Object> createOrder(
            @RequestParam String orderNumber) {

        Map<String, Object> response = new HashMap<>();

        response.put("message", "Order created successfully");
        response.put("orderNumber", orderNumber);
        response.put("status", "CREATED");

        return response;
    }

    @GetMapping("/{orderNumber}")
    public Map<String, Object> getOrder(
            @PathVariable String orderNumber) {

        Map<String, Object> response = new HashMap<>();

        response.put("orderNumber", orderNumber);
        response.put("status", "PROCESSING");
        response.put("estimatedDelivery", "2 Days");

        return response;
    }
}