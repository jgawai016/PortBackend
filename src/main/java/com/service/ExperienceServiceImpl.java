package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Experience;
import com.repository.ExperienceRepository;

@Service
public class ExperienceServiceImpl implements ExperienceService{

	@Autowired
	public ExperienceRepository expRepo;
	
	@Override
	public Experience saveExperience(Experience exp) {
		
		return expRepo.save(exp);
	}

	@Override
	public List<Experience> getAllExperience() {
		List<Experience> expList = expRepo.findAll();
		return expList;
	}

	@Override
	public void deleteExperience(Long id) {
		expRepo.deleteById(id);
	}

	@Override
	public Experience updateExp(Experience exp, Long id) {
		Experience e = expRepo.findById(id).orElseThrow(() -> new RuntimeException("Experience not found."));
		
		e.setCompanyName(exp.getCompanyName());
		e.setDescription(exp.getDescription());
		e.setEndDate(exp.getEndDate());
		e.setRole(exp.getRole());
		e.setId(exp.getId());
		e.setStartDate(exp.getStartDate());
		
		return expRepo.save(e);
	}

}
