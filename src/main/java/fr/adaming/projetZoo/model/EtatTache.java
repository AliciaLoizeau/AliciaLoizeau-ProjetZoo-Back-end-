package fr.adaming.projetZoo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity 
@Table (name ="tb_etat_des_taches")
public class EtatTache implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long idEtat;
private String libelleEtat;

public EtatTache() {
	super();
}

public long getIdEtat() {
	return idEtat;
}

public void setIdEtat(long idEtat) {
	this.idEtat = idEtat;
}

public String getLibelleEtat() {
	return libelleEtat;
}

public void setLibelleEtat(String libelleEtat) {
	this.libelleEtat = libelleEtat;
}

@Override
public String toString() {
	return "EtatTache [idEtat=" + idEtat + ", libelleEtat=" + libelleEtat + "]";
} 


}
