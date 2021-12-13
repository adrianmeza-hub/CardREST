package com.ibm.academia.apirest.services;

import java.util.Optional;

import com.ibm.academia.apirest.entities.Age;
import com.ibm.academia.apirest.repositories.AgeRepository;

public class AgeDAOImpl extends GenericDAOImpl<Age, AgeRepository> implements AgeDAO{

	public AgeDAOImpl(AgeRepository repository) {
		super(repository);
	}

	@Override
	public Optional<Age> findById(Integer id) {
		
		return repository.findById(id);
	}

}
