package fr.adaming.projetZoo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import fr.adaming.projetZoo.model.Tache;
import fr.adaming.projetZoo.repository.ITacheRepository;
@Service
public class TacheService implements ITacheService {
@Autowired
ITacheRepository tacheRepo; 
	@Override
	public void ajoutTache(Tache tache) {
		tacheRepo.save(tache);
		
	}

	@Override
	public Tache modifierTache(Tache newtache) {
		return tacheRepo.save(newtache);
		 
	}

	@Override
	public void supprimerTache(long idTache) {
		tacheRepo.deleteById(idTache);
		
	}

	@Override
	public Tache afficherUneTache(long idTache) {
		Optional <Tache> tacheOptional = tacheRepo.findById(idTache);
		Tache tache = new Tache (); 
		if(tacheOptional.isPresent()) {
			tache = tacheOptional.get();
			return tache; 	
		}else {
			return tache ; 
		}
	}

	@Override
	public List<Tache> afficherTousTaches() {
		return tacheRepo.findAll(Sort.by("idTache"));
	}

}
