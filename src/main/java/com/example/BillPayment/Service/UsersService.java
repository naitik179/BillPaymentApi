package com.example.BillPayment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BillPayment.Repo.UserRepository;

@Service
public class UsersService {
	
	@Autowired
	private UserRepository userRepository;

	public UsersService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	

}
