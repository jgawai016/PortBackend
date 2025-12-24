package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.model.Aboutme;
import com.service.AboutmeService;

@RestController
@RequestMapping("/api/about")
@CrossOrigin(origins = "http://localhost:3000")
public class AboutmeController {

	@Autowired
	public AboutmeService aboutSrvice;
	
	 @GetMapping("/getabout")
	 public Aboutme getAbout() {
	    return aboutSrvice.getAbout();
	 }
	 
	 @PutMapping("/update")
	 public Aboutme update(@RequestBody Aboutme about) {
	     return aboutSrvice.update(about, 1L);
	 }

}
