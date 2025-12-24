package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Skills;
import com.repository.SkillsRepository;

@Service
public class SkillsServiceImpl implements SkillsServices{

	@Autowired
	public SkillsRepository sRepo;
	
	@Override
	public List<Skills> getAllSkills() {
		return sRepo.findAll();
	}

	@Override
	public Skills updateSkill(Long id, Skills skill) {

	    Skills existing = sRepo.findById(id)
	            .orElseThrow(() -> new RuntimeException("Skill not found"));

	    existing.setSkillName(skill.getSkillName());
	    existing.setCategory(skill.getCategory());
	    existing.setProficiency(skill.getProficiency());

	    return sRepo.save(existing);
	}

	@Override
	public Skills addSkill(Skills skill) {
		return sRepo.save(skill);
	}

	@Override
	public void deleteSkill(Long id) {
		sRepo.deleteById(id);
	}

}
