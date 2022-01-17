package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Gerant {
	@Id
	
	private Long idGerant;
	private String nom;
	private String prenom;
	
	
	@ManyToOne
	private Ferme ferme;


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public Ferme getFerme() {
		return ferme;
	}


	public void setFerme(Ferme ferme) {
		this.ferme = ferme;
	}


	@Override
	public String toString() {
		return "Gerant [idGerant=" + idGerant + ", nom=" + nom + ", prenom=" + prenom + "]";
	}


	public Gerant() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Gerant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	
	
}
