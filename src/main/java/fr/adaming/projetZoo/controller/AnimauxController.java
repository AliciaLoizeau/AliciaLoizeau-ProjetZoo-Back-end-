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

import fr.adaming.projetZoo.model.Animaux;
import fr.adaming.projetZoo.service.IAnimauxService;

@RestController
@RequestMapping("animaux")
@CrossOrigin("http://localhost:4200")
public class AnimauxController {

	@Autowired
	IAnimauxService animauxService;

	@GetMapping // Afficher tous les animauxs
	public List<Animaux> afficheranimauxs() {
		return animauxService.afficherTousAnimaux();
	}

	// Afficher un animaux par l'id @GetMapping("/{id}

	@GetMapping("/{idanimaux}")
	public Animaux afficherUnanimaux(@PathVariable long idanimaux) {
		Animaux animaux = new Animaux();
		animaux = animauxService.afficherUnAnimal(idanimaux);
		return animaux;

	}

	@PostMapping // ajouter un animaux
	public void ajoutanimaux(@RequestBody Animaux animauxreq) {
		animauxService.ajoutAnimal(animauxreq);
	}

	@DeleteMapping("/{idanimaux}") // supprimer un animaux par l'id
	public boolean supprimeranimaux(@PathVariable long idanimaux) {
		animauxService.supprimerAnimal(idanimaux);
		return true;
	}

	@PutMapping("/{idanimaux}")// changer le type de retour
	public void modifierAnimal(@PathVariable long idanimaux, @RequestBody Animaux animauxreq) {
		Animaux animaux = new Animaux (); 
		animaux = animauxService.afficherUnAnimal(idanimaux);
		animaux.setEspeceAnimal(animauxreq.getEspeceAnimal());
		animaux.setNourritureAnimal(animauxreq.getNourritureAnimal());
		animaux.setEnclosAnimal(animauxreq.getEnclosAnimal());
		animauxService.ajoutAnimal(animaux);

	}
}
