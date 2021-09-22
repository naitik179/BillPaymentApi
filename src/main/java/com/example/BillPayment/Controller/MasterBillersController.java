package com.example.BillPayment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BillPayment.Model.MasterBillers;
import com.example.BillPayment.Service.MasterBillersService;


@RestController
public class MasterBillersController {
	
	@Autowired
	private MasterBillersService masterBillersService;

	public MasterBillersController(MasterBillersService masterBillersService) {
		super();
		this.masterBillersService = masterBillersService;
	}
	
	/*
	 * @GetMapping("/landing") public String getPage() { return "Welcome"; }
	 */
	
    @PostMapping("/addBiller")
    public MasterBillers addBiller(@RequestBody MasterBillers biller) {
    	
        return masterBillersService.saveBiller(biller);
    }

    @PostMapping("/addBillers")
    public List<MasterBillers> addBillers(@RequestBody List<MasterBillers> billers) {
        return masterBillersService.saveBillers(billers);
    }

    @GetMapping("/billers")
    public List<MasterBillers> findAllBillers() {
        return masterBillersService.getBillers();
    }

    @GetMapping("/billerById/{id}")
    public MasterBillers findBillerById(@PathVariable Long id) {
        return masterBillersService.getBillerById(id);
    }

	/*
	 * @GetMapping("/biller/{name}") public MasterBillers
	 * findBillerByName(@PathVariable String name) { return
	 * masterBillersService.getBillerByName(name); }
	 */

    @DeleteMapping("/deleteBiller/{id}")
    public String deleteBiller(@PathVariable Long id) {
        return masterBillersService.deleteBiller(id);
    }
	
	

}
