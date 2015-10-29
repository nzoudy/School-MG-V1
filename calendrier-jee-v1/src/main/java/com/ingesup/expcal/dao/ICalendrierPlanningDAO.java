package com.ingesup.expcal.dao;

import java.util.List;

import com.ingesup.expcal.entities.Etudiant;
import com.ingesup.expcal.entities.Formation;
import com.ingesup.expcal.entities.Matiere;
import com.ingesup.expcal.entities.Professeur;

public interface ICalendrierPlanningDAO {

	// function for student
	public Long addEtudiant(Etudiant etudiant);

	public List<Etudiant> getAllEtudiants();

	public Long updateEtudiant(Etudiant e);

	public void removeEtudiant(Long idEtudiant);

	public Etudiant getEtudiant(Long idEtudiant);

	public List<Etudiant> findEtudiantByMotCle(String motCle);

	// function for professor
	public Long addProfesseur(Professeur professeur);

	public List<Professeur> getAllProfesseurs();

	public Long updateProfesseur(Professeur e);

	public void removeProfesseur(Long idProfesseur);

	public Professeur getProfesseur(Long idProfesseur);

	public List<Professeur> findProfesseurByMotCle(String motCle);

	// function formation
	public Long addFormation(Formation formation);

	public List<Formation> getAllFormations();

	public Long updateFormation(Formation e);

	public void removeFormation(Long idFormation);

	public Formation getFormation(Long idFormation);

	public List<Formation> findFormationByMotCle(String motCle);

	// function matieres
	public Long addMatiere(Matiere matiere);

	public List<Matiere> getAllMatieres();

	public Long updateMatiere(Matiere e);

	public void removeMatiere(Long idMatiere);

	public Matiere getMatiere(Long idMatiere);

	public List<Matiere> findMatiereByMotCle(String motCle);

}
