package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Contact;

public interface ContactRepository extends JpaRepository<Contact,Long>{

}
