package com.example.BillPayment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BillPayment.Repo.AccountTransactionRepository;
import com.example.BillPayment.Repo.AccountsRepository;

@Service
public class AccountTransactionService {

	@Autowired
	private AccountTransactionRepository accountTransactionRepository;

	public AccountTransactionService(AccountTransactionRepository accountTransactionRepository) {
		super();
		this.accountTransactionRepository = accountTransactionRepository;
	}
	
	
}
