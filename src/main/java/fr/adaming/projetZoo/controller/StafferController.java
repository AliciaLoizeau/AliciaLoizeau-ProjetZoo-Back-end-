package fr.adaming.projetZoo.controller;

import java.security.Key;
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


import fr.adaming.projetZoo.model.Staffer;
import fr.adaming.projetZoo.model.Token;
import fr.adaming.projetZoo.service.IStafferService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@RestController
@RequestMapping("staffer")
@CrossOrigin("http://localhost:4200")

public class StafferController {
	@Autowired
	IStafferService stafferService;
	Key cle = Keys.secretKeyFor(SignatureAlgorithm.HS256);

	@GetMapping // Afficher tous les staffers
	public List<Staffer> afficherStaffers() {
		return stafferService.afficherTousStaffers();
	}

	// Afficher un staffer par l'id @GetMapping("/{id}

	@GetMapping("/{idStaffer}")
	public Staffer afficherUnStaffer(@PathVariable long idStaffer) {
		Staffer staffer = new Staffer();
		staffer = stafferService.afficherUnStaffer(idStaffer);
		return staffer;

	}

	@PostMapping // ajouter un staffer
	public void ajoutStaffer(@RequestBody Staffer stafferreq) {
		stafferService.ajoutStaffer(stafferreq);
	}

	@DeleteMapping("/{idStaffer}") // supprimer un staffer par l'id
	public boolean supprimerStaffer(@PathVariable long idStaffer) {
		try {
			stafferService.supprimerStaffer(idStaffer);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@PutMapping("/{idStaffer}") // changer le type de retour
	public void update(@PathVariable long idStaffer, @RequestBody Staffer stafferreq) {
		Staffer staffer = new Staffer();
		staffer = stafferService.afficherUnStaffer(idStaffer);
		staffer.setNomStaffer(stafferreq.getNomStaffer());
		staffer.setLoginStaffer(stafferreq.getLoginStaffer());
		staffer.setMdpStaffer(stafferreq.getMdpStaffer());
		staffer.setEmailStaffer(stafferreq.getEmailStaffer());
		staffer.setRoleStaffer(stafferreq.getRoleStaffer());
		staffer.setSecteurStaffer(stafferreq.getSecteurStaffer());
		stafferService.ajoutStaffer(staffer);

	}

	@GetMapping("/login/{loginStaffer}")
	public List<Staffer> getByLoginStaffer(@PathVariable String loginStaffer) {
		return stafferService.findByLoginStaffer(loginStaffer);

	}

	@GetMapping("/exist/{loginStaffer}")
	public boolean existsStafferByLoginStaffer(@PathVariable String loginStaffer) {
		return stafferService.existByStafferLoginStaffer(loginStaffer);
	}

	@PostMapping("/login")
	public Token findByloginStafferAndMotDePasseStaffer(@RequestBody Staffer staffer) {
		Staffer s = stafferService.findByloginStafferAndMotDePasseStaffer(staffer.getLoginStaffer(), staffer.getMdpStaffer());
		if (s.getIdStaffer() != 0) {

			String token;// contenu du token
			token = Jwts.builder().setSubject(s.getLoginStaffer()).signWith(cle).compact();
			Token t = new Token(); // classe token
			t.setToken(token);
			return t;
		}
		return null;
	}
}
