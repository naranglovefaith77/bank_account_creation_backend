package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Citizen;
import com.example.demo.service.CitizenServiceImpl;


@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1")
public class CitizenController {
      
	@Autowired
	 private CitizenServiceImpl service;
	
	
	@PostMapping(value = "/citizens")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<String> generateCitizenId(@Valid @RequestBody Citizen citizen)
	{
		Integer citizenId=service.generateCitizenId(citizen);
		return new ResponseEntity<>("Citizen With ID :"+citizenId+" Created Successfully", HttpStatus.OK);
	}
	
/*/	@GetMapping("/a/{citizenEmail}")
	public ResponseEntity<Citizen> findCitizenByEmail(@PathVariable String citizenEmail){
		Citizen citizen = service.findCitizenByEmail(citizenEmail);
		return new ResponseEntity<>(citizen, HttpStatus.OK);
	}
	
/*/	
	
}
