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
	public void updateEtudiant(Long idEtudiant) {
		if (idEtudiant != null){
			Etudiant etudiant = em.find(Etudiant.class, idEtudiant);
			em.merge(etudiant);
		}
		else
			throw new RuntimeException("Veuillez renseigner tous les champs");
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
		if(idEtudiant != null){
			return em.find(Etudiant.class, idEtudiant );
		}
		else
			throw new RuntimeException("Etudiant introuvable");
	}

	@Override
	public List<Etudiant> findEtudiantByMotCle(String motCle) {
		Query requete = em.createQuery("select e from Etudiant e where e.nomEtudiant like :x or e.email like :x");
		requete.setParameter("x", "%"+motCle+"%");	
		return requete.getResultList();
	}

	
	@Override
	public Long addProfesseur(Professeur professeur) {
		if (professeur != null) {
			em.persist(professeur);
		} else {
			throw new RuntimeException("Veuillez renseigner tous les champs du prof");
		}
		return professeur.getIdProfesseur();
	}

	@Override
	public List<Professeur> getAllProfesseurs() {
		Query requete = em.createQuery("select p from Professeur p");
		return requete.getResultList();
	}

	@Override
	public Long updateProfesseur(Professeur e) {
		em.merge(e);
		return e.getIdProfesseur();
	}

	@Override
	public void removeProfesseur(Long idProfesseur) {
		Professeur prof = em.find(Professeur.class, idProfesseur);
		em.remove(prof);
	}

	@Override
	public Professeur getProfesseur(Long idProfesseur) {
		if(idProfesseur != null){
			return em.find(Professeur.class, idProfesseur );
		}
		else
			throw new RuntimeException("Professeur introuvable");
	}

	@Override
	public List<Professeur> findProfesseurByMotCle(String motCle) {
		Query requete = em.createQuery("select p from Professeur p where p.professeurName like :x or p.email like :x");
		requete.setParameter("x", "%"+motCle+"%");	
		return requete.getResultList();
	}

	@Override
	public Long addFormation(Formation formation) {
		if (formation != null) {
			em.persist(formation);
		} else {
			throw new RuntimeException("Veuillez renseigner tous les champs");
		}
		return formation.getIdFormation();
	}

	@Override
	public List<Formation> getAllFormations() {
		Query requete = em.createQuery("select f from Formation f");
		return requete.getResultList();
	}

	@Override
	public Long updateFormation(Formation f) {
		em.merge(f);
		return f.getIdFormation();
	}

	@Override
	public void removeFormation(Long idFormation) {
		em.remove(idFormation);

	}

	@Override
	public Formation getFormation(Long idFormation) {
		return em.find(Formation.class, idFormation);
	}

	@Override
	public List<Formation> findFormationByMotCle(String motCle) {
		Query requete = em.createQuery("select f from Formation f where f.nomFormation like :x or f.degre like :x");
		requete.setParameter("x", "%"+motCle+"%");	
		return requete.getResultList();
	}

	@Override
	public Long addMatiere(Matiere matiere) {
		em.persist(matiere);
		return matiere.getIdMatiere();
	}

	@Override
	public List<Matiere> getAllMatieres() {
		Query requete = em.createQuery("select m from Matiere m");	
		return requete.getResultList();
	}

	@Override
	public Long updateMatiere(Matiere matiere) {
		em.merge(matiere);
		return matiere.getIdMatiere();
	}

	@Override
	public void removeMatiere(Long idMatiere) {
		Matiere matiere = em.find(Matiere.class, idMatiere);
		em.remove(matiere);
	}

	@Override
	public Matiere getMatiere(Long idMatiere) {
		return em.find(Matiere.class, idMatiere);
	}

	@Override
	public List<Matiere> findMatiereByMotCle(String motCle) {
		Query requete = em.createQuery("select m from Matiere m where m.nomMatiere like :x or m.descriptionMatiere like :x");
		requete.setParameter("x", "%"+motCle+"%");	
		return requete.getResultList();
	}
	
	@Override
	public List<Etudiant> findAllEtudiantByFormation(Long idFormation){
		
		Query req = em.createQuery("select e from Etudiant e where e.formation.idEtudiant =:x");
		req.setParameter("x", idFormation);
		return req.getResultList();
	}
}
