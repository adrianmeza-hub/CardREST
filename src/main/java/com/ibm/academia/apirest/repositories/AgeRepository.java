package com.ibm.academia.apirest.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.entities.Age;

@Repository
public interface AgeRepository extends CrudRepository<Age, Integer>{
	public Optional<Age> findById(Integer id);
}
