package com.example.BillPayment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.BillPayment.Service.AccountTransactionService;

@RestController
public class AccountTransactionController {

	@Autowired
	private AccountTransactionService accountTransactionService;

	public AccountTransactionController(AccountTransactionService accountTransactionService) {
		super();
		this.accountTransactionService = accountTransactionService;
	}
	
	
}
