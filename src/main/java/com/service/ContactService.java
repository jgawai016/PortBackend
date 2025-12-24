package com.service;

import java.util.List;
import java.util.Optional;

import com.model.Contact;

public interface ContactService {

	public Contact saveMessage(Contact contact);
	public List<Contact> getAllContact();
	public Optional<Contact> getContactById(Long id);
	public void deleteContact(Long id);
}
