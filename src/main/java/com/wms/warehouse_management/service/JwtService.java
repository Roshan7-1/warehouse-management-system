package com.wms.warehouse_management.service;

import org.springframework.stereotype.Service;

@Service
public class JwtService {

    public String generateToken(String email) {

        return "JWT_TOKEN_FOR_" + email;
    }
}