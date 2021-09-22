package com.example.BillPayment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BillPayment.Model.MasterBillers;
import com.example.BillPayment.Repo.MasterBillersRepository;


@Service
public class MasterBillersService {
	
	@Autowired
	private MasterBillersRepository masterBillersRepository;

	public MasterBillersService(MasterBillersRepository masterBillersRepository) {
		super();
		this.masterBillersRepository = masterBillersRepository;
	}
	

    public MasterBillers saveBiller(MasterBillers biller) {
    	
        return masterBillersRepository.save(biller);
    }

    public List<MasterBillers> saveBillers(List<MasterBillers> billers) {
        return masterBillersRepository.saveAll(billers);
    }

    public List<MasterBillers> getBillers() {
        return masterBillersRepository.findAll();
    }

    public MasterBillers getBillerById(Long id) {
        return masterBillersRepository.findById(id).orElse(null);
    }

	/*
	 * public MasterBillers getBillerByName(String name) { return
	 * masterBillersRepository.findByName(name); }
	 */

    public String deleteBiller(Long id) {
    	masterBillersRepository.deleteById(id);
        return "biller removed !! " + id;
    }


}
