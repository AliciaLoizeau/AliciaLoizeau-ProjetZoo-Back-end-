package fr.adaming.projetZoo.service;

import java.util.List;

import fr.adaming.projetZoo.model.Tache;



public interface ITacheService {

	public void ajoutTache (Tache tache); 
	public Tache modifierTache (Tache newtache);
	public void supprimerTache (long idTache);
	public Tache afficherUneTache (long idTache);
	public List<Tache> afficherTousTaches();

}

