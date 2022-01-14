package com.inti.model;

public class Personne {
	private Long idPersonne;
	private String nomPersonne;
	
	public Personne() {
		// TODO Auto-generated constructor stub
	}

	public Personne(String nomPersonne) {
		this.nomPersonne = nomPersonne;
	}

	public Long getIdPersonne() {
		return idPersonne;
	}

	public void setIdPersonne(Long idPersonne) {
		this.idPersonne = idPersonne;
	}

	public String getNomPersonne() {
		return nomPersonne;
	}

	public void setNomPersonne(String nomPersonne) {
		this.nomPersonne = nomPersonne;
	}

	@Override
	public String toString() {
		return "Personne [idPersonne=" + idPersonne + ", nomPersonne=" + nomPersonne + "]";
	}
	
	

}
