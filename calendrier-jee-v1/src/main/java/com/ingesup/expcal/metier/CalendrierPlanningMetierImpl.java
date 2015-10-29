package com.ingesup.expcal.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ingesup.expcal.dao.ICalendrierPlanningDAO;
import com.ingesup.expcal.entities.Etudiant;
import com.ingesup.expcal.entities.Formation;
import com.ingesup.expcal.entities.Matiere;
import com.ingesup.expcal.entities.Professeur;

@Transactional
public class CalendrierPlanningMetierImpl implements ICalendrierPlanningEtudiantMetier {
	
	private	ICalendrierPlanningDAO dao;
	
	public void setDao(ICalendrierPlanningDAO dao) {
		this.dao = dao;
	}

	@Override
	public Long addProfesseur(Professeur professeur) {
		return dao.addProfesseur(professeur);
	}

	@Override
	public List<Professeur> getAllProfesseurs() {
		return dao.getAllProfesseurs();
	}

	@Override
	public Long updateProfesseur(Professeur e) {
		return dao.updateProfesseur(e);
	}

	@Override
	public void removeProfesseur(Long idProfesseur) {
	dao.removeProfesseur(idProfesseur);		
	}

	@Override
	public Professeur getProfesseur(Long idProfesseur) {
		return dao.getProfesseur(idProfesseur);
	}

	@Override
	public List<Professeur> findProfesseurByMotCle(String motCle) {
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
	public Long updateMatiere(Matiere e) {
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
	public Long addEtudiant(Etudiant etudiant) {
		
		return dao.addEtudiant(etudiant);
	}

	@Override
	public List<Etudiant> getAllEtudiants() {
		// TODO Auto-generated method stub
		return dao.getAllEtudiants();
	}

	@Override
	public Long updateEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		return dao.updateEtudiant(e);
	}

	@Override
	public void removeEtudiant(Long idEtudiant) {
		dao.removeEtudiant(idEtudiant);
		
	}

	@Override
	public Etudiant getEtudiant(Long idEtudiant) {
		// TODO Auto-generated method stub
		return dao.getEtudiant(idEtudiant);
	}

	@Override
	public List<Etudiant> findEtudiantByMotCle(String motCle) {
		// TODO Auto-generated method stub
		return dao.findEtudiantByMotCle(motCle);
	}
	
	
}
