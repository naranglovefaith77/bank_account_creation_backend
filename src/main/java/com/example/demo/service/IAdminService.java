package com.example.demo.service;

import com.example.demo.entities.Admin;

public interface IAdminService {

	public Admin saveAdmin(Admin admin);
	public void updateAdminPassword(String adminUserName);
	public Admin getAdmin(String adminUserName);
	public Admin checkPassword(String adminUserName, String adminPassword);
	
}
