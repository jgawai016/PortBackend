package com.service;

import java.util.List;

import com.model.Skills;

public interface SkillsServices {

	public List<Skills> getAllSkills();
	public Skills addSkill(Skills skill);
	public void deleteSkill(Long id);
	public Skills updateSkill(Long id, Skills skill);
}
