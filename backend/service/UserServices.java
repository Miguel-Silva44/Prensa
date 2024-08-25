package com.siteSimples.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.siteSimples.backend.model.User;
import com.siteSimples.backend.repository.UserRepository;

@Service
public class UserServices extends AServices<User, Long> {

	@Autowired
    protected UserRepository repository;

    @Override
    JpaRepository<User, Long> getRepository() {
        return this.repository;
    }

}
