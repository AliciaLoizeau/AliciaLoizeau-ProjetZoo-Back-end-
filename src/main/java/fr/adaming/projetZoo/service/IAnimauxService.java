package fr.adaming.projetZoo.service;

import java.util.List;

import fr.adaming.projetZoo.model.Animaux ;

public interface IAnimauxService {

	public void ajoutAnimal (Animaux animal); 
	public Animaux modifierAnimal  (Animaux newAnimal);
	public void supprimerAnimal (long idAnimal);
	public Animaux afficherUnAnimal (long idAnimal);
	public List<Animaux> afficherTousAnimaux();

	
}
