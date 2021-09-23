package com.example.BillPayment.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.BillPayment.Model.Users;
import com.example.BillPayment.Service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;

	@GetMapping()
	public List<Users> list() {
            return usersService.getAllUsers();
    }
	 
	
	@GetMapping("/login/{loginId}")
	public List<Users> getUserByLoginid(@PathVariable String loginId){
		return usersService.findByLoginId(loginId);
	}

	
	@GetMapping("/{id}")
	public Optional<Users> getuserbyid(@PathVariable Long id) {
		return usersService.findbyID(id);
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<Users> addUsers(@RequestBody Users user) {
		Users newuser =usersService.addUser(user);
		return new ResponseEntity<>(newuser , HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/{id}")
    public String deleteUsersById(@PathVariable("id") Long userId) {
        usersService.deleteUserById(userId);
        return "User deleted Successfully!!";
    }
	
	@PutMapping("/{id}")
    public Users updateUser(@PathVariable("id") Long userId,
                                       @RequestBody Users user) {
        return usersService.updateUser(userId,user);
    }
	
}
