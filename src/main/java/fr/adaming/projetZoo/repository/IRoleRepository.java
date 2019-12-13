package fr.adaming.projetZoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.projetZoo.model.Role;

public interface IRoleRepository extends JpaRepository<Role, Long> {

}
