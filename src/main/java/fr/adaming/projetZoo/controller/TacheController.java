package fr.adaming.projetZoo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.projetZoo.model.Tache;
import fr.adaming.projetZoo.service.ITacheService;



@RestController
@RequestMapping("tache")
@CrossOrigin("http://localhost:4200")
public class TacheController {
@Autowired
ITacheService tacheService ; 

	@GetMapping // Afficher tous les taches
	public List<Tache> afficherTaches() {
		return tacheService.afficherTousTaches();
	}

	// Afficher un tache par l'id @GetMapping("/{id}

	@GetMapping("/{idTache}")
	public Tache afficherUneTache(@PathVariable long idTache) {
		Tache tache = new Tache();
		tache = tacheService.afficherUneTache(idTache);
		return tache;

	}

	@PostMapping // ajouter un tache
	public void ajoutTache(@RequestBody Tache tachereq) {
		tacheService.ajoutTache(tachereq);
	}

	@DeleteMapping("/{idTache}") // supprimer un tache par l'id
	public boolean supprimerTache (@PathVariable long idTache) {
		try {
		tacheService.supprimerTache(idTache);
		}catch (Exception e ) {
			return false; 
		}
		return true; 
	}

	
	@PutMapping(value = "/{idTache}")	
	public void modfierTache(@PathVariable long idTache, @RequestBody Tache tachereq) {
		Tache tache = new Tache();
		tache = tacheService.afficherUneTache(idTache);
		tache.setLibelleTache(tachereq.getLibelleTache());
		tache.setEtatTache(tachereq.getEtatTache());
		tache.setDateTache(tachereq.getDateTache());
		tache.setDureeTache(tachereq.getDureeTache());
		tache.setStafferTache(tachereq.getStafferTache());
		tacheService.ajoutTache(tache);

	}
}
