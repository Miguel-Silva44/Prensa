package com.siteSimples.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.siteSimples.backend.model.CreditCard;
import com.siteSimples.backend.repository.CreditCardRepository;

@Service
public  class CCardServices extends CCServices<CreditCard, Long> {

	@Autowired
    protected CreditCardRepository repository;

    @Override
    JpaRepository<CreditCard, Long> getRepository() {
        return this.repository;
    }

}