package fr.adaming.projetZoo.service;

import java.util.List;

import fr.adaming.projetZoo.model.Enclos;

public interface IEnclosService {
	public void ajoutEnclos (Enclos enclos); 
	public Enclos modifierEnclos (Enclos newEnclos);
	public void supprimerEnclos (long idEnclos);
	public Enclos afficherUnEnclos (long idEnclos);
	public List<Enclos> afficherTousEnclos();

	
}
