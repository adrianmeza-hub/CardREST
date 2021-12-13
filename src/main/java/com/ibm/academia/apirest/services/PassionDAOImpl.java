package com.ibm.academia.apirest.services;

import java.util.Optional;

import com.ibm.academia.apirest.entities.Passion;
import com.ibm.academia.apirest.repositories.PassionRepository;

public class PassionDAOImpl extends GenericDAOImpl<Passion, PassionRepository> implements PassionDAO
{

	public PassionDAOImpl(PassionRepository repository) {
		super(repository);
		
	}

	@Override
	public Optional<Passion> findById(Integer id) {
		
		return repository.findById(id);
	}

}
