package com.example.BillPayment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BillPayment.Repo.RegisteredBillersRepository;
import com.example.BillPayment.Model.RegisteredBillers;

@Service
public class RegisteredBillersService {

	@Autowired
	private RegisteredBillersRepository registeredBillersRepository;

	public RegisteredBillersService(RegisteredBillersRepository registeredBillersRepository) {
		super();
		this.registeredBillersRepository = registeredBillersRepository;
	}
	
	public RegisteredBillers saveRegisteredBiller(RegisteredBillers registeredBiller) {
    	
        	return registeredBillersRepository.save(registeredBiller);
    }

    public List<RegisteredBillers> saveBillers(List<RegisteredBillers> registeredBillers) {
        return registeredBillersRepository.saveAll(registeredBillers);
    }

    public List<RegisteredBillers> getRegisteredBillers() {
        return registeredBillersRepository.findAll();
    }

    public RegisteredBillers getRegisteredBillerById(Long id) {
        return registeredBillersRepository.findById(id).orElse(null);
    }

	
    public RegisteredBillers updateRegisteredBiller(RegisteredBillers registeredBiller) { 
    	RegisteredBillers existingRegisteredBiller = registeredBillersRepository.findById(registeredBiller.getBillerid()).orElse(null);
        existingRegisteredBiller.setAutopay(registeredBiller.getAutopay());
        existingRegisteredBiller.setLimitamount(registeredBiller.getLimitamount());
    	return registeredBillersRepository.save(existingRegisteredBiller); 
    }
	 

    public String deleteRegisteredBiller(Long id) {
    	registeredBillersRepository.deleteById(id);
        return "biller removed !! " + id;
    }
	
	
}
