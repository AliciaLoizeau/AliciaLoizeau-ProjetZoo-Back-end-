package fr.adaming.projetZoo.service;

import java.util.List;

import fr.adaming.projetZoo.model.Staffer;

public interface IStafferService {
	public void ajoutStaffer (Staffer staffer); 
	public Staffer modifierStaffer (Staffer newStaffer);
	public void supprimerStaffer (long idStaffer);
	public Staffer afficherUnStaffer (long idStaffer);
	public List<Staffer> afficherTousStaffers();
	public List<Staffer> findByLoginStaffer (String loginStaffer);
	
	public boolean existByStafferLoginStaffer(String loginStaffer); 
	
	public Staffer findByloginStafferAndMotDePasseStaffer(String loginStaffer, String mdpStaffer); 
}
