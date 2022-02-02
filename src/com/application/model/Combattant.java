package com.application.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_COMATTANT")
public class Combattant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "PERSON_ID")
	private String personID;

	@Column(name = "LASTNAME")
	private String lastName;

	@Enumerated(EnumType.STRING)
	@Column(name = "GENRE")
	private Gender gendre;

	public Combattant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPersonID() {
		return personID;
	}

	public void setPersonID(String personID) {
		this.personID = personID;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGendre() {
		return gendre;
	}

	public void setGendre(Gender gendre) {
		this.gendre = gendre;
	}

}
