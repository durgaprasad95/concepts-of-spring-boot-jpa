package com.concepts.springBootJpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concepts.springBootJpa.model.Person;
import com.concepts.springBootJpa.repository.PersonRepository;

/**
 * Generally this comes when we have UI-side of this application.
 **/
@Service
public class CRUDServiceImpl implements CRUDService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	public void create(Person person) {
		personRepository.save(person);
	}

	@Override
	public void delete() {

	}

	@Override
	public void update() {

	}

	@Override
	public Person read(String firstName) {
		return personRepository.findByFirstName(firstName);
	}

}
