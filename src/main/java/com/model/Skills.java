package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Skills {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String skillName;
	private String category;
	private int proficiency;
	
	public Skills() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getProficiency() {
		return proficiency;
	}

	public void setProficiency(int proficiency) {
		this.proficiency = proficiency;
	}

	public Skills(Long id, String skillName, String category, int proficiency) {
		super();
		this.id = id;
		this.skillName = skillName;
		this.category = category;
		this.proficiency = proficiency;
	}
	
}
