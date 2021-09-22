package com.example.BillPayment.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BillPayment.Model.RegisteredBillers;

@Repository
public interface RegisteredBillersRepository extends JpaRepository<RegisteredBillers, Long>{

}
