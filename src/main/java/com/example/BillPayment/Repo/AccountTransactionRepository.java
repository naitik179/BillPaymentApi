package com.example.BillPayment.Repo;

import java.util.List;
//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BillPayment.Model.AccountTransaction;
import com.example.BillPayment.Model.Accounts;

@Repository
public interface AccountTransactionRepository extends JpaRepository<AccountTransaction, Long>{


	List<AccountTransaction> findBySeqid(Accounts seqid);

}
