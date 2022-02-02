package com.application.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.application.model.Match;

public class DaoMatch {

	protected EntityManager entityManager = null;

	public DaoMatch() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("boxe");
		entityManager = entityManagerFactory.createEntityManager();
	}

	public Match save(Match match) {
		entityManager.getTransaction().begin();
		entityManager.persist(match);
		entityManager.getTransaction().commit();
		return match;
	}

	public Match update(Match match) {
		entityManager.getTransaction().begin();
		entityManager.merge(match);
		entityManager.getTransaction().commit();
		return match;
	}

	public void remove(Match match) {
		entityManager.getTransaction().begin();
		entityManager.remove(match);
		entityManager.getTransaction().commit();
	}

	public Match findMatch(String id) {
		return (Match) entityManager.find(Match.class, id);
	}

	public List<Match> findMatchs() {
		String queryString = "select o from Match o";
		return entityManager.createQuery(queryString).getResultList();
	}

}
