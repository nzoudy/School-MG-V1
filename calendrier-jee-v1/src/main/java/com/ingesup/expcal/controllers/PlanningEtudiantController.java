package com.ingesup.expcal.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.ingesup.expcal.entities.Etudiant;
import com.ingesup.expcal.metier.ICalendrierPlanningEtudiantMetier;

@Controller
@RequestMapping(value="/planningEtudiant")
public class PlanningEtudiantController implements HandlerExceptionResolver{
	
	@Autowired
	private ICalendrierPlanningEtudiantMetier etudiantMetier;
	
	
	@RequestMapping(value="/displayEtudiant" , method = RequestMethod.GET)
	public String index(Model model){
		model.addAttribute("etudiant", new Etudiant());
		model.addAttribute("etudiants", etudiantMetier.getAllEtudiants());
		return "etudiants";
	}
	
	@RequestMapping(value="/saveEtudiant")
	public String enregistrerEtudiant(@Valid Etudiant etudiant, Model model, BindingResult BindingResult){
		if(BindingResult.hasErrors()){
			model.addAttribute("etudiants", etudiantMetier.getAllEtudiants());
			return "etudiants";
		}
		etudiantMetier.addEtudiant(etudiant);
		model.addAttribute("etudiant", new Etudiant());
		model.addAttribute("etudiants", etudiantMetier.getAllEtudiants());
		return "etudiants";
	}
	
	@RequestMapping(value="/suppEtudiant")
	public String supprimerEtudiant(Long idEtudiant, Model model){
		etudiantMetier.removeEtudiant(idEtudiant);
		model.addAttribute("etudiant", new Etudiant());
		model.addAttribute("etudiants", etudiantMetier.getAllEtudiants());
		return "etudiants";
	}
	
	@RequestMapping(value="/editEtudiant")
	public String editerEtudiant(Long idEtudiant, Model model){
		Etudiant etudiant = etudiantMetier.getEtudiant(idEtudiant);
		model.addAttribute("etudiant", etudiant);
		model.addAttribute("etudiants", etudiantMetier.getAllEtudiants());
		return "etudiants";
	}

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object arg2,
			Exception ex) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("etudiant", new Etudiant());
		mv.addObject("etudiants", etudiantMetier.getAllEtudiants());
		mv.addObject("exception", ex.getMessage());
		mv.setViewName("etudiants");
		return mv;
	}
	
	
	
	
	
	
//	public ModelAndView resolveExceptionTest(HttpServletRequest request, HttpServletResponse response, Object arg2,
//			Exception ex) {
//		Map<Object, Object> model = new HashMap<Object, Object>();
//		model.put("errors", ex.getMessage());
//		model.put("form", new UploadedFile());
//		return new ModelAndView("formUpload", (Map)model);
//	}
	
	
	
	
}
