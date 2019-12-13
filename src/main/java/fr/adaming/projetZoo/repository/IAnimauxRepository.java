package fr.adaming.projetZoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.projetZoo.model.Animaux;

public interface IAnimauxRepository extends JpaRepository<Animaux, Long>{

}
