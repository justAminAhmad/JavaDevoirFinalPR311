package com.supinfo.java.exerciceFinal;

public class Livrotheque extends Bibliotheque implements ILivrotheque
{
	public Livrotheque(int capacite)
	{
		super(capacite);
	}
	
	public void ajouter(Document doc)
	{
		if (doc instanceof Livre)
			super.ajouter(doc);
		else
		{
			System.out.println("Erreur ! Ce document n'est pas un livre.");
		}
	}
	
	public Livre livre(int i) 
	{
		return(Livre)listDocs[i];
	}
	
	public void afficherAuteurs()
	{
		for (int i=0; i<nombre; i++)
		{
			System.out.println(((Livre)listDocs[i]).getAuteur());
		}
	} 
} 
