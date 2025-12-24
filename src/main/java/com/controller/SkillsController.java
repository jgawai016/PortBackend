package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Skills;
import com.service.SkillsServices;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/skills")
public class SkillsController {

	@Autowired
	public SkillsServices sService;
	
	 @PostMapping("/saveSkills")
	 public Skills addSkill(@RequestBody Skills skill) {
	    return sService.addSkill(skill);
	 }
	 
	@GetMapping("/getskills")
	public List<Skills> getAllSkills()
	{
		return sService.getAllSkills();
	}
	
	@PutMapping("/update/{id}")
    public Skills updateSkill(@PathVariable Long id,@RequestBody Skills skill) {
        return sService.updateSkill(id,skill);
    }
	
	 @DeleteMapping("/delete/{id}")
	    public void deleteSkill(@PathVariable Long id) {
		 sService.deleteSkill(id);
	    }
}
