package com.siteSimples.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.siteSimples.backend.model.CreditCard;

@Repository
public interface CreditCardRepository  extends JpaRepository<CreditCard, Long>{

}
