package com.application.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_MATCH")
public class Match implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "MATCH_ID")
	private String matchID;

	@Temporal(TemporalType.DATE)
	@Column(name = "MATCH_DATE")
	private Date dataMAtch = new Date();

	@ManyToOne
	@JoinColumn(name = "PERSON_ID1")
	private Combattant combattant1 = new Combattant();

	@ManyToOne
	@JoinColumn(name = "PERSON_ID2")
	private Combattant combattant2 = new Combattant();

	public Match() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMatchID() {
		return matchID;
	}

	public void setMatchID(String matchID) {
		this.matchID = matchID;
	}

	public Date getDataMAtch() {
		return dataMAtch;
	}

	public void setDataMAtch(Date dataMAtch) {
		this.dataMAtch = dataMAtch;
	}

	public Combattant getCombattant1() {
		return combattant1;
	}

	public void setCombattant1(Combattant combattant1) {
		this.combattant1 = combattant1;
	}

	public Combattant getCombattant2() {
		return combattant2;
	}

	public void setCombattant2(Combattant combattant2) {
		this.combattant2 = combattant2;
	}

}
