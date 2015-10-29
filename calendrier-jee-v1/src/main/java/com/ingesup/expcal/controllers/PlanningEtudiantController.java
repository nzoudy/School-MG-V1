package com.ingesup.expcal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ingesup.expcal.entities.Etudiant;
import com.ingesup.expcal.metier.ICalendrierPlanningEtudiantMetier;

@Controller
@RequestMapping(value="/planningEtudiant")
public class PlanningEtudiantController {
	
	@Autowired
	private ICalendrierPlanningEtudiantMetier etudiantMetier;
	
	@RequestMapping(value="/index")
	public String index(Model model){
		model.addAttribute("etudiant", new Etudiant());
		model.addAttribute("etudiants", etudiantMetier.getAllEtudiants());
		return "etudiants";
	}

}
