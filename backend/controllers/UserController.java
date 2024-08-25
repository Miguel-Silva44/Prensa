package com.siteSimples.backend.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siteSimples.backend.model.User;
import com.siteSimples.backend.service.IServices;
import com.siteSimples.backend.service.UserServices;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController 
	extends AControllers<User, Long> {

	@Autowired
	private UserServices userService;
	
	@Override
	IServices<User, Long> getService() {
		return this.userService;
	}

	@PutMapping("/{id}")
	@Override
	public ResponseEntity<User> update(Long id, User user) {
		Optional<User> optionalUser = (Optional<User>) userService.getById(id);
		User userDetails = user;
		if (optionalUser.isPresent()) {
			User existingUser = optionalUser.get();
			existingUser.setName(userDetails.getName());
			existingUser.setAddresses(userDetails.getAddresses());
			existingUser.setEmail(userDetails.getEmail());
			existingUser.setPhone(userDetails.getPhone());
			User updatedUser = userService.create(existingUser);
			return ResponseEntity.ok(updatedUser);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

}