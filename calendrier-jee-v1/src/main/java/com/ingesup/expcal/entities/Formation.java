package com.ingesup.expcal.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Formation")
public class Formation implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//Genaration des clé primaire et auto-incrementation +1
	@Column(name="id_formation") //Fixe le nom de la column en base de donnée pour que cela soit different du nom dans la classe
    private Long idFormation;
	private String nomFormation;
	private String descriptionFormation;
	private Date dureeEtude;
	private Degre degre;
	@OneToMany
	private Collection<Matiere> matieres; // une formation posséde plusieur matiere
	
	//Get et set
	public Long getIdFormation() {
		return idFormation;
	}
	public void setIdFormation(Long idFormation) {
		this.idFormation = idFormation;
	}
	public String getNomFormation() {
		return nomFormation;
	}
	public void setNomFormation(String nomFormation) {
		this.nomFormation = nomFormation;
	}
	public String getDescriptionFormation() {
		return descriptionFormation;
	}
	public void setDescriptionFormation(String descriptionFormation) {
		this.descriptionFormation = descriptionFormation;
	}
	public Date getDureeEtude() {
		return dureeEtude;
	}
	public void setDureeEtude(Date dureeEtude) {
		this.dureeEtude = dureeEtude;
	}
	public Degre getDegre() {
		return degre;
	}
	public void setDegre(Degre degre) {
		this.degre = degre;
	}
	public Collection<Matiere> getMatieres() {
		return matieres;
	}
	public void setMatieres(Collection<Matiere> matieres) {
		this.matieres = matieres;
	}
	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Formation(Long idFormation, String nomFormation) {
		super();
		this.idFormation = idFormation;
		this.nomFormation = nomFormation;
	}

	
}
