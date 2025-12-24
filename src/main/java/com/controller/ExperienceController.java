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
import com.model.Experience;
import com.service.ExperienceService;

@RestController
@RequestMapping("/api/experience")
@CrossOrigin(origins = "http://localhost:3000")
public class ExperienceController {

	@Autowired
	public ExperienceService expService;
	
	@PostMapping("/saveExperience")
	public ResponseEntity<Experience> saveExperience(@RequestBody Experience exp)
	{
		Experience e = expService.saveExperience(exp);
		return ResponseEntity.status(HttpStatus.CREATED).body(e);
	}
	
	@GetMapping("/getallExperience")
	public ResponseEntity<List<Experience>> getAllExperience()
	{
		return ResponseEntity.ok(expService.getAllExperience());
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteExperience(@PathVariable Long id)
	{
		expService.deleteExperience(id);
		return ResponseEntity.ok("Experience Deleted Successfully!");
	}
	
	@PutMapping("/update/{id}")
	public Experience updateExp(@RequestBody Experience exp,@PathVariable Long id)
	{
		return expService.updateExp(exp, id);
	}
}
