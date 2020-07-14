package com.example.demo.dao;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;

import java.util.*;

//instantiate class
@Repository("testDao")
public class TestPersonDataAccessService implements PersonDao {
	
	private static List<Person> DB = new ArrayList<>();

	@Override
	//adds person to database
	public int insertPerson(UUID id, Person person) {
		DB.add(new Person(id, person.getName()));
		return 1;
	}

}
