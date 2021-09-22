package com.example.BillPayment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BillPayment.Repo.RegisteredBillersRepository;

@Service
public class RegisteredBillersService {

	@Autowired
	private RegisteredBillersRepository registeredBillersRepository;

	public RegisteredBillersService(RegisteredBillersRepository registeredBillersRepository) {
		super();
		this.registeredBillersRepository = registeredBillersRepository;
	}
	
	
	
}
