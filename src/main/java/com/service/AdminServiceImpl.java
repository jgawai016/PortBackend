package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Admin;
import com.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepo;

    @Override
    public Admin login(String username, String password) {

        // DEBUG (temporary – remove later)
        System.out.println("Username received: " + username);
        System.out.println("Admins in DB: " + adminRepo.findAll());

        Admin admin = adminRepo.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Invalid username"));

        if (!admin.getPassword().equals(password)) {
            throw new RuntimeException("Invalid password");
        }

        return admin;
    }
}
