package com.example.BillPayment.Repo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.BillPayment.Model.Role;

@SpringBootTest
class RoleRepositoryTest {
	
	@Autowired
	private RoleRepository rolerepository;

	@Test
	void saverole() {
		Role roleManager = Role.builder().roleid(1L).rolename("manager").build();
		Role roleCustomer = Role.builder().roleid(2L).rolename("customer").build();
		rolerepository.save(roleManager);
		rolerepository.save(roleCustomer);
		
	}

}
