package com.siteSimples.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.siteSimples.backend.model.Address;
import com.siteSimples.backend.repository.AddressRepository;

@Service
public class AddressServices extends AServices<Address, Long> {

	@Autowired
    protected AddressRepository repository;

    @Override
    JpaRepository<Address, Long> getRepository() {
        return this.repository;
    }

}