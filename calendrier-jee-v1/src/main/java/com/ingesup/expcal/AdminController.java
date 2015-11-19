package com.ingesup.expcal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ingesup.expcal.entities.Etudiant;
import com.ingesup.expcal.metier.ICalendrierPlanningEtudiantMetier;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private ICalendrierPlanningEtudiantMetier etudiantMetier;
	
	@RequestMapping(value = "/etudiants", method = RequestMethod.GET)
	public String privatePage(Model model) {
		model.addAttribute("etudiant", new Etudiant());
		model.addAttribute("etudiants", etudiantMetier.getAllEtudiants());
		return "admin";
	}
	
	@RequestMapping(value="/saveEtudiant")
	public String enregistrerEtudiant(@Valid Etudiant etudiant, Model model, BindingResult BindingResult){
		if(BindingResult.hasErrors()){
			model.addAttribute("etudiants", etudiantMetier.getAllEtudiants());
			return "admin";
		}
		etudiantMetier.addEtudiant(etudiant);
		model.addAttribute("etudiant", new Etudiant());
		model.addAttribute("etudiants", etudiantMetier.getAllEtudiants());
		return "admin";
	}
	
	@RequestMapping(value="/suppEtudiant")
	public String supprimerEtudiant(Long idEtudiant, Model model){
		etudiantMetier.removeEtudiant(idEtudiant);
		model.addAttribute("etudiant", new Etudiant());
		model.addAttribute("etudiants", etudiantMetier.getAllEtudiants());
		return "admin";
	}
	
	@RequestMapping(value="/editEtudiant")
	public String editerEtudiant(Long idEtudiant, Model model){
		Etudiant etudiant = etudiantMetier.getEtudiant(idEtudiant);
		model.addAttribute("etudiant", etudiant);
		model.addAttribute("etudiants", etudiantMetier.getAllEtudiants());
		return "admin";
	}
	
	
}
