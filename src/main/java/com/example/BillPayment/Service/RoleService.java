package com.example.BillPayment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BillPayment.Model.Role;
import com.example.BillPayment.Repo.RoleRepository;

@Service
public class RoleService {

	@Autowired
	private RoleRepository rolerepository;

	public RoleService(RoleRepository rolerepository) {
		super();
		this.rolerepository = rolerepository;
	}
	

	public Role saverole(Role role) {
		return rolerepository.save(role);
	}

	public List<Role> getAllRoles() {
		return rolerepository.findAll();
	}
	
	
}
