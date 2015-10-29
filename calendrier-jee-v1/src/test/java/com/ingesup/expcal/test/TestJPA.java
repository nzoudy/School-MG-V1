package com.ingesup.expcal.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ingesup.expcal.entities.Etudiant;
import com.ingesup.expcal.entities.Professeur;
import com.ingesup.expcal.metier.ICalendrierPlanningEtudiantMetier;
import com.ingesup.expcal.metier.ICalendrierPlanningProfesseurMetier;

public class TestJPA {
	
//	@Test
//	public void testEtudiant() {
//		try {
//			ClassPathXmlApplicationContext applicationContext;
//			applicationContext = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
//			ICalendrierPlanningEtudiantMetier metier = (ICalendrierPlanningEtudiantMetier) applicationContext
//					.getBean("metier");
//			List<Etudiant> list1 = metier.getAllEtudiants(); // vide
//			metier.addEtudiant(new Etudiant("Ariel"));
//			metier.addEtudiant(new Etudiant("Eric"));
//			List<Etudiant> list2 = metier.getAllEtudiants(); // 2
//
//			assertTrue(list1.size() + 2 == list2.size());
//
//		} catch (Exception e) {
//			assertTrue(e.getMessage(), false);
//		}
//	}
//
//	@Test
//	public void testProfesseur() {
//		try {
//			ClassPathXmlApplicationContext applicationContext;
//			applicationContext = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
//			ICalendrierPlanningProfesseurMetier metier = (ICalendrierPlanningProfesseurMetier) applicationContext
//					.getBean("metier");
//			List<Professeur> list1 = metier.getAllProfesseurs();
//			metier.addProfesseur(new Professeur("Couzic"));
//			metier.addProfesseur(new Professeur("leclerc"));
//			List<Professeur> list2 = metier.getAllProfesseurs();
//			assertTrue(list1.size() + 2 == list2.size());
//		} catch (Exception e) {
//			assertTrue(e.getMessage(), false);
//		}
//	}
//	
//	

}
