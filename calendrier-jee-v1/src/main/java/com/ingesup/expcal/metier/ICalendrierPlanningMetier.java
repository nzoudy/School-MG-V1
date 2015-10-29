package com.ingesup.expcal.metier;

import java.util.List;

import com.ingesup.expcal.entities.Etudiant;

public interface ICalendrierPlanningMetier {
	public void ajouterEtudiant(Etudiant e);
	public List<Etudiant> listToutLesEtudiants();
	
}
