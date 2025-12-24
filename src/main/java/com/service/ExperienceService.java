package com.service;

import java.util.List;

import com.model.Experience;

public interface ExperienceService {

	public Experience saveExperience(Experience exp);
	public List<Experience> getAllExperience();
	public void deleteExperience(Long id);
	public Experience updateExp(Experience exp,Long id);
}
