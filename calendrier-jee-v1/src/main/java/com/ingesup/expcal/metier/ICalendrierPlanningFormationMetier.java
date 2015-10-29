package com.ingesup.expcal.metier;

import java.util.List;

import com.ingesup.expcal.entities.Etudiant;
import com.ingesup.expcal.entities.Formation;

public interface ICalendrierPlanningFormationMetier {
	public Long addFormation(Formation formation);

	public List<Formation> getAllFormations();

	public Long updateFormation(Formation e);

	public void removeFormation(Long idFormation);

	public Formation getFormation(Long idFormation);

	public List<Formation> findFormationByMotCle(String motCle);
	
	
}
