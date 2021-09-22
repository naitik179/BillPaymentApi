package com.example.BillPayment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.BillPayment.Service.UsersService;

@RestController
public class UsersController {
	
	@Autowired
	private UsersService usersService;

	public UsersController(UsersService usersService) {
		super();
		this.usersService = usersService;
	}
	
	

}
