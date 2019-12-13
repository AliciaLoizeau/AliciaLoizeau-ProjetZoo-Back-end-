package fr.adaming.projetZoo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.projetZoo.model.Animaux;
import fr.adaming.projetZoo.repository.IAnimauxRepository;
@Service
public class AnimauxService implements IAnimauxService {
@Autowired
IAnimauxRepository animauxRepo;
	@Override
	public void ajoutAnimal(Animaux animal) {
		animauxRepo.save(animal);
		
	}

	@Override
	public Animaux modifierAnimal(Animaux newAnimal) {
		return animauxRepo.save(newAnimal);
	}

	@Override
	public void supprimerAnimal(long idAnimal) {
		animauxRepo.deleteById(idAnimal);
		
	}

	@Override
	public Animaux afficherUnAnimal(long idAnimal) {
		return animauxRepo.findById(idAnimal).get();
		
	}

	@Override
	public List<Animaux> afficherTousAnimaux() {
		return animauxRepo.findAll();
	}

}
