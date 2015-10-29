package com.ingesup.expcal.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Matiere")
public class Matiere implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_matiere")
	 private Long idMatiere;
	 private String nomMatiere;
	 private String descriptionMatiere;
	 private Date dureDuCours; 
	 private Date dateCreationMatiere;
	 private Date dateModificationMatiere;
	 @ManyToOne
	 @JoinColumn(name="idProfesseur")
	 private Professeur professeur;
	public Long getIdMatiere() {
		return idMatiere;
	}
	public void setIdMatiere(Long idMatiere) {
		this.idMatiere = idMatiere;
	}
	public String getNomMatiere() {
		return nomMatiere;
	}
	public void setNomMatiere(String nomMatiere) {
		this.nomMatiere = nomMatiere;
	}
	public String getDescriptionMatiere() {
		return descriptionMatiere;
	}
	public void setDescriptionMatiere(String descriptionMatiere) {
		this.descriptionMatiere = descriptionMatiere;
	}
	public Date getDureDuCours() {
		return dureDuCours;
	}
	public void setDureDuCours(Date dureDuCours) {
		this.dureDuCours = dureDuCours;
	}
	public Date getDateCreationMatiere() {
		return dateCreationMatiere;
	}
	public void setDateCreationMatiere(Date dateCreationMatiere) {
		this.dateCreationMatiere = dateCreationMatiere;
	}
	public Date getDateModificationMatiere() {
		return dateModificationMatiere;
	}
	public void setDateModificationMatiere(Date dateModificationMatiere) {
		this.dateModificationMatiere = dateModificationMatiere;
	}
	public Professeur getProfesseur() {
		return professeur;
	}
	public void setProfesseur(Professeur professeur) {
		this.professeur = professeur;
	}
	public Matiere() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Matiere(Long idMatiere, String nomMatiere) {
		super();
		this.idMatiere = idMatiere;
		this.nomMatiere = nomMatiere;
	}
	 
	 
	 
}
