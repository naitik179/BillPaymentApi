package com.example.BillPayment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.BillPayment.Service.AccountsService;

@RestController
public class AccountsController {
	
	@Autowired
	private AccountsService accountService;

	public AccountsController(AccountsService accountService) {
		super();
		this.accountService = accountService;
	}
	
	

}
