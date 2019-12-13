package fr.adaming.projetZoo.service;

import java.util.List;

import fr.adaming.projetZoo.model.Nourriture;

public interface INourritureService {

	public void ajoutNourriture (Nourriture nourriture); 
	public Nourriture modifierNourriture  (Nourriture newNourriture);
	public void supprimerNourriture (long idNourriture);
	public Nourriture afficherNourriture (long idNourriture);
	public List<Nourriture> afficherTousNourriture();

}
