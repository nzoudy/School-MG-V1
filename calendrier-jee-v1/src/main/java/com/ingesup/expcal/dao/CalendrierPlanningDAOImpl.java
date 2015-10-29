package com.ingesup.expcal.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ingesup.expcal.entities.Etudiant;
import com.ingesup.expcal.entities.Professeur;

public class CalendrierPlanningDAOImpl implements ICalendrierPlanningDAO {

	@PersistenceContext
	private EntityManager em; //declaration de la varaible entityManager
	
	
	public void addEtudiant(Etudiant etudiant) {
		em.persist(etudiant);
	}

	
	public List<Etudiant> getAllEtudiants() {
		 //HibernateQueryLanguage hql
		Query req=em.createQuery("select e from Etudiant e");
		
		return req.getResultList();
	}

	
	public void addProfesseur(Professeur professeur) {
		em.persist(professeur);
	}

	
	public List<Professeur> getAllProfesseurs() {
		Query req=em.createQuery("select p from Professeur p");
		return req.getResultList();
	}
	
	
}
