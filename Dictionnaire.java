package com.supinfo.java.exerciceFinal;

public class Dictionnaire extends Document { 
	private String langue;
	
	public Dictionnaire(int numEnreg, String titre, String langue) 
	{
		super(numEnreg, titre);
		this.langue = langue;
	}
	
	public String getLangue() 
	{
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}
	

	@Override
	public String toString() {
		return super.toString() + ", langue=" + langue + "]";
	}

	@Override
	public String getType() {
		return "Ceci est un Dictionnaire";
	}
	
}
