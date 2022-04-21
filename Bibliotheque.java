package com.supinfo.java.exerciceFinal;

public class Bibliotheque implements IBibliotheque
{
	protected Document[] listDocs;    
	protected int capacite;     
	protected int nombre;
	    	
	public Bibliotheque(int capacite) 
	{
		this.capacite = capacite; 
		listDocs = new Document[capacite];
		nombre = 0;     
	}     
	    	
	public void afficherDocuments() 
	{
		for (int i=0; i<nombre; i++)
	    {
			System.out.println(listDocs[i]);
	    }
	}     
	
	public Document document(int i) 
	{  
		return listDocs[i];     
	}      
	    	
	public void ajouter(Document doc) 
	{ 
		listDocs[nombre++] = doc;	    
	}
	   
	
	public boolean supprimer(Document doc) 
	{ 
		for (int i = 0; i < nombre; i++) 
	    {         
			if (listDocs[i].equals(doc)) 
	    	{     
				for (int j = i + 1; j < nombre; j++)
				{
					listDocs[j - 1] = listDocs[j];
				}
				nombre--;
				return true;
	    	}     
	    }
	    	return false;    
	}
	    	
	public void afficherAuteurs() 
	{
		for (int i=0; i<nombre; i++)         
	    {
			if (listDocs[i] instanceof Livre)
			{
				System.out.println(((Livre)listDocs[i]).getAuteur());
			}
	    }
	}

}