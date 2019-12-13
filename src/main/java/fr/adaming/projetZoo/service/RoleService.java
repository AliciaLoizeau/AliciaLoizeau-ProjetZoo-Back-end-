package fr.adaming.projetZoo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.projetZoo.model.Role;
import fr.adaming.projetZoo.repository.IRoleRepository;


@Service
public class RoleService implements IRoleService{
	@Autowired
	IRoleRepository roleRepo;

	@Override
	public void ajoutRole(Role role) {
		roleRepo.save(role);
		
	}

	@Override
	public Role modifierRole(Role newRole) {
		return roleRepo.save(newRole);
	}

	@Override
	public void supprimerRole(long idRole) {
		roleRepo.deleteById(idRole);
		
	}

	@Override
	public Role afficherUnRole(long idRole) {
		
		return roleRepo.findById(idRole).get();
	}

	@Override
	public List<Role> afficherTousRoles() {
		return roleRepo.findAll();
	} 
	
}
