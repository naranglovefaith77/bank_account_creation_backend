package com.example.demo.service;

import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccountRepository;
import com.example.demo.entities.Account;

@Service
public class AccountServiceImpl implements IAccountService {
	
	@Autowired
    private AccountRepository repository;
    
    @Override
    public Integer createNewAccount(Account account)
    {
 	   Random r= new Random();
 	   account.setAccountNo(Math.abs(r.nextInt()));
 	   Account c1=repository.save(account);
 	   return c1.getAccountNo(); 
    }

}