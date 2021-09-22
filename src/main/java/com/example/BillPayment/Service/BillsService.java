package com.example.BillPayment.Service;

import java.util.ArrayList;
import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BillPayment.Model.Bills;
//import com.example.BillPayment.Model.RegisteredBillers;
import com.example.BillPayment.Repo.BillsRepository;
import com.example.BillPayment.Service.BillsService;

@Service
public class BillsService {

	@Autowired
	private BillsRepository billsRepository;

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
	
	
}
