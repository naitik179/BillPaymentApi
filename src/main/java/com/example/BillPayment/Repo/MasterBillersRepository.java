package com.example.BillPayment.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BillPayment.Model.MasterBillers;

@Repository
public interface MasterBillersRepository extends JpaRepository<MasterBillers, Long>{

	/* MasterBillers findByName(String name); */

}
