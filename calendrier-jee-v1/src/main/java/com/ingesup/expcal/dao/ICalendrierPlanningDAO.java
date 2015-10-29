package com.ingesup.expcal.dao;

import java.util.List;

import com.ingesup.expcal.entities.Etudiant;
import com.ingesup.expcal.entities.Professeur;

public interface ICalendrierPlanningDAO {
	
	public void addEtudiant(Etudiant etudiant);
	public List<Etudiant> getAllEtudiants();
	
	public void addProfesseur(Professeur professeur);
	public List<Professeur> getAllProfesseurs();
	
	
}
