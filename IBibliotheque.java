package com.supinfo.java.exerciceFinal;

public interface IBibliotheque {
	void afficherDocuments();
	Document document(int i);
	void ajouter(Document doc);
	boolean supprimer(Document doc);
	void afficherAuteurs();
}
