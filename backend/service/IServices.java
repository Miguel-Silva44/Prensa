package com.siteSimples.backend.service;

import java.util.List;
import java.util.Optional;

import com.siteSimples.backend.model.EntityModel;

public interface IServices<T extends EntityModel, ID> {
	
	T create(T entity);

	List<T> getAll();
	
	Optional<T> getById(ID id);

	void delete(T entity);

}
