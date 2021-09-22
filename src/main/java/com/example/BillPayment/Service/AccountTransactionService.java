package com.example.BillPayment.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BillPayment.Model.AccountTransaction;
import com.example.BillPayment.Model.Accounts;
import com.example.BillPayment.Model.Bills;
import com.example.BillPayment.Repo.AccountTransactionRepository;
import com.example.BillPayment.Repo.AccountsRepository;

@Service
public class AccountTransactionService {

	@Autowired
	private AccountTransactionRepository accountTransactionRepository;
	
	@Autowired
	private AccountsRepository accountsRepository;

	public AccountTransactionService(AccountTransactionRepository accountTransactionRepository) {
		super();
		this.accountTransactionRepository = accountTransactionRepository;
	}
	
	public AccountTransaction findbyID(Long accountTransactionRef) {
		return accountTransactionRepository.findById(accountTransactionRef).orElse(null);
	}

	public AccountTransaction addTransaction(AccountTransaction transaction) {
		return accountTransactionRepository.save(transaction);
	}

	public List<AccountTransaction> getAllTransactions() {
		return accountTransactionRepository.findAll();
	}
	
	public List<AccountTransaction> findbyAccountSequenceId(Long sequenceid) {
		List<AccountTransaction> lb = getAllTransactions();
		List<AccountTransaction> res = new ArrayList<AccountTransaction>();
		for(int i = 0; i< lb.size(); i++) {
			if(lb.get(i).getSeqid() == sequenceid ) {
				res.add(lb.get(i));
			}
		}
		return res;
//		return accountTransactionRepository.findBySeqid(accountsRepository.findById(sequenceid).get());
	}
	
	
}
