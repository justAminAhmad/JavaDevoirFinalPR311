package com.supinfo.java.exerciceFinal;

public abstract class Livre extends Document { 
	protected String auteur;
	protected int nbrPages;
	
	public Livre(int numEnreg, String titre, 
			String auteur, int nbrPages) 
	{
		super(numEnreg,titre);
		this.auteur = auteur;
		this.nbrPages = nbrPages;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getNbrPages() {
		return nbrPages;
	}

	public void setNbrPages(int nbrPages) {
		this.nbrPages = nbrPages;
	}
	
	public abstract String getTypeLivre();

	@Override
	public String toString() {
		return super.toString() +", auteur=" + auteur + ", nbrPages=" + nbrPages;
	}
	
}
