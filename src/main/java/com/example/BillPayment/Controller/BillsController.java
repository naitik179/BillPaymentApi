package com.example.BillPayment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.BillPayment.Service.BillsService;

@RestController
public class BillsController {
	
	@Autowired
	private BillsService billService;

	public BillsController(BillsService billService) {
		super();
		this.billService = billService;
	}
	
	
	

}
