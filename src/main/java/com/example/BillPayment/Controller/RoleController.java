package com.example.BillPayment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BillPayment.Model.Role;
import com.example.BillPayment.Service.RoleService;

@RestController
public class RoleController {

	
	@Autowired
	private RoleService roleservice;

	public RoleController(RoleService roleservice) {
		super();
		this.roleservice = roleservice;
	}
	
	@GetMapping("/roles")
	public List<Role> list() {
            return roleservice.getAllRoles();
    }
	
	
	
}
