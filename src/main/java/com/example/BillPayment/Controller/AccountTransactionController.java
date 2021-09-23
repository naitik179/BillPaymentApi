package com.example.BillPayment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BillPayment.Model.AccountTransaction;
//import com.example.BillPayment.Model.Bills;
import com.example.BillPayment.Service.AccountTransactionService;

@RestController
@RequestMapping("/transaction")
public class AccountTransactionController {

	@Autowired
	private AccountTransactionService accountTransactionService;

	public AccountTransactionController(AccountTransactionService accountTransactionService) {
		super();
		this.accountTransactionService = accountTransactionService;
	}
	
	@GetMapping()
	public List<AccountTransaction> list() {
            return accountTransactionService.getAllTransactions();
    }

	@GetMapping("/{transactionRef}")
	public AccountTransaction getuserbyTransactionReference(@PathVariable Long transactionRef) {
		return accountTransactionService.findbyID(transactionRef);
	}
	
	
	 @GetMapping("/sequence/{sequenceid}") 
	 public List<AccountTransaction> getTransactionBySequenceId(@PathVariable Long sequenceid) { 
		 return accountTransactionService.findbyAccountSequenceId(sequenceid); 
	 }
	 
	
	
	@PostMapping("/add")
	public ResponseEntity<AccountTransaction> addTransaction(@RequestBody AccountTransaction transaction) {
		AccountTransaction newTransaction = accountTransactionService.addTransaction(transaction);
		return new ResponseEntity<>(newTransaction , HttpStatus.CREATED);
		
	}	
	
	@GetMapping("/account/{accno}")
	public List<AccountTransaction> getTransactionByaccno(@PathVariable Long accno) {
            return accountTransactionService.getTransactionAcc(accno);
    }

	
	
}
