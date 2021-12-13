package com.ibm.academia.apirest.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.entities.Salary;

@Repository
public interface SalaryRepository extends CrudRepository<Salary, Integer>{
	public Optional<Salary> findById(Integer id);

}
