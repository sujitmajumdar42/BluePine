package com.cipheric.bluepine.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cipheric.bluepine.entity.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, String>{
	
}
