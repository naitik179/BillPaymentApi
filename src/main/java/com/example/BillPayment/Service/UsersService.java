package com.example.BillPayment.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BillPayment.Model.Users;
import com.example.BillPayment.Repo.UserRepository;
import com.example.BillPayment.Repo.RoleRepository;

@Service
public class UsersService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;

	public UsersService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	public List<Users> findByRole(Long roleId){
		return userRepository.findByRole(roleRepository.findById(roleId).get().getRoleid());
		
	}

	public Optional<Users> findbyID(Long id) {
		return userRepository.findById(id);
	}

	public Users addUser(Users user) {
		return userRepository.save(user);
	}

	public List<Users> getAllUsers() {
		return userRepository.findAll();
	}

	public void deleteUserById(Long userId) {
		userRepository.deleteById(userId);
		
	}

	public Users updateUser(Long userId, Users user) {
		Users userDb = userRepository.findById(userId).get();

        if(Objects.nonNull(user.getLoginid()) &&
        !"".equalsIgnoreCase(user.getLoginid())) {
        	userDb.setLoginid(user.getLoginid());
        }

        if(Objects.nonNull(user.getPassword()) &&
                !"".equalsIgnoreCase(user.getPassword())) {
        	userDb.setPassword(user.getPassword());
        }

        return userRepository.save(userDb);
		
	}

	public List<Users> findByLoginId(String loginId) {
		return userRepository.findByLoginid(loginId);
	}
	
	

}
