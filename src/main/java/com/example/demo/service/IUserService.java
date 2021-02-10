package com.example.demo.service;

import com.example.demo.entities.User;

public interface IUserService {

	public User saveUser(User user);
	public User updateUserPassword(String uemailid, User user);
	public String getUser(String uemailid, String upass);
	
}
