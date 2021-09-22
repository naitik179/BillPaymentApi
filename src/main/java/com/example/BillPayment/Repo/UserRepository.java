package com.example.BillPayment.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BillPayment.Model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users , Long > {
	public List<Users> findByRole(Long roleId);

	public List<Users> findByLoginid(String loginid);
}
