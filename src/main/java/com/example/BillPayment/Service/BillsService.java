package com.example.BillPayment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BillPayment.Repo.BillsRepository;

@Service
public class BillsService {

	@Autowired
	private BillsRepository billsRepository;

	public BillsService(BillsRepository billsRepository) {
		super();
		this.billsRepository = billsRepository;
	}
	
}
