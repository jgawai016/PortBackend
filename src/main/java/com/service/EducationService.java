package com.service;

import java.util.List;

import com.model.Education;

public interface EducationService {

	public Education saveEducation(Education education);
	public List<Education> getAllEducation();
	public void deleteEducation(Long id);
	public Education updateEducation(Long id,Education edu);
}
