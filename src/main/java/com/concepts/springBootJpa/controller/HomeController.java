package com.concepts.springBootJpa.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.concepts.springBootJpa.model.Person;
import com.concepts.springBootJpa.service.CRUDService;

/**
 * To use backend code ,as the rest call from UI.
 * If you need to have this as rest path then use the folowing annotation
 * "@RepositoryRestResource"
 **/
@RestController
public class HomeController {

	@Autowired
	private CRUDService crudService;

	/**
	 * To test that application running at the given port.
	 * formed URL is "localhost:8080/home".
	 **/
	@RequestMapping(value = "/home", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	public String home() {
		return "Connected to the application";
	}

	/**
	 * To test that application make use of JPA and adds the Entity to the appropriate table in database.
	 * formed URL is "localhost:8080/add".
	 * Just create service is shown as example. Rest are similar to this.
	 * Database details are given in "application.properties" file.
	 **/
	@RequestMapping(value = "/add", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	public String add() throws ParseException {
		Person person = new Person();
		person.setId();
		person.setFirstName("Durga Prasad");
		person.setLastName("Sankaraganti");
		person.setNationality("India");
		person.setDateOfBirth("18-11-1995");
		person.setOccupation("Nothing");
		crudService.create(person);
		return "New Person's Data is added to the Database";
	}
}
