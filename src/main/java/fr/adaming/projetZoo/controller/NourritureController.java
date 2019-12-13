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

import fr.adaming.projetZoo.model.Nourriture;
import fr.adaming.projetZoo.service.INourritureService;


@RestController
@RequestMapping("nourriture")
@CrossOrigin("http://localhost:4200")
public class NourritureController {
	@Autowired
	INourritureService nourritureService;

	@GetMapping // Afficher tous les nourritures
	public List<Nourriture> afficherNourritures() {
		return nourritureService.afficherTousNourriture();
	}

	// Afficher un nourriture par l'id @GetMapping("/{id}

	@GetMapping("/{idNourriture}")
	public Nourriture afficherUnNourriture(@PathVariable long idNourriture) {
		Nourriture nourriture = new Nourriture();
		nourriture = nourritureService.afficherNourriture(idNourriture);
		return nourriture;

	}

	@PostMapping // ajouter un nourriture
	public void ajoutNourriture(@RequestBody Nourriture nourriturereq) {
		nourritureService.ajoutNourriture(nourriturereq);
	}

	@DeleteMapping("/{idNourriture}") // supprimer un nourriture par l'id
	public boolean supprimerNourriture(@PathVariable long idNourriture) {
		nourritureService.supprimerNourriture(idNourriture);
		return true;
	}

	@PutMapping("/{idNourriture}")// changer le type de retour
	public void update(@PathVariable long idNourriture, @RequestBody Nourriture nourriturereq) {
		Nourriture nourriture = new Nourriture();
		nourriture = nourritureService.afficherNourriture(idNourriture);
		nourriture.setLibelleNourriture(nourriturereq.getLibelleNourriture());
		nourriture.setStockNourriture(nourriturereq.getStockNourriture());
		nourritureService.ajoutNourriture(nourriture);

	}
}
