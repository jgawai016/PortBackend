package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Profile;
import com.repository.ProfileRepository;

@Service
public class ProfileServiceImpl implements ProfileService{

	@Autowired
	public ProfileRepository pRepo;
	
	@Override
	public Profile saveProfile(Profile profile) {
		
		return pRepo.save(profile);
	}

	@Override
	public List<Profile> getList() {
		
		return pRepo.findAll();
	}

}
