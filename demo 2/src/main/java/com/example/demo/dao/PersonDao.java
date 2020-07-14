package com.example.demo.dao;

import java.util.UUID;

import com.example.demo.model.Person;

//defines the operations allowed for contract for anyone wanting to implement interface
//use dependency injection to switch between implementations with one line of code

public interface PersonDao {
	
	//Insert person with given id into database
	int insertPerson(UUID id, Person person);
	
	//allows us to generate UUID ourselves for person without ID
	default int insertPerson(Person person) {
		UUID id = UUID.randomUUID();
		return insertPerson(id,person);
	}
		
	

}
