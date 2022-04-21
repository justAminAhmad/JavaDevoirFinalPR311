package com.supinfo.java.exerciceFinal;

public abstract class Document {
	protected int numEnreg;
	private String titre;
	
	public Document(int NumEnreg, String titre)
	{
		this.numEnreg = NumEnreg;
	    this.titre = titre;
	}

	public int getNumEnreg() {
		return numEnreg;
	}

	public void setNumEnreg(int numEnreg) {
		this.numEnreg = numEnreg;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public abstract String getType();

	@Override
	public String toString() {
		return "[NumEnreg=" + numEnreg + ", titre=" + titre;
	}
}
