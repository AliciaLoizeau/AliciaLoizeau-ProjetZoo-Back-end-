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

import fr.adaming.projetZoo.model.Role;
import fr.adaming.projetZoo.service.IRoleService;

@RestController
@RequestMapping("role")
@CrossOrigin("http://localhost:4200")
public class RoleController {
	@Autowired
	IRoleService roleService;

	@GetMapping // Afficher tous les roles
	public List<Role> afficherRoles() {
		return roleService.afficherTousRoles();
	}

	// Afficher un role par l'id @GetMapping("/{id}

	@GetMapping("/{idRole}")
	public Role afficherUnRole(@PathVariable long idRole) {
		Role role = new Role();
		role = roleService.afficherUnRole(idRole);
		return role;

	}

	@PostMapping // ajouter un role
	public void ajoutRole(@RequestBody Role rolereq) {
		roleService.ajoutRole(rolereq);
	}

	@DeleteMapping("/{idRole}") // supprimer un role par l'id
	public boolean supprimerRole(@PathVariable long idRole) {
		roleService.supprimerRole(idRole);
		return true;
	}

	@PutMapping("/{idRole}")// changer le type de retour
	public void update(@PathVariable long idRole, @RequestBody Role rolereq) {
		Role role = new Role();
		role = roleService.afficherUnRole(idRole);
		role.setLibelleRole(rolereq.getLibelleRole());
		roleService.ajoutRole(role);

	}
	
	

}
