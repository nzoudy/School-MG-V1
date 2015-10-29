package com.ingesup.expcal.test;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ingesup.expcal.entities.Etudiant;
import com.ingesup.expcal.metier.ICalendrierPlanningMetier;

public class NewTest {
  @Test
  public void f() {
	  
 try {	
		  
		  ClassPathXmlApplicationContext applicationContext = 
				  new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		
		  ICalendrierPlanningMetier metier = (ICalendrierPlanningMetier) applicationContext.getBean("metier");
		  
		  List<Etudiant> list1 = metier.listToutLesEtudiants(); //vide
		  metier.ajouterEtudiant(new Etudiant("Ariel"));
		  metier.ajouterEtudiant(new Etudiant("Eric"));
		  List<Etudiant> list2 = metier.listToutLesEtudiants(); //2

		  assertTrue(list1.size()+2  == list2.size());
		  
		
	} catch (Exception e) {
		assertTrue(false, e.getMessage());
		
	}
	  
	  
  }
  
}
