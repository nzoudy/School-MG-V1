package com.ingesup.expcal.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Professeur")
public class Professeur implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_professeur")
	private Long idProfesseur;
	private String professeurName;
	private String professeurSurname;
	private String email;
	private String telephone;
	private String securitySocialNumber;
	private String rib;
	private String titreDiplome;
	
	
	
	public Professeur(Long idProfesseur, String professeurName) {
		super();
		this.idProfesseur = idProfesseur;
		this.professeurName = professeurName;
	}
	public Long getIdProfesseur() {
		return idProfesseur;
	}
	public void setIdProfesseur(Long idProfesseur) {
		this.idProfesseur = idProfesseur;
	}
	public String getProfesseurName() {
		return professeurName;
	}
	public void setProfesseurName(String professeurName) {
		this.professeurName = professeurName;
	}
	public String getProfesseurSurname() {
		return professeurSurname;
	}
	public void setProfesseurSurname(String professeurSurname) {
		this.professeurSurname = professeurSurname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getSecuritySocialNumber() {
		return securitySocialNumber;
	}
	public void setSecuritySocialNumber(String securitySocialNumber) {
		this.securitySocialNumber = securitySocialNumber;
	}
	public String getRib() {
		return rib;
	}
	public void setRib(String rib) {
		this.rib = rib;
	}
	public String getTitreDiplome() {
		return titreDiplome;
	}
	public void setTitreDiplome(String titreDiplome) {
		this.titreDiplome = titreDiplome;
	}
	public Professeur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
