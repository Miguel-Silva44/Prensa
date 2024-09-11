package com.siteSimples.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siteSimples.backend.model.EntityModel;

public abstract class ProductsServices<Entity extends EntityModel, Long> 
		implements IServices<Entity, Long> {
	
	
	abstract JpaRepository<Entity, Long> getRepository();

	@Override
	public Entity create(Entity entity) {
		return getRepository().save(entity);
	}

	@Override
	public List<Entity> getAll() {
		return getRepository().findAll();
	}

	@Override
	public Optional<Entity> getById(Long id) {
		return getRepository().findById(id);
	}

	@Override
	public void delete(Entity entity) {
		getRepository().delete(entity);
	}
}
