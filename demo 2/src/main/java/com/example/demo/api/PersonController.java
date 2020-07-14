package com.example.demo.api;

import com.example.demo.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;

@RestController
public class PersonController {

		private final PersonService personService;
		
		@Autowired
		public PersonController(PersonService personService) {
			this.personService = personService;
		}
		
		//method will serve as post request
		//post - add/submit resource to server
		@PostMapping
		public void addPerson(Person person) {
			personService.addPerson(person);
		}
} 
