package com.application.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.application.model.Combattant;

public class DaoCombattent {

	protected EntityManager entityManager = null;

	public DaoCombattent() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("boxe");
		entityManager = entityManagerFactory.createEntityManager();
	}

	public Combattant save(Combattant combattant) {
		entityManager.getTransaction().begin();
		entityManager.persist(combattant);
		entityManager.getTransaction().commit();
		return combattant;
	}

	public Combattant update(Combattant combattant) {
		entityManager.getTransaction().begin();
		entityManager.merge(combattant);
		entityManager.getTransaction().commit();
		return combattant;
	}

	public void remove(Combattant combattant) {
		entityManager.getTransaction().begin();
		entityManager.remove(combattant);
		entityManager.getTransaction().commit();
	}

	public Combattant findMatch(String id) {
		return (Combattant) entityManager.find(Combattant.class, id);
	}

	public List<Combattant> findMatchs() {
		String queryString = "select o from Combattant o";
		return entityManager.createQuery(queryString).getResultList();
	}

}
