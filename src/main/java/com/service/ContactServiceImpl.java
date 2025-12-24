package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Contact;
import com.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService{

	@Autowired
	public ContactRepository cRepo;
	
	@Override
	public Contact saveMessage(Contact contact) {
		
		return cRepo.save(contact);
	}

	@Override
	public List<Contact> getAllContact() {
		return cRepo.findAll();
	}

	@Override
	public Optional<Contact> getContactById(Long id) {
		return cRepo.findById(id);
	}

	@Override
	public void deleteContact(Long id) {
		cRepo.deleteById(id);
	}

}
