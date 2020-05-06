package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the admin_connecxion_historique database table.
 * 
 */
@Entity
@Table(name="admin_connecxion_historique")
@NamedQuery(name="AdminConnecxionHistorique.findAll", query="SELECT a FROM AdminConnecxionHistorique a")
public class AdminConnecxionHistorique implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="adresse_ip")
	private String adresseIp;

	@Column(name="date_connexion")
	private Timestamp dateConnexion;

	@Column(name="date_deconnexion")
	private Timestamp dateDeconnexion;

	private String idunique;

	private String utilisateur;

	public AdminConnecxionHistorique() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdresseIp() {
		return this.adresseIp;
	}

	public void setAdresseIp(String adresseIp) {
		this.adresseIp = adresseIp;
	}

	public Timestamp getDateConnexion() {
		return this.dateConnexion;
	}

	public void setDateConnexion(Timestamp dateConnexion) {
		this.dateConnexion = dateConnexion;
	}

	public Timestamp getDateDeconnexion() {
		return this.dateDeconnexion;
	}

	public void setDateDeconnexion(Timestamp dateDeconnexion) {
		this.dateDeconnexion = dateDeconnexion;
	}

	public String getIdunique() {
		return this.idunique;
	}

	public void setIdunique(String idunique) {
		this.idunique = idunique;
	}

	public String getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(String utilisateur) {
		this.utilisateur = utilisateur;
	}

}