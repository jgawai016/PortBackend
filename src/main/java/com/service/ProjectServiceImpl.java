package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.repository.ProjectRepository;
import com.model.Project;

@Service
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	public ProjectRepository pRepo;
	
	@Override
	public Project addProject(Project project) {
		return pRepo.save(project);
	}

	@Override
	public List<Project> getAllProject() {
		return pRepo.findAll();
	}

	@Override
	public void deleteProject(Long id) {
		pRepo.deleteById(id);
	}

	@Override
	public Project updateProject(Project project, Long id) {
		Project existing = pRepo.findById(id)
		            .orElseThrow(() -> new RuntimeException("Project not found"));

		    existing.setProjectName(project.getProjectName());
		    existing.setDescription(project.getDescription());
		    existing.setTechStack(project.getTechStack());
		    existing.setGithubLink(project.getGithubLink());
		    existing.setLiveLink(project.getLiveLink());

		    return pRepo.save(existing);
	}

}
