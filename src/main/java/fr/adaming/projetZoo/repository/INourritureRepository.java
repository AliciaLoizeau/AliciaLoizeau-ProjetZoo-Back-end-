package fr.adaming.projetZoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.projetZoo.model.Nourriture;

public interface INourritureRepository extends JpaRepository<Nourriture, Long>{

}
