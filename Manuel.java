package com.supinfo.java.exerciceFinal;

public class Manuel extends Livre{
	private int niveau;
	
	public Manuel(int numEnreg, String titre, 
			String auteur, int nbrPages, int niveau)
	{
		super(numEnreg, titre, auteur, nbrPages);
		this.niveau = niveau;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return super.toString() +", niveau=" + niveau + "]";
	}

	@Override
	public String getTypeLivre() {
		// TODO Auto-generated method stub
		return "Ceci est un Manuel";
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "De même ! Ceci est un livre";
	}
	
	
}
