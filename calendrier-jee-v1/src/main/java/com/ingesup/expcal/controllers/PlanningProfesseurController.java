package com.ingesup.expcal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ingesup.expcal.entities.Professeur;
import com.ingesup.expcal.metier.ICalendrierPlanningProfesseurMetier;

@Controller
@RequestMapping(value="/planningProfesseur")
public class PlanningProfesseurController {

	@Autowired
	private ICalendrierPlanningProfesseurMetier professeurMetier;
	
	@RequestMapping(value="/pageProfesseur")
	public String displayProfesseur(Model model){
		model.addAttribute("professeur", new Professeur());
		model.addAttribute("professeur", professeurMetier.getAllProfesseurs());
		return "professeurs";
	}
}
