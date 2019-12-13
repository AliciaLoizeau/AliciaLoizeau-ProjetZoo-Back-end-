package fr.adaming.projetZoo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.projetZoo.model.Secteur;
import fr.adaming.projetZoo.repository.ISecteurRepository;
@Service
public class SecteurService implements ISecteurService{
@Autowired
ISecteurRepository secteurRepo; 
	@Override
	public void ajoutSecteur(Secteur secteur) {
	secteurRepo.save(secteur);
	}

	@Override
	public Secteur modifierScteur(Secteur newSecteur) {
		return secteurRepo.save(newSecteur);
	}

	@Override
	public void supprimerSecteur(long idSecteur) {
		secteurRepo.deleteById(idSecteur);
		
	}

	@Override
	public Secteur afficherUnSecteur(long idSecteur) {
		return secteurRepo.findById(idSecteur).get();
	}

	@Override
	public List<Secteur> afficherTousSecteurs() {
		return secteurRepo.findAll();
	}

}
