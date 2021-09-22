package com.example.BillPayment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BillPayment.Model.RegisteredBillers;
import com.example.BillPayment.Service.RegisteredBillersService;

@RestController
public class RegisteredBillersController {

	@Autowired
	private RegisteredBillersService registeredBillersService;

	public RegisteredBillersController(RegisteredBillersService registeredBillersService) {
		super();
		this.registeredBillersService = registeredBillersService;
	}

	
    @PostMapping("/addRegisteredBiller")
    public RegisteredBillers addRegisteredBiller(@RequestBody RegisteredBillers registeredBiller) {
    	
        return registeredBillersService.saveRegisteredBiller(registeredBiller);
    }

    @PostMapping("/addRegisteredBillers")
    public List<RegisteredBillers> addRegisteredBillers(@RequestBody List<RegisteredBillers> registeredBillers) {
        return registeredBillersService.saveBillers(registeredBillers);
    }

    @GetMapping("/registeredBillers")
    public List<RegisteredBillers> findAllRegisteredBillers() {
        return registeredBillersService.getRegisteredBillers();
    }

    @GetMapping("/registeredBillerById/{id}")
    public RegisteredBillers findRegisteredBillerById(@PathVariable Long id) {
        return registeredBillersService.getRegisteredBillerById(id);
    }
    
    @PutMapping("/update") 
    public RegisteredBillers updateProduct(@RequestBody RegisteredBillers registeredBiller) { 
    	return registeredBillersService.updateRegisteredBiller(registeredBiller); 
    }

    @DeleteMapping("/deleteRegisteredBiller/{id}")
    public String deleteRegisteredBiller(@PathVariable Long id) {
        return registeredBillersService.deleteRegisteredBiller(id);
    }
	
	
}
