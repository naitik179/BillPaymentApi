package com.example.BillPayment.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BillPayment.Model.Accounts;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long>{
	public List<Accounts> findByEmailid(String emailid);
	
	public List<Accounts> findByAccname(String accname);
}
