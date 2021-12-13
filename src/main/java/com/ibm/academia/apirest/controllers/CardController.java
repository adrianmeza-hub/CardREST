package com.ibm.academia.apirest.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.academia.apirest.entities.Card;
import com.ibm.academia.apirest.exceptions.NotFoundException;
import com.ibm.academia.apirest.services.CardDAO;

@RestController
@RequestMapping("/tarjetaController")
public class CardController {
	@Autowired
	private CardDAO cardDao;
	
	@GetMapping("/{pasion}/{edad}/{salario}")
	public Card  findCard(@PathVariable String pasion, @PathVariable int edad, @PathVariable int salario){
		Optional<Card> card = cardDao.bringNameCard(pasion,edad,salario);
		
		if (pasion.isEmpty())
		throw new NotFoundException(String.format("There is no such passion", pasion));
		else if(edad <18)
			throw new NotFoundException(String.format("You are not age", edad));
		else if(edad >80)
			throw new NotFoundException(String.format("Age must be less than 80 years old ", edad));
		else if(salario <7000)
		    throw new NotFoundException(String.format("The salary must be greater than $70000 ", salario));
		else if(salario >100000)
		    throw new NotFoundException(String.format("The salary must be less than $100000 ", salario));
	  
			  
	  return card.get();
	 }
	
}
