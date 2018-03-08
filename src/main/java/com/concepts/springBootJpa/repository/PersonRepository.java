package com.concepts.springBootJpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.concepts.springBootJpa.model.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
