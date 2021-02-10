package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Account;
import com.example.demo.service.AccountServiceImpl;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/accounts")
public class AccountController {
	
	@Autowired
	private AccountServiceImpl service;
	
	@PostMapping(value = "/createNewAccount")
	public ResponseEntity<String> createNewAccount(@RequestBody Account account)
	{
		Integer accountNo=service.createNewAccount(account);
		return new ResponseEntity<>("Account Number :"+accountNo+" Created Successfully", HttpStatus.OK);
	}
	

}