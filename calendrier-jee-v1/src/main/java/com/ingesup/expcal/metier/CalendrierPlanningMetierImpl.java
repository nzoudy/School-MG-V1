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
		return dao.findProfesseurByMotCle(motCle);
	}

	@Override
	public Long addMatiere(Matiere matiere) {
		return dao.addMatiere(matiere);
	}

	@Override
	public List<Matiere> getAllMatieres() {
		return dao.getAllMatieres();
	}

	@Override
	public Long updateMatiere(Matiere m) {
		return dao.updateMatiere(m);
	}

	@Override
	public void removeMatiere(Long idMatiere) {
		dao.removeMatiere(idMatiere);
	}

	@Override
	public Matiere getMatiere(Long idMatiere) {
		return dao.getMatiere(idMatiere);
	}

	@Override
	public List<Matiere> findMatiereByMotCle(String motCle) {
		return dao.findMatiereByMotCle(motCle);
	}

	@Override
	public Long addFormation(Formation formation) {
		return dao.addFormation(formation);
	}

	@Override
	public List<Formation> getAllFormations() {
		return dao.getAllFormations();
	}

	@Override
	public Long updateFormation(Formation f) {
		return dao.updateFormation(f);
	}

	@Override
	public void removeFormation(Long idFormation) {
		dao.removeFormation(idFormation);
	}

	@Override
	public Formation getFormation(Long idFormation) {
		return dao.getFormation(idFormation);
	}

	@Override
	public List<Formation> findFormationByMotCle(String motCle) {
		return dao.findFormationByMotCle(motCle);
	}

	@Override
	public Long addEtudiant(Etudiant etudiant) {
		return dao.addEtudiant(etudiant);
	}

	@Override
	public List<Etudiant> getAllEtudiants() {
		return dao.getAllEtudiants();
	}

	@Override
	public Long updateEtudiant(Etudiant e) {
		return dao.updateEtudiant(e);
	}

	@Override
	public void removeEtudiant(Long idEtudiant) {
		dao.removeEtudiant(idEtudiant);
	}

	@Override
	public Etudiant getEtudiant(Long idEtudiant) {
		return dao.getEtudiant(idEtudiant);
	}

	@Override
	public List<Etudiant> findEtudiantByMotCle(String motCle) {
		return dao.findEtudiantByMotCle(motCle);
	}
	
	public List<Etudiant> findAllEtudiantByFormation(Long idFormation){
		return dao.findAllEtudiantByFormation(idFormation);
	}
	
}
