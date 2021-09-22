package com.example.BillPayment.Controller;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BillPayment.Model.Bills;
import com.example.BillPayment.Service.BillsService;

@RestController
public class BillsController {
	
	@Autowired
	private BillsService billService;

	public BillsController(BillsService billService) {
		super();
		this.billService = billService;
	}
	
	@GetMapping("/bills")
	public List<Bills> list() {
            return billService.getAllBills();
    }

	@GetMapping("/bills/{billid}")
	public Bills getuserbybillid(@PathVariable Long billid) {
		return billService.findbyID(billid);
	}
	
	
	 @GetMapping("/bills/biller/{billerid}") 
	 public List<Bills> getuserbybillerid(@PathVariable Long billerid) { 
		 return billService.getBillsByBillerId(billerid); 
	 }
	 
	
	
	@PostMapping("/bills/add")
	public ResponseEntity<Bills> addUsers(@RequestBody Bills bill) {
		Bills newbill =billService.addBill(bill);
		return new ResponseEntity<>(newbill , HttpStatus.CREATED);
		
	}	
	
	

}
