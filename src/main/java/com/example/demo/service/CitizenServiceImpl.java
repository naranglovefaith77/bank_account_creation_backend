package com.example.demo.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CitizenRepository;
import com.example.demo.entities.Citizen;


@Service
public class CitizenServiceImpl implements ICitizenService{
	
       @Autowired
       private CitizenRepository repository;
       
       @Override
       public Integer generateCitizenId(Citizen citizen)
       {
    	   Random r= new Random();
    	   citizen.setCitizenId(Math.abs(r.nextInt()));
    	   Citizen c1=repository.save(citizen);
    	   return c1.getCitizenId();
       }


	

		
    
       
	}

