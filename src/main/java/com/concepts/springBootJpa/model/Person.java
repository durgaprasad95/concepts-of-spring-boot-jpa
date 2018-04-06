package com.concepts.springBootJpa.model;

import java.text.ParseException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This is the class which is represented as records in table.
 **/
@Entity
@Table(name = "PERSON")
public class Person {

	@Id
	private long id;
	@Column(name = "FIRSTNAME")
	private String firstName;
	@Column(name = "LASTNAME")
	private String lastName;
	@Column(name = "OCCUPATION")
	private String occupation;
	@Column(name = "DOB")
	private String dateOfBirth;
	@Column(name = "COUNTRY")
	private String nationality;

	public long getId() {
		return id;
	}

	public void setId() {
		this.id = System.currentTimeMillis();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String date) throws ParseException {
		this.dateOfBirth = date;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		String result = "{ " + this.id + "/n" + this.firstName + "/n" + this.lastName + "/n" + this.dateOfBirth + "/n"
				+ this.nationality + "/n" + this.occupation + " }";
		return result;
	}
}
