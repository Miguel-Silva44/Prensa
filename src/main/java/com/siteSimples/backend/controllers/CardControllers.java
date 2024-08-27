package com.siteSimples.backend.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.siteSimples.backend.model.EntityModel;
import com.siteSimples.backend.service.IServices;

public abstract class CardControllers<E extends EntityModel, ID> implements Controllers<E, ID>{
	
	abstract IServices<E, ID> getService();
	
	@Override
	@PostMapping
	public ResponseEntity<E> create(E entity) {
		E savedEntity = getService().create(entity);
	    return ResponseEntity.ok(savedEntity);
	}

	@Override
	@GetMapping
	public ResponseEntity<List<E>> getAll() {
        List<E> entity = getService().getAll();
        return ResponseEntity.ok(entity);
	}

	@Override
	@GetMapping("/{id}")
	public ResponseEntity<E> getById(ID id) {
        Optional<E> optionalEntity = getService().getById(id);
        if (optionalEntity.isPresent()) {
            return ResponseEntity.ok(optionalEntity.get());
        } else {
            return ResponseEntity.notFound().build();
        }
	}

	
	public abstract ResponseEntity<E> update(ID id, E entity);

	@Override
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(ID id) {
        Optional<E> optionalUser = getService().getById(id);
        if (optionalUser.isPresent()) {
        	getService().delete(optionalUser.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
	}
    

}
