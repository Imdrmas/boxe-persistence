package com.application.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_stade")
public class Stade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "STADE_ID")
	private String stadeID;

	@Column(name = "description")
	private String description;

	@Column(name = "nb_place")
	private int nbPlace;

	public Stade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStadeID() {
		return stadeID;
	}

	public void setStadeID(String stadeID) {
		this.stadeID = stadeID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNbPlace() {
		return nbPlace;
	}

	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}

}
