package com.supinfo.java.exerciceFinal;

public interface ILivrotheque extends IBibliotheque {
	void ajouter(Document doc);
	 Livre livre(int i);
	 void afficherAuteurs();
}
