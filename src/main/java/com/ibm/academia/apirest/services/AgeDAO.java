package com.ibm.academia.apirest.services;

import java.util.Optional;

import com.ibm.academia.apirest.entities.Age;

public interface AgeDAO extends GenericDAO<Age> {
	public Optional<Age> findById(Integer id);

}
