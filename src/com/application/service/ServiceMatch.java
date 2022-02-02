package com.application.service;

import java.util.List;

import com.application.dao.DaoMatch;
import com.application.model.Match;

public class ServiceMatch {

	private DaoMatch daoMatch = null;

	public ServiceMatch() {
		daoMatch = new DaoMatch();
	}

	public Match save(Match match) {
		return daoMatch.save(match);
	}

	public Match update(Match match) {
		return daoMatch.update(match);
	}

	public void remove(Match match) {
		daoMatch.remove(match);
	}

	public Match findMatch(String id) {
		return daoMatch.findMatch(id);
	}

	public List<Match> findMatchs() {
		return daoMatch.findMatchs();
	}

}
