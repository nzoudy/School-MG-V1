package com.ingesup.expcal.metier;

import java.util.List;

import com.ingesup.expcal.entities.Matiere;

public interface ICalendrierPlanningMatiereMetier extends ICalendrierPlanningFormationMetier {
	
	public Long addMatiere(Matiere matiere);

	public List<Matiere> getAllMatieres();

	public Long updateMatiere(Matiere e);

	public void removeMatiere(Long idMatiere);

	public Matiere getMatiere(Long idMatiere);

	public List<Matiere> findMatiereByMotCle(String motCle);

}
