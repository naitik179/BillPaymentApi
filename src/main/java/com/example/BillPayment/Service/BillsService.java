package com.example.BillPayment.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BillPayment.Model.AccountTransaction;
import com.example.BillPayment.Model.Accounts;
import com.example.BillPayment.Model.Bills;
import com.example.BillPayment.Repo.AccountTransactionRepository;
import com.example.BillPayment.Repo.AccountsRepository;
//import com.example.BillPayment.Model.RegisteredBillers;
import com.example.BillPayment.Repo.BillsRepository;
import com.example.BillPayment.Service.BillsService;

@Service
public class BillsService {

	@Autowired
	private BillsRepository billsRepository;
	
	@Autowired
	private AccountsRepository accountsRepository;
	
	@Autowired
	private AccountTransactionRepository accountTransactionRepository;

	public BillsService(BillsRepository billsRepository) {
		super();
		this.billsRepository = billsRepository;
	}
	
	public Bills findbyID(Long billid) {
		return billsRepository.findById(billid).orElse(null);
	}

	public Bills addBill(Bills bill) {
		return billsRepository.save(bill);
	}

	public List<Bills> getAllBills() {
		return billsRepository.findAll();
	}
	
	public List<Bills> getBillsByBillerId(Long bill) {
		List<Bills> lb = getAllBills();
		List<Bills> res = new ArrayList<Bills>();
		for(int i = 0; i< lb.size(); i++) {
			if(lb.get(i).getBillerid().getBillerid() == bill ) {
				res.add(lb.get(i));
			}
		}
		return res;
	}
	
	public Bills BillPayment(Long billid) {
		Bills bill = findbyID(billid);
		Long custaccno = bill.getBillerid().getConsumeraccountno().getConsumeraccountno();
		
		AccountTransaction act = new AccountTransaction();
	
		
		Accounts account = accountsRepository.findById(custaccno).orElse(null);
		if(bill.getAmount() < account.getCurrentbal()) {
			account.setCurrentbal(account.getCurrentbal() - bill.getAmount());
			bill.setStatus(false);
			accountsRepository.save(account);
			billsRepository.save(bill);
			
			act.setAmount(bill.getAmount());
			act.setBillid(bill);
			act.setConsumeraccountno(custaccno);
			act.setDescription("Bill Payment of " + bill.getAmount());
			act.setSeqid(bill.getBillerid().getConsumeraccountno().getUser().getSequenceid());
			long millis=System.currentTimeMillis();  
			java.sql.Date date=new java.sql.Date(millis);  
			act.setTime(date);
			act.setType("Debit");
			
			accountTransactionRepository.save(act);
		}
		return bill;
	}
	
}
