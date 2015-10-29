package com.ingesup.expcal.test;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

import com.ingesup.expcal.entities.Etudiant;
import com.ingesup.expcal.entities.Professeur;
import com.ingesup.expcal.metier.ICalendrierPlanningEtudiantMetier;
import com.ingesup.expcal.metier.ICalendrierPlanningProfesseurMetier;

public class NewTest {

	ClassPathXmlApplicationContext applicationContext;
	
	@Test
	public void BeforeTest(){
		applicationContext = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
	}
	
	@Test
	public void testEtudiant() {
		try {
			ICalendrierPlanningEtudiantMetier metier = (ICalendrierPlanningEtudiantMetier) applicationContext
					.getBean("metier");
			List<Etudiant> list1 = metier.getAllEtudiants(); // vide
			metier.addEtudiant(new Etudiant("Ariel"));
			metier.addEtudiant(new Etudiant("Eric"));
			List<Etudiant> list2 = metier.getAllEtudiants(); // 2

			assertTrue(list1.size() + 2 == list2.size());

		} catch (Exception e) {
			assertTrue(false, e.getMessage());
		}
	}

	@Test
	public void testProfesseur() {
		try {
			ICalendrierPlanningProfesseurMetier metier = (ICalendrierPlanningProfesseurMetier) applicationContext
					.getBean("metier");
			List<Professeur> list1 = metier.getAllProfesseurs();
			metier.addProfesseur(new Professeur("Couzic"));
			metier.addProfesseur(new Professeur("leclerc"));
			List<Professeur> list2 = metier.getAllProfesseurs();
			assertTrue(list1.size() + 2 == list2.size());
		} catch (Exception e) {
			assertTrue(false, e.getMessage());
		}
	}
	
	

}
