package com.siteSimples.backend.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siteSimples.backend.model.Users;
import com.siteSimples.backend.service.IServices;
import com.siteSimples.backend.service.UserServices;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController 
	extends AControllers<Users, Long> {

	@Autowired
	private UserServices userService;
	
	@Override
	IServices<Users, Long> getService() {
		return this.userService;
	}

	@PutMapping("/{id}")
	@Override
	public ResponseEntity<Users> update(Long id, Users user) {
		Optional<Users> optionalUser = (Optional<Users>) userService.getById(id);
		Users userDetails = user;
		if (optionalUser.isPresent()) {
			Users existingUser = optionalUser.get();
			existingUser.setName(userDetails.getName());
			existingUser.setAddresses(userDetails.getAddresses());
			existingUser.setEmail(userDetails.getEmail());
			existingUser.setPhone(userDetails.getPhone());
			Users updatedUser = userService.create(existingUser);
			return ResponseEntity.ok(updatedUser);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

}