package com.concepts.springBootJpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.concepts.springBootJpa.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

	Person findByFirstName(String firstName);

}
