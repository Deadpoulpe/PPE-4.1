package com.test.beans;

public class Utilisateur {

	private String    EMAIL;

    private String    NOM;

    private String    PRENOM;

    private String    MDP;

	public String getPRENOM() {
		return PRENOM;
	}

	public void setPRENOM(String pRENOM) {
		PRENOM = pRENOM;
	}

	public String getEmail() {
		return EMAIL;
	}

	public void setEmail(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getNom() {
		return NOM;
	}

	public void setNom(String nOM) {
		NOM = nOM;
	}

	public String getMotDePasse() {
		return MDP;
	}

	public void setMotDePasse(String mDP) {
		MDP = mDP;
	}

}