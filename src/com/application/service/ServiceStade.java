package com.application.service;

import java.util.List;

import com.application.dao.DaoStade;
import com.application.model.Stade;

public class ServiceStade {

	private DaoStade daoStade = null;

	public ServiceStade() {
		daoStade = new DaoStade();
	}

	public Stade save(Stade stade) {
		return daoStade.save(stade);
	}

	public Stade update(Stade stade) {
		return daoStade.update(stade);
	}

	public void remove(Stade stade) {
		daoStade.remove(stade);
	}

	public Stade find(String id) {
		return daoStade.findStade(id);
	}

	public List<Stade> findAllStades() {
		return daoStade.findAll();
	}

}
