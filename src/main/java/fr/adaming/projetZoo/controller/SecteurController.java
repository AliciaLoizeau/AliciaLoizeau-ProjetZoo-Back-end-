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

import fr.adaming.projetZoo.model.Secteur;
import fr.adaming.projetZoo.service.ISecteurService;


@RestController
@RequestMapping("secteur")
@CrossOrigin("http://localhost:4200")
public class SecteurController {
	
	@Autowired
	ISecteurService secteurService;

	@GetMapping // Afficher tous les secteurs
	public List<Secteur> afficherSecteurs() {
		return secteurService.afficherTousSecteurs();
	}

	// Afficher un secteur par l'id @GetMapping("/{id}

	@GetMapping("/{idSecteur}")
	public Secteur afficherUnSecteur(@PathVariable long idSecteur) {
		Secteur secteur = new Secteur();
		secteur = secteurService.afficherUnSecteur(idSecteur);
		return secteur;

	}

	@PostMapping // ajouter un secteur
	public void ajoutSecteur(@RequestBody Secteur secteurreq) {
		secteurService.ajoutSecteur(secteurreq);
	}

	@DeleteMapping("/{idSecteur}") // supprimer un secteur par l'id
	public boolean supprimerSecteur(@PathVariable long idSecteur) {
		try{
			secteurService.supprimerSecteur(idSecteur);
		}catch (Exception e) {
			return false;
		}
		return true;
		
	
		
		
		
		
	}

	@PutMapping("/{idSecteur}")// changer le type de retour
	public void update(@PathVariable long idSecteur, @RequestBody Secteur secteurreq) {
		Secteur secteur = new Secteur();
		secteur = secteurService.afficherUnSecteur(idSecteur);
		secteur.setLibelleSecteur(secteurreq.getLibelleSecteur());
		secteurService.ajoutSecteur(secteur);

	}
}
