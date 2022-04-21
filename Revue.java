package com.supinfo.java.exerciceFinal;

public class Revue extends Document
{
    private int mois;
    private int annee;
    
    public Revue(int numEnreg, String titre, 
    		int mois, int annee) 
    {
        super(numEnreg, titre);
        this.mois = mois;
        this.annee = annee;
    }

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	@Override
	public String toString() {
		return super.toString() +", mois=" + mois + ", annee=" + annee + "]";
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Ceci est une Revue";
	}

    

}
