package com.ingesup.expcal.metier;

import java.util.List;

import com.ingesup.expcal.entities.Professeur;

public interface ICalendrierPlanningProfesseurMetier extends ICalendrierPlanningMatiereMetier {

	public Long addProfesseur(Professeur professeur);

	public List<Professeur> getAllProfesseurs();

	public Long updateProfesseur(Professeur e);

	public void removeProfesseur(Long idProfesseur);

	public Professeur getProfesseur(Long idProfesseur);

	public List<Professeur> findProfesseurByMotCle(String motCle);
}
