package com.siteSimples.backend.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.siteSimples.backend.model.EntityModel;

public interface Controllers<E extends EntityModel, ID> {

	ResponseEntity<E> create(E entity);

    ResponseEntity<List<E>> getAll();

    ResponseEntity<E> getById(ID id);
    
    ResponseEntity<E> update(ID id, E entity);
    
    ResponseEntity<Void> delete(ID id);
	
}
