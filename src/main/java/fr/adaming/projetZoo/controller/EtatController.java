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
import fr.adaming.projetZoo.model.EtatTache;
import fr.adaming.projetZoo.service.IEtatTacheService;

@RestController
@RequestMapping("etat")
@CrossOrigin("http://localhost:4200")
public class EtatController {
	@Autowired
	IEtatTacheService etatService; 
	
	@GetMapping // Afficher tous les etats
	public List<EtatTache> afficherEtats() {
		return etatService.afficherTousEtats();
	}

	// Afficher un etat par l'id @GetMapping("/{id}

	@GetMapping("/{idEtat}")
	public EtatTache afficherUnEtat(@PathVariable long idEtat) {
		EtatTache etat = new EtatTache();
		etat = etatService.afficherUnEtat(idEtat);
		return etat;

	}

	@PostMapping // ajouter un etat
	public void ajoutEtat(@RequestBody EtatTache etatreq) {
		etatService.modifierEtat(etatreq);
	}

	@DeleteMapping("/{idEtat}") // supprimer un etat par l'id
	public boolean delete(@PathVariable long idEtat) {
		try {
		etatService.supprimerEtat(idEtat);
		}catch (Exception e ) {
			return false; 
		}
		return true; 
	}

	
	@PutMapping(value = "/{idEtat}")	
	public void modiferEtat(@PathVariable long idEtat, @RequestBody EtatTache etatreq) {
		EtatTache etat = new EtatTache();
		etat = etatService.afficherUnEtat(idEtat);
		etat.setLibelleEtat(etatreq.getLibelleEtat());
		etatService.ajoutEtat(etat);

	}

	
}
