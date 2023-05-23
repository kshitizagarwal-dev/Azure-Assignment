package com.nagarro.kshitizagarwal.Application2.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.kshitizagarwal.Application2.Repository.Repo;
import com.nagarro.kshitizagarwal.Application2.model.UserDetails;

@Component
@RestController
public class DatabaseServiceImpl {
	
	@Autowired 
	private UserDetails userDetails;
	
	@Autowired 
	private Repo repo;
	
	@GetMapping("/")
	public List<UserDetails> get() {
		
		List<UserDetails> ud = this.repo.findAll();
		return ud;		
	}
}
