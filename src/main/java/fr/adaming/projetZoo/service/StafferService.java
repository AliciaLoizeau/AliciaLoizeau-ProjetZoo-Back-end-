package fr.adaming.projetZoo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import fr.adaming.projetZoo.model.Staffer;
import fr.adaming.projetZoo.repository.IStafferRepository;
@Service
public class StafferService implements IStafferService{
@Autowired
IStafferRepository stafferRepo;
	@Override
	public void ajoutStaffer(Staffer staffer) {
		stafferRepo.save(staffer);
		
	}

	@Override
	public Staffer modifierStaffer(Staffer newStaffer) {
		return stafferRepo.save(newStaffer);
	}

	@Override
	public void supprimerStaffer(long idStaffer) {
		stafferRepo.deleteById(idStaffer);
		
	}

	@Override
	public Staffer afficherUnStaffer(long idStaffer) {
		Optional <Staffer> stafferOptional = stafferRepo.findById(idStaffer); 
		Staffer staffer= new Staffer () ; 
	if(stafferOptional.isPresent()) {
		staffer = stafferOptional.get();
		return staffer; 	
	}else {
		return staffer ; 
	}
	
	}

	@Override
	public List<Staffer> afficherTousStaffers() {
		
		return stafferRepo.findAll();
	}

	@Override
	public List<Staffer> findByLoginStaffer(String loginStaffer) {
		
		return stafferRepo.findByLoginStaffer(loginStaffer);
	}
	

	@Override
	public boolean existByStafferLoginStaffer(String loginStaffer) {
		
		return stafferRepo.existsStafferByLoginStaffer(loginStaffer);
	}

	@Override
	public Staffer findByloginStafferAndMotDePasseStaffer(String loginStaffer, String mdpStaffer) {
		Staffer staffer = stafferRepo.findByloginStafferAndMdpStaffer(loginStaffer, mdpStaffer);
		if(staffer!=null) {
			staffer.setMdpStaffer("");
		
		return staffer;
		}else {
			return new Staffer(); 
	}

	}
}
