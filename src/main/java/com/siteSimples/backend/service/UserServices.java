package com.siteSimples.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.siteSimples.backend.model.Users;
import com.siteSimples.backend.repository.UserRepository;

@Service
public class UserServices extends AServices<Users, Long> {

	@Autowired
    protected UserRepository repository;

    @Override
    JpaRepository<Users, Long> getRepository() {
        return this.repository;
    }

}
