package com.ingesup.expcal.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ingesup.expcal.entities.Etudiant;
import com.ingesup.expcal.entities.Formation;
import com.ingesup.expcal.entities.Matiere;
import com.ingesup.expcal.entities.Professeur;

public class CalendrierPlanningDAOImpl implements ICalendrierPlanningDAO {

	@PersistenceContext
	private EntityManager em; // declaration de la varaible entityManager

	@Override
	public Long addEtudiant(Etudiant etudiant) {
		if (etudiant != null) {
			em.persist(etudiant);
		} else {
			throw new RuntimeException("Veuillez renseigner tous les champs");
		}
		return etudiant.getIdEtudiant();
	}

	@Override
	public List<Etudiant> getAllEtudiants() {
		Query requete = em.createQuery("select e from Etudiant e");
		return requete.getResultList();
	}

	@Override
	public Long updateEtudiant(Etudiant e) {
		if (e != null)
			em.merge(e);
		else
			throw new RuntimeException("Veuillez renseigner tous les champs");
		return e.getIdEtudiant();
	}

	@Override
	public void removeEtudiant(Long idEtudiant) {
		Etudiant etudiant = em.find(Etudiant.class, idEtudiant );
		if(etudiant != null){
			em.remove(etudiant);
		}
		else
			throw new RuntimeException("Etudiant introuvable");
	}

	@Override
	public Etudiant getEtudiant(Long idEtudiant) {
		Etudiant etudiant = em.find(Etudiant.class, idEtudiant );
		if(etudiant != null){
			return em.find(Etudiant.class, idEtudiant );
		}
		else
			throw new RuntimeException("Etudiant introuvable");
	}

	@Override
	public List<Etudiant> findEtudiantByMotCle(String motCle) {
		Query requete = em.createQuery("select e from Etudiant e where nameEtudiant like :x");
		requete.setParameter("x", "%"+motCle+"%");	
		return requete.getResultList();
	}

	
	@Override
	public Long addProfesseur(Professeur professeur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Professeur> getAllProfesseurs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long updateProfesseur(Professeur e) {
		// TODO Auto-generated method stub
		return null;

	}

	@Override
	public void removeProfesseur(Long idProfesseur) {
		// TODO Auto-generated method stub

	}

	@Override
	public Professeur getProfesseur(Long idProfesseur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Professeur> findProfesseurByMotCle(String motCle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long addFormation(Formation formation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Formation> getAllFormations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long updateFormation(Formation e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeFormation(Long idFormation) {
		// TODO Auto-generated method stub

	}

	@Override
	public Formation getFormation(Long idFormation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Formation> findFormationByMotCle(String motCle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long addMatiere(Matiere matiere) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Matiere> getAllMatieres() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long updateMatiere(Matiere matiere) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeMatiere(Long idMatiere) {
		// TODO Auto-generated method stub

	}

	@Override
	public Matiere getMatiere(Long idMatiere) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Matiere> findMatiereByMotCle(String motCle) {
		// TODO Auto-generated method stub
		return null;
	}

}
