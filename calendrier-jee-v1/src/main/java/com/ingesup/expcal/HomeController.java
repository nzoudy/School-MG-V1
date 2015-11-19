package com.ingesup.expcal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ingesup.expcal.metier.ICalendrierPlanningEtudiantMetier;

@Controller
public class HomeController {

	@Autowired
	private ICalendrierPlanningEtudiantMetier etudiantMetier; // not use for now
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "index";
	}
}
