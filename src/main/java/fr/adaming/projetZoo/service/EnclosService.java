package fr.adaming.projetZoo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.projetZoo.model.Enclos;
import fr.adaming.projetZoo.repository.IEnclosRepository;
@Service
public class EnclosService implements IEnclosService{
@Autowired 
IEnclosRepository enclosRepo; 

	@Override
	public void ajoutEnclos(Enclos enclos) {
		enclosRepo.save(enclos);
		
	}

	@Override
	public Enclos modifierEnclos(Enclos newEnclos) {
		return enclosRepo.save(newEnclos);
	}

	@Override
	public void supprimerEnclos(long idEnclos) {
		enclosRepo.deleteById(idEnclos);
		
	}

	@Override
	public Enclos afficherUnEnclos(long idEnclos) {
		return enclosRepo.findById(idEnclos).get();
	}

	@Override
	public List<Enclos> afficherTousEnclos() {
		
		return enclosRepo.findAll();
	}

}
