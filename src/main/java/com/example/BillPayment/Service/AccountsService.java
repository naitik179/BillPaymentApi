package com.example.BillPayment.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BillPayment.Model.Accounts;
import com.example.BillPayment.Repo.AccountsRepository;

@Service
public class AccountsService {

	@Autowired
	private AccountsRepository accountsRepository;

	public AccountsService(AccountsRepository accountsRepository) {
		super();
		this.accountsRepository = accountsRepository;
	}

	public List<Accounts> getAllUsers() {
		return accountsRepository.findAll();
	}

	public Accounts addAccount(Accounts account) {
		return accountsRepository.save(account);
		
	}

	public List<Accounts> getAccountUserByEmail(String email) {
		return accountsRepository.findByEmailid(email);
		
	}

	public List<Accounts> getAccountUserByName(String name) {
		return accountsRepository.findByAccname(name);
	}

	public Accounts getAccountUserByAccount(Long customerAccount) {
		return accountsRepository.findById(customerAccount).orElse(null);
	}

	public void deleteAccountById(Long customerAccount) {
		accountsRepository.deleteById(customerAccount);
		
	}

}
