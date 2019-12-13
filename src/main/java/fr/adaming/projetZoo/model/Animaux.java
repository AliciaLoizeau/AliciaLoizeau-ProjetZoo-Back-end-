package fr.adaming.projetZoo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity 
@Table (name ="tb_animaux")
public class Animaux implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAnimal;
	private String especeAnimal;
	
	@ManyToOne
	@JoinColumn (name ="id_nourriture")
	private Nourriture nourritureAnimal;

	@ManyToOne 
	@JoinColumn( name ="id_enclos")
	private Enclos enclosAnimal; 
	
	public Animaux() {
		super();
	}

	public long getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(long idAnimal) {
		this.idAnimal = idAnimal;
	}

	public String getEspeceAnimal() {
		return especeAnimal;
	}

	public void setEspeceAnimal(String especeAnimal) {
		this.especeAnimal = especeAnimal;
	}

	public Nourriture getNourritureAnimal() {
		return nourritureAnimal;
	}

	public void setNourritureAnimal(Nourriture nourritureAnimal) {
		this.nourritureAnimal = nourritureAnimal;
	}

	public Enclos getEnclosAnimal() {
		return enclosAnimal;
	}

	public void setEnclosAnimal(Enclos enclosAnimal) {
		this.enclosAnimal = enclosAnimal;
	}

	@Override
	public String toString() {
		return "Animaux [idAnimal=" + idAnimal + ", especeAnimal=" + especeAnimal + ", nourritureAnimal="
				+ nourritureAnimal + "]";
	} 
	
}
