package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Aboutme;
import com.repository.AboutmeRepository;

@Service
public class AboutmeServiceImpl implements AboutmeService{

	@Autowired
	public AboutmeRepository aboutRepo; 
	
	@Override
	public Aboutme getAbout() {
		return aboutRepo.findById(1L).orElse(null);
	}

	@Override
	public Aboutme update(Aboutme about ,Long id ) {

	    Aboutme existing = aboutRepo.findById(id)
	            .orElseThrow(() -> new RuntimeException("About Me not found"));

	    existing.setSummary(about.getSummary());

	    return aboutRepo.save(existing);
	}

}
