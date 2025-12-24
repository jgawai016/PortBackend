package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Contact;
import com.service.ContactService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/contact")
public class ContactController {

	@Autowired
	public ContactService cService;
	
	 @PostMapping("/save")
	  public ResponseEntity<Contact> saveContact(@RequestBody Contact contact) {
	    return ResponseEntity.ok(cService.saveMessage(contact));
	  }
}
