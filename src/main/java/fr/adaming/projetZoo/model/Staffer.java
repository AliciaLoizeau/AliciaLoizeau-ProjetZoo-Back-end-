package fr.adaming.projetZoo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity 
@Table (name ="tb_staffer")
public class Staffer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idStaffer; 
	private String nomStaffer;
	private String loginStaffer; 
	private String mdpStaffer; 
	private String emailStaffer;
	
	@OneToOne 
	@JoinColumn(name = "id_secteur")
	private Secteur secteurStaffer ; 
	
	@OneToOne 
	@JoinColumn (name ="id_role")
	private Role roleStaffer ; 
	
	

	public Staffer() {
		super();
	}

	public long getIdStaffer() {
		return idStaffer;
	}

	public void setIdStaffer(long idStaffer) {
		this.idStaffer = idStaffer;
	}

	public String getNomStaffer() {
		return nomStaffer;
	}

	public void setNomStaffer(String nomStaffer) {
		this.nomStaffer = nomStaffer;
	}

	public String getLoginStaffer() {
		return loginStaffer;
	}

	public void setLoginStaffer(String loginStaffer) {
		this.loginStaffer = loginStaffer;
	}

	public String getMdpStaffer() {
		return mdpStaffer;
	}

	public void setMdpStaffer(String mdpStaffer) {
		this.mdpStaffer = mdpStaffer;
	}

	public String getEmailStaffer() {
		return emailStaffer;
	}

	public void setEmailStaffer(String emailStaffer) {
		this.emailStaffer = emailStaffer;
	}

	public Role getRoleStaffer() {
		return roleStaffer;
	}

	public void setRoleStaffer(Role roleStaffer) {
		this.roleStaffer = roleStaffer;
	}

	
	
	

	public Secteur getSecteurStaffer() {
		return secteurStaffer;
	}

	public void setSecteurStaffer(Secteur secteurStaffer) {
		this.secteurStaffer = secteurStaffer;
	}

	@Override
	public String toString() {
		return "Staffer [idStaffer=" + idStaffer + ", nomStaffer=" + nomStaffer + ", loginStaffer=" + loginStaffer
				+ ", mdpStaffer=" + mdpStaffer + ", emailStaffer=" + emailStaffer + ", secteurStaffer=" + secteurStaffer
				+ ", roleStaffer=" + roleStaffer + "]";
	}

	}

	
	
	
	
	
	
	
	

