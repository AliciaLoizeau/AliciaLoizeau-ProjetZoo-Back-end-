package fr.adaming.projetZoo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity 
@Table (name ="tb_secteur")
public class Secteur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idSecteur ; 
	private String libelleSecteur;
	
	public Secteur() {
		super();
	}

	public long getIdSecteur() {
		return idSecteur;
	}

	public void setIdSecteur(long idSecteur) {
		this.idSecteur = idSecteur;
	}

	public String getLibelleSecteur() {
		return libelleSecteur;
	}

	public void setLibelleSecteur(String libelleSecteur) {
		this.libelleSecteur = libelleSecteur;
	}

	@Override
	public String toString() {
		return "Secteur [idSecteur=" + idSecteur + ", libelleSecteur=" + libelleSecteur + "]";
	} 
	
	
	
}
