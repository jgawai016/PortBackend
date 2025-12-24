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
import com.model.Education;
import com.service.EducationService;

@RequestMapping("/api/education")
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class EducationController {

	@Autowired
	public EducationService eduService;
	
	@PostMapping("/saveEducation")
	public ResponseEntity<Education> saveEducation(@RequestBody Education education)
	{
		Education e= eduService.saveEducation(education);
		return ResponseEntity.status(HttpStatus.CREATED).body(e);
	}
	
	@GetMapping("/getEducation")
	public ResponseEntity<List<Education>> getAllEducation()
	{
		return ResponseEntity.ok(eduService.getAllEducation());
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEducation(@PathVariable Long id)
	{
		eduService.deleteEducation(id);
		return ResponseEntity.ok("Education deleted successfully!");
	}
	
	@PutMapping("/update/{id}")
	public Education updateEducation(@PathVariable Long id,@RequestBody Education edu) {
        return eduService.updateEducation(id, edu);
    }
}
