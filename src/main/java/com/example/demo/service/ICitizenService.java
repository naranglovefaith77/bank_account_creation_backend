package com.example.demo.service;

import com.example.demo.entities.Citizen;
 
public interface ICitizenService {

	//public Citizen findCitizenByEmail(String citizenEmail);
	
	public Integer generateCitizenId(Citizen citizen);
	
}
