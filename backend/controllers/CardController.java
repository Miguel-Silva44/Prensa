package com.siteSimples.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siteSimples.backend.model.CreditCard;
import com.siteSimples.backend.service.CCardServices;
import com.siteSimples.backend.service.IServices;

@RestController
@RequestMapping("/api/creditCard")
@CrossOrigin(origins = "http://localhost:3000")
public class CardController extends CardControllers<CreditCard, Long> {

	@Autowired
	private CCardServices CardServices;
	
	@Override
	IServices<CreditCard, Long> getService() {
		return this.CardServices;
	}

	@Override
	public ResponseEntity<CreditCard> update(Long id, CreditCard entity) {
		return null;
	}
	
}