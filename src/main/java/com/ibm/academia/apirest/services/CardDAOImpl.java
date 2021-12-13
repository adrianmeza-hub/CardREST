package com.ibm.academia.apirest.services;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.apirest.entities.Card;
import com.ibm.academia.apirest.repositories.CardRepository;
@Service
public class CardDAOImpl extends GenericDAOImpl<Card, CardRepository>implements CardDAO
{

	public CardDAOImpl(CardRepository repository) 
	{
		super(repository);
	}

	@Override
	public Optional<Card> findById(Integer id) 
	{
		
		return repository.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Card> bringNameCard(String pasion, int edad, int sueldo) 
	{
		return repository.bringNameCard(pasion, edad, sueldo);
		//return repository.bringNameCard(pasion, edad, sueldo);
	}

}
