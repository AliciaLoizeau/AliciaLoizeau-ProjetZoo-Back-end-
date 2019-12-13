package fr.adaming.projetZoo.service;

import java.util.List;

import fr.adaming.projetZoo.model.Role;

public interface IRoleService {

	public void ajoutRole (Role role); 
	public Role modifierRole (Role newRole);
	public void supprimerRole (long idRole);
	public Role afficherUnRole (long idRole);
	public List<Role> afficherTousRoles();

}
