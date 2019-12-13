package fr.adaming.projetZoo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.projetZoo.model.Nourriture;
import fr.adaming.projetZoo.repository.INourritureRepository;
@Service
public class NourritureService implements INourritureService {
@Autowired
INourritureRepository nourritureRepo; 
	@Override
	public void ajoutNourriture(Nourriture nourriture) {
		nourritureRepo.save(nourriture);
		
	}

	@Override
	public Nourriture modifierNourriture(Nourriture newNourriture) {	
		return nourritureRepo.save(newNourriture);
	}

	@Override
	public void supprimerNourriture(long idNourriture) {
		nourritureRepo.deleteById(idNourriture);
	}

	@Override
	public Nourriture afficherNourriture(long idNourriture) {
		return nourritureRepo.findById(idNourriture).get();
	}

	@Override
	public List<Nourriture> afficherTousNourriture() {
		return nourritureRepo.findAll();
	}

}
