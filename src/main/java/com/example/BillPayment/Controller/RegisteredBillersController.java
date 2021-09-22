package com.example.BillPayment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.BillPayment.Service.RegisteredBillersService;

@RestController
public class RegisteredBillersController {

	@Autowired
	private RegisteredBillersService registeredBillersService;

	public RegisteredBillersController(RegisteredBillersService registeredBillersService) {
		super();
		this.registeredBillersService = registeredBillersService;
	}
	
	
	
}
