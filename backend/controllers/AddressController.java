package com.siteSimples.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siteSimples.backend.model.Address;
import com.siteSimples.backend.service.AddressServices;
import com.siteSimples.backend.service.IServices;

@RestController
@RequestMapping("/api/address")
@CrossOrigin(origins = "http://localhost:3000")
public class AddressController extends AControllers<Address, Long> {

	@Autowired
	private AddressServices addressServices;
	
	@Override
	IServices<Address, Long> getService() {
		return this.addressServices;
	}

	@Override
	public ResponseEntity<Address> update(Long id, Address entity) {
		return null;
	}
	
}