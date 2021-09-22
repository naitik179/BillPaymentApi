package com.example.BillPayment.Repo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.BillPayment.Model.Role;
import com.example.BillPayment.Model.Users;

@SpringBootTest
class UserRepositoryTest {

	@Autowired
    private UserRepository userrepositoru;
	
	Role roleManager = Role.builder().roleid(1L).rolename("manager").build();
	Role roleCustomer = Role.builder().roleid(2L).rolename("customer").build();

    @Test
    public void saveuser() {
 
    	
        Users user = Users.builder().linkedaccount("123456789").loginid("xyz77").password("12345").role(roleManager)
                .build();

        userrepositoru.save(user);
        
    }

}
