package com.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.model.Education;
import com.repository.EducationRepository;

@Service
public class EducationServiceImpl implements EducationService{

	@Autowired
	public EducationRepository eduRepo;
	
	@Override
	public Education saveEducation(Education education) {
		return eduRepo.save(education);
	}

	@Override
	public List<Education> getAllEducation() {
		return eduRepo.findAll();
	}

	@Override
	public void deleteEducation(Long id) {
		eduRepo.deleteById(id);;
	}

	@Override
	public Education updateEducation(Long id, Education edu) {
		Education existing = eduRepo.findById(id)
	            .orElseThrow(() -> new RuntimeException("Education not found"));
		
		existing.setDegree(edu.getDegree());
		existing.setCollege(edu.getCollege());
		existing.setPercentage(edu.getPercentage());
		existing.setYear(edu.getYear());
		existing.setId(edu.getId());
		
		return eduRepo.save(existing);
	}

}
