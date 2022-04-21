package com.supinfo.java.exerciceFinal;

public class TestDocuments {

	public static void main(String[] args) 
	{
		Dictionnaire dictionnaire1 = new Dictionnaire(1, "java", "Anglais");
		Revue revue1 = new Revue(3, " Gbagbo à Duékoué", 02, 2022);
		Manuel manuel1 = new Manuel(4, "PHP", "Mohamed Ba", 300, 5);
		Roman roman1 = new Roman(2, "Le Cid", "Jean Racine", 250, 2.0);
		
		IBibliotheque bib = new Bibliotheque(5);
		ILivrotheque liv = new Livrotheque(5);
		
		bib.ajouter(dictionnaire1);
		bib.ajouter(revue1);
		bib.ajouter(manuel1);
		bib.ajouter(roman1);
		
		bib.afficherDocuments();
		
		bib.supprimer(revue1);
		System.out.println();
		bib.afficherDocuments();
		System.out.println();
		bib.afficherAuteurs();
		System.out.println();
		
		liv.ajouter(dictionnaire1);
		liv.ajouter(revue1);
		liv.ajouter(manuel1);
		liv.ajouter(roman1);
		
		liv.afficherDocuments();
		
		liv.supprimer(roman1);
		System.out.println();
		liv.afficherDocuments();
		System.out.println();
		liv.afficherAuteurs();
		
		
	}
}
