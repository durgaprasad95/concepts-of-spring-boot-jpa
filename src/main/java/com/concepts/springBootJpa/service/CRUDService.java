package com.concepts.springBootJpa.service;

import com.concepts.springBootJpa.model.Person;

public interface CRUDService {
	void create(Person person);

	void delete();

	void update();

	Person read();

}
