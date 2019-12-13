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

import fr.adaming.projetZoo.model.Enclos;
import fr.adaming.projetZoo.service.IEnclosService;

@RestController
@RequestMapping("enclos")
@CrossOrigin("http://localhost:4200")
public class EnclosController {

	@Autowired
	IEnclosService enclosService;

	@GetMapping // Afficher tous les encloss
	public List<Enclos> afficherEncloss() {
		return enclosService.afficherTousEnclos();
	}

	// Afficher un enclos par l'id @GetMapping("/{id}

	@GetMapping("/{idEnclos}")
	public Enclos afficherUnEnclos(@PathVariable long idEnclos) {
		Enclos enclos = new Enclos();
		enclos = enclosService.afficherUnEnclos(idEnclos);
		return enclos;

	}

	@PostMapping // ajouter un enclos
	public void ajoutEnclos(@RequestBody Enclos enclosreq) {
		enclosService.ajoutEnclos(enclosreq);
	}

	@DeleteMapping("/{idEnclos}") // supprimer un enclos par l'id
	public boolean supprimerEnclos(@PathVariable long idEnclos) {
		enclosService.supprimerEnclos(idEnclos);
		return true;
	}

	@PutMapping("/{idEnclos}")// changer le type de retour
	public void update(@PathVariable long idEnclos, @RequestBody Enclos enclosreq) {
		Enclos enclos = new Enclos();
		enclos = enclosService.afficherUnEnclos(idEnclos);
		enclos.setCapaciteEnclos(enclosreq.getCapaciteEnclos());
		enclos.setSecteurEnclos(enclosreq.getSecteurEnclos());
		enclosService.ajoutEnclos(enclos);

	}
}
