package fr.adaming.projetZoo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import fr.adaming.projetZoo.model.Staffer;

public interface IStafferRepository extends JpaRepository<Staffer, Long> {
	
	public List<Staffer> findByLoginStaffer (String loginStaffer);// "findByLoginUser" après le by correspondance avec l'attribut 
	
	public boolean existsStafferByLoginStaffer (String loginStaffer); 
	
	public Staffer findByloginStafferAndMdpStaffer(String loginStaffer, String mdpStaffer); 
	
}
