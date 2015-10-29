package com.ingesup.expcal.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ingesup.expcal.dao.ICalendrierPlanningDAO;
import com.ingesup.expcal.entities.Etudiant;

@Transactional
public class CalendrierPlanningMetierImpl implements ICalendrierPlanningMetier {
	
	private	ICalendrierPlanningDAO dao;
		
	public void setDao(ICalendrierPlanningDAO dao) {
		this.dao = dao;
	}


	public void ajouterEtudiant(Etudiant e) {
			dao.addEtudiant(e);	
	}

	
	public List<Etudiant> listToutLesEtudiants() {		
		return dao.getAllEtudiants();
	}
		
	
}
