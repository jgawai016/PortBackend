package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.model.Project;
import com.service.ProjectService;

@RestController
@RequestMapping("/api/project")
@CrossOrigin(origins = "http://localhost:3000")
public class ProjectController {

	@Autowired
	public ProjectService pService;
	
	@PostMapping("/saveProject")
	public ResponseEntity<Project> saveProject(@RequestBody Project project)
	{
		Project p = pService.addProject(project);
		return ResponseEntity.status(HttpStatus.CREATED).body(p);
	}
	
	@GetMapping("/getAllProject")
	public ResponseEntity<List<Project>> getAllProject()
	{
		return ResponseEntity.ok(pService.getAllProject());
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteProject(@PathVariable Long id)
	{
		pService.deleteProject(id);
		return ResponseEntity.ok("Project deleted Successfully!");
	}
	
	@PutMapping("/update/{id}")
	public Project updateProject(@PathVariable Long id,@RequestBody Project project) {
        return pService.updateProject(project, id);
        }
}
