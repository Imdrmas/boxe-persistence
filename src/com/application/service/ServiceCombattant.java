package com.application.service;

import java.util.List;

import com.application.dao.DaoCombattent;
import com.application.model.Combattant;

public class ServiceCombattant {

	private DaoCombattent daoCombattent = null;

	public ServiceCombattant() {
		daoCombattent = new DaoCombattent();
	}

	public Combattant save(Combattant combattant) {
		return daoCombattent.save(combattant);
	}

	public Combattant update(Combattant combattant) {
		return daoCombattent.update(combattant);
	}

	public void remove(Combattant combattant) {
		daoCombattent.remove(combattant);
	}

	public Combattant findCombattant(String id) {
		return daoCombattent.findMatch(id);
	}

	public List<Combattant> findCombattants() {
		return daoCombattent.findMatchs();
	}

}
