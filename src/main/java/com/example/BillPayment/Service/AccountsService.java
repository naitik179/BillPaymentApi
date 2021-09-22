package com.example.BillPayment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BillPayment.Repo.AccountsRepository;

@Service
public class AccountsService {

	@Autowired
	private AccountsRepository accountsRepository;

	public AccountsService(AccountsRepository accountsRepository) {
		super();
		this.accountsRepository = accountsRepository;
	}


	
	
}
