package com.service;

import com.model.Aboutme;

public interface AboutmeService {

	public Aboutme getAbout();
	public Aboutme update(Aboutme about,Long id);
}
