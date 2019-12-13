package fr.adaming.projetZoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.projetZoo.model.EtatTache;




public interface IEtatRepository extends JpaRepository<EtatTache, Long>{
	
	

}
