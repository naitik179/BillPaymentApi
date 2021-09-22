package com.example.BillPayment.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BillPayment.Model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
