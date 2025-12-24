package com.service;

import java.util.List;

import com.model.Project;

public interface ProjectService {

	public Project addProject(Project project);
	public List<Project> getAllProject();
	public void deleteProject(Long id);
	public Project updateProject(Project project,Long id);
}
