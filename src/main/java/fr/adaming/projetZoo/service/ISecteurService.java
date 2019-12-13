package fr.adaming.projetZoo.service;

import java.util.List;

import fr.adaming.projetZoo.model.Secteur;

public interface ISecteurService {

	public void ajoutSecteur (Secteur secteur); 
	public Secteur modifierScteur (Secteur newSecteur);
	public void supprimerSecteur (long idSecteur);
	public Secteur afficherUnSecteur (long idSecteur);
	public List<Secteur> afficherTousSecteurs();

}
