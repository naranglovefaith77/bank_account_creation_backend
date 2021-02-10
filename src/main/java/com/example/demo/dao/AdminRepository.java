package com.example.demo.dao;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Admin;


public interface AdminRepository  extends CrudRepository<Admin, String>{
	
}