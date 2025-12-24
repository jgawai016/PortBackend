package com.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Admin;

public interface AdminRepository extends JpaRepository<Admin,Long>{

	Optional<Admin> findByUsername(String username);
}
