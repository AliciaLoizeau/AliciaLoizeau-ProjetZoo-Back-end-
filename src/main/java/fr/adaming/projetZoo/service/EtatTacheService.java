package fr.adaming.projetZoo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.projetZoo.model.EtatTache;
import fr.adaming.projetZoo.repository.IEtatRepository;

@Service
public class EtatTacheService implements IEtatTacheService {
	@Autowired
	IEtatRepository etatRepo;

	@Override
	public void ajoutEtat(EtatTache etat) {
		etatRepo.save(etat);

	}

	@Override
	public EtatTache modifierEtat(EtatTache newetat) {
		return etatRepo.save(newetat);
	}

	@Override
	public void supprimerEtat(long idEtat) {
		etatRepo.deleteById(idEtat);

	}

	@Override
	public EtatTache afficherUnEtat(long idEtat) {
		EtatTache etatmodif = new EtatTache();
		etatmodif = etatRepo.getOne(idEtat);
		return etatmodif;
	}

	@Override
	public List<EtatTache> afficherTousEtats() {
		return etatRepo.findAll();
	}

}
