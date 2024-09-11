package com.siteSimples.backend.repository;

import java.util.List;
import java.util.Optional;

public interface IRepository<Entity, ID> {
	

	Entity save(Entity entity);

	List<Entity> findAll();

	Optional<Entity> findById(ID id);

	void delete(Entity entity);


}
