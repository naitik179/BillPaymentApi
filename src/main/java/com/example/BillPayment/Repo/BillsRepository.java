package com.example.BillPayment.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BillPayment.Model.Bills;

@Repository
public interface BillsRepository  extends JpaRepository<Bills, Long>{

}
