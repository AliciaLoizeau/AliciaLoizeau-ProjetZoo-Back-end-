package fr.adaming.projetZoo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table (name = "tb_tache")
public class Tache implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTache;
	private String libelleTache;
	private int dureeTache;
	private Date dateTache; 
	@OneToOne 
	@JoinColumn (name ="id_etat")
	private EtatTache etatTache ;
	@ManyToOne
	@JoinColumn(name ="id_staffer")
	private Staffer stafferTache;

	
	
	public Tache() {
		super();
	}

	public long getIdTache() {
		return idTache;
	}

	public void setIdTache(long idTache) {
		this.idTache = idTache;
	}

	public String getLibelleTache() {
		return libelleTache;
	}

	public void setLibelleTache(String libelleTache) {
		this.libelleTache = libelleTache;
	}

	public int getDureeTache() {
		return dureeTache;
	}

	public void setDureeTache(int dureeTache) {
		this.dureeTache = dureeTache;
	}

	public EtatTache getEtatTache() {
		return etatTache;
	}

	public void setEtatTache(EtatTache etatTache) {
		this.etatTache = etatTache;
	}



	public Date getDateTache() {
		return dateTache;
	}

	public void setDateTache(Date dateTache) {
		this.dateTache = dateTache;
	}



	@Override
	public String toString() {
		return "Tache [idTache=" + idTache + ", libelleTache=" + libelleTache + ", dureeTache=" + dureeTache
				+ ", dateTache=" + dateTache + ", etatTache=" + etatTache + ", stafferTache=" + stafferTache + "]";
	}

	public Staffer getStafferTache() {
		return stafferTache;
	}

	public void setStafferTache(Staffer stafferTache) {
		this.stafferTache = stafferTache;
	} 
	
	
}
