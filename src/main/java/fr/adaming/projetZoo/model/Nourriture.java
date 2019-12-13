package fr.adaming.projetZoo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity 
@Table (name ="tb_nourriture")
public class Nourriture implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idNourriture;
	private String libelleNourriture;
	private String stockNourriture; 
	
	public Nourriture() {
		super();
	}

	public long getIdNourriture() {
		return idNourriture;
	}

	public void setIdNourriture(long idNourriture) {
		this.idNourriture = idNourriture;
	}

	public String getLibelleNourriture() {
		return libelleNourriture;
	}

	public void setLibelleNourriture(String libelleNourriture) {
		this.libelleNourriture = libelleNourriture;
	}



	public String getStockNourriture() {
		return stockNourriture;
	}

	public void setStockNourriture(String stockNourriture) {
		this.stockNourriture = stockNourriture;
	}

	@Override
	public String toString() {
		return "Nourriture [idNourriture=" + idNourriture + ", libelleNourriture=" + libelleNourriture
				+ ", stockNourriture=" + stockNourriture + "]";
	}

	
	
	
}
