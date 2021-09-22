package com.example.BillPayment.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BillPayment.Model.Accounts;
import com.example.BillPayment.Service.AccountsService;

@RestController
@RequestMapping("/accounts")
public class AccountsController {
	
	@Autowired
	private AccountsService accountService;

	public AccountsController(AccountsService accountService) {
		super();
		this.accountService = accountService;
	}
	
	
	@GetMapping()
	public List<Accounts> list() {
            return accountService.getAllUsers();
    }
	
	@PostMapping("/add")
	public ResponseEntity<Accounts> addAccounts(@RequestBody Accounts account) {
		Accounts newAccount =accountService.addAccount(account);
		return new ResponseEntity<>(newAccount , HttpStatus.CREATED);
		
	}
	
	@GetMapping("/email/{email}")
	public List<Accounts> getAccountUserByEmail(@PathVariable String email){
		return accountService.getAccountUserByEmail(email);
	}
	
	@GetMapping("/{customerAccount}")
	public Optional<Accounts> getAccountUserByAccount(@PathVariable Long customerAccount ){
		return accountService.getAccountUserByAccount(customerAccount);
	}
	
	
	@GetMapping("/name/{name}")
	public List<Accounts> getAccountUserByName(@PathVariable String name){
		return accountService.getAccountUserByName(name);
	}
	
	@DeleteMapping("/{customerAccount}")
    public String deleteAccountById(@PathVariable("customerAccount") Long customerAccount) {
        accountService.deleteAccountById(customerAccount);
        return "Account deleted Successfully!!";
    }
	

}
