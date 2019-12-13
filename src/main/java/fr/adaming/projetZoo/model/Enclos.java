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
@Table (name ="tb_enclos")
public class Enclos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEnclos; 
	private int capaciteEnclos ; 
	
	@ManyToOne
	@JoinColumn(name = "id_secteur")
	private Secteur secteurEnclos ;

	public Enclos() {
		super();
	}

	public long getIdEnclos() {
		return idEnclos;
	}

	public void setIdEnclos(long idEnclos) {
		this.idEnclos = idEnclos;
	}

	public int getCapaciteEnclos() {
		return capaciteEnclos;
	}

	public void setCapaciteEnclos(int capaciteEnclos) {
		this.capaciteEnclos = capaciteEnclos;
	}

	public Secteur getSecteurEnclos() {
		return secteurEnclos;
	}

	public void setSecteurEnclos(Secteur secteurEnclos) {
		this.secteurEnclos = secteurEnclos;
	}

	@Override
	public String toString() {
		return "Enclos [idEnclos=" + idEnclos + ", capaciteEnclos=" + capaciteEnclos + ", secteurEnclos="
				+ secteurEnclos + "]";
	}


	
	
}
