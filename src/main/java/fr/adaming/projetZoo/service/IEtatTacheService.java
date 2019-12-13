package fr.adaming.projetZoo.service;

import java.util.List;

import fr.adaming.projetZoo.model.EtatTache;

public interface IEtatTacheService {
	
	public void ajoutEtat (EtatTache etat); 
	public EtatTache modifierEtat (EtatTache newetat);
	public void supprimerEtat (long idEtat);
	public EtatTache afficherUnEtat (long idEtat);
	public List<EtatTache> afficherTousEtats();

}
