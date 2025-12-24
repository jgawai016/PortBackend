package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.model.Admin;
import com.service.AdminService;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "*")
public class AdminController {

	@Autowired
	private AdminService adminService;

	@PostMapping("/login")
	public Admin login(@RequestBody Admin admin) {
		return adminService.login(
				admin.getUsername(),
				admin.getPassword()
		);
	}
}
