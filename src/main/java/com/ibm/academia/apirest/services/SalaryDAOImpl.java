package com.ibm.academia.apirest.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ibm.academia.apirest.entities.Salary;
import com.ibm.academia.apirest.repositories.SalaryRepository;
@Service
public class SalaryDAOImpl extends GenericDAOImpl<Salary,SalaryRepository> implements SalaryDAO {

	public SalaryDAOImpl(SalaryRepository repository) {
		super(repository);
		
	}

	@Override
	public Optional<Salary> findById(Integer id) {
		
		return repository.findById(id);
	}

}
