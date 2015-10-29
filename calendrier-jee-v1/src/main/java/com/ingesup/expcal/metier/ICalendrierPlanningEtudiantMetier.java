package com.ingesup.expcal.metier;

import java.util.List;

import com.ingesup.expcal.entities.Etudiant;

public interface ICalendrierPlanningEtudiantMetier extends ICalendrierPlanningProfesseurMetier {
	
	public Long addEtudiant(Etudiant etudiant);

	public List<Etudiant> getAllEtudiants();

	public Long updateEtudiant(Etudiant e);

	public void removeEtudiant(Long idEtudiant);

	public Etudiant getEtudiant(Long idEtudiant);

	public List<Etudiant> findEtudiantByMotCle(String motCle);

}
