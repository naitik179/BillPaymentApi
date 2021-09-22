package com.example.BillPayment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BillPayment.Repo.RoleRepository;

@Service
public class RoleService {

	@Autowired
	private RoleRepository rolerepository;

	public RoleService(RoleRepository rolerepository) {
		super();
		this.rolerepository = rolerepository;
	}
	
	
}
