package com.supinfo.java.exerciceFinal;

public class Roman extends Livre{
	private double prixLitt;

	public Roman(int numEnreg, String titre, 
			String auteur, int nbrPages, 
			double prixLitt) 
	{
		super(numEnreg, titre, auteur, nbrPages);
        this.prixLitt = prixLitt;
    }
    
	public double getPrixLitt() 
	{
        return prixLitt;
    }
    
	public void setPrixLitt(double prixLitt) 
	{
        this.prixLitt = prixLitt;
    }

	@Override
	public String toString() {
		return super.toString() +", prixLitt=" + prixLitt + "]";
	}

	@Override
	public String getTypeLivre() {
		// TODO Auto-generated method stub
		return "Ceci est un Roman";
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "De même ! Ceci est un Livre";
	}
	
}
