package com.application.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.application.model.Stade;

public class DaoStade {

	private EntityManager entityManager;

	public DaoStade() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("boxe");
		entityManager = entityManagerFactory.createEntityManager();
	}

	public Stade save(Stade stade) {
		entityManager.getTransaction().begin();
		entityManager.persist(stade);
		entityManager.getTransaction().commit();
		return stade;
	}

	public Stade update(Stade stade) {
		entityManager.getTransaction().begin();
		entityManager.merge(stade);
		entityManager.getTransaction().commit();
		return stade;
	}

	public void remove(Stade stade) {
		entityManager.getTransaction().begin();
		entityManager.remove(stade);
		entityManager.getTransaction().commit();
	}

	public Stade findStade(String id) {
		return (Stade) entityManager.find(Stade.class, id);
	}

	public List<Stade> findAll() {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Stade> cq = cb.createQuery(Stade.class);
		Root<Stade> rootEntry = cq.from(Stade.class);
		CriteriaQuery<Stade> all = cq.select(rootEntry);
		TypedQuery<Stade> allQuery = entityManager.createQuery(all);
		return allQuery.getResultList();
	}
}
