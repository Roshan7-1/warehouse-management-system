package com.wms.warehouse_management.service;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.wms.warehouse_management.entity.User;
import com.wms.warehouse_management.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository repository,
                       PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    public User register(User user) {

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return repository.save(user);
    }

    public List<User> getAll() {
        return repository.findAll();
    }
}