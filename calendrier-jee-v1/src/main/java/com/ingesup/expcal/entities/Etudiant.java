package com.ingesup.expcal.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="Etudiant")
public class Etudiant implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//Genaration des clé primaire et auto-incrementation +1
	@Column(name="id_etudiant") //Fixe le nom de la column en base de donnée pour que cela soit different du nom dans la classe
	private Long idEtudiant;
	private String nomEtudiant;
	private String prenom;
	private Date dateNaissance;
	private String telephone;
	private String email ;
	private String nomEntreprise;
	private String numSecuriteSociale; 
	private Date dateCreationCompte;
	private Date dateDernierModification;
	private Long nbModification;
	@ManyToOne
	@JoinColumn(name="idFormation")
	private Formation formation;
	@OneToMany//(mappedBy="") //deffinit qu'un etuidant a plusieur matiere il map 
	private Collection<Matiere> matieres; //un etudiant a une collection(liste) des matieres 
	
	
	//Get et set
	public Long getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(Long idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public String getNomEtudiant() {
		return nomEtudiant;
	}
	public void setNomEtudiant(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
	public String getNumSecuriteSociale() {
		return numSecuriteSociale;
	}
	public void setNumSecuriteSociale(String numSecuriteSociale) {
		this.numSecuriteSociale = numSecuriteSociale;
	}
	public Date getDateCreationCompte() {
		return dateCreationCompte;
	}
	public void setDateCreationCompte(Date dateCreationCompte) {
		this.dateCreationCompte = dateCreationCompte;
	}
	public Date getDateDernierModification() {
		return dateDernierModification;
	}
	public void setDateDernierModification(Date dateDernierModification) {
		this.dateDernierModification = dateDernierModification;
	}
	public Long getNbModification() {
		return nbModification;
	}
	public void setNbModification(Long nbModification) {
		this.nbModification = nbModification;
	}
	public Formation getFormation() {
		return formation;
	}
	public void setFormation(Formation formation) {
		this.formation = formation;
	}
	public Collection<Matiere> getMatieres() {
		return matieres;
	}
	public void setMatieres(Collection<Matiere> matieres) {
		this.matieres = matieres;
	}
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// pour nos test
	public Etudiant(String nomEtudiant) {
		super();
		this.nomEtudiant = nomEtudiant;
	}
	
	
	
}
