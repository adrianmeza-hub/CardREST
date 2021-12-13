package com.ibm.academia.apirest.services;

import java.util.Optional;

import com.ibm.academia.apirest.entities.Salary;

public interface SalaryDAO extends GenericDAO<Salary> {
	public Optional<Salary> findById(Integer id);

}
