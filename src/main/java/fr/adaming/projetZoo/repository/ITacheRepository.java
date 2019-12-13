package fr.adaming.projetZoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.projetZoo.model.Tache;

public interface ITacheRepository extends JpaRepository<Tache, Long> {

}
