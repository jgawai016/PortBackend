package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Profile;
import com.service.ProfileService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/profile")
public class ProfileController {

	@Autowired
	public ProfileService proService;
	
	@PostMapping("/saveProfile")
	public ResponseEntity<Profile> saveProfile(@RequestBody Profile p)
	{
		Profile pro = proService.saveProfile(p);
		return ResponseEntity.status(HttpStatus.CREATED).header("add", "Add profile.").body(pro);
	}
	
	
	@GetMapping("/getAllProfile")
	public ResponseEntity<List<Profile>> getAllProfile()
	{
		List<Profile> allprofile = proService.getList();
		return ResponseEntity.ok(allprofile);
	}
}
