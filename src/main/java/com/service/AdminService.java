package com.service;

import com.model.Admin;

public interface AdminService {

	Admin login(String username, String password);
}
