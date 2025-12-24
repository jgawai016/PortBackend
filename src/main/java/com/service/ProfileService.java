package com.service;

import java.util.List;

import com.model.Profile;

public interface ProfileService {

	public Profile saveProfile(Profile profile);
	public List<Profile> getList();
}
