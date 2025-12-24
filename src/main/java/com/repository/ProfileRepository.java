package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Profile;

public interface ProfileRepository extends JpaRepository<Profile,Long>{

}
