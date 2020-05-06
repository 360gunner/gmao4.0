package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the admin_connexion_encours database table.
 * 
 */
@Entity
@Table(name="admin_connexion_encours")
@NamedQuery(name="AdminConnexionEncour.findAll", query="SELECT a FROM AdminConnexionEncour a")
public class AdminConnexionEncour implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="adresse_ip")
	private String adresseIp;

	@Column(name="date_connexion")
	private Timestamp dateConnexion;

	private String utilisateur;

	public AdminConnexionEncour() {
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

	public String getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(String utilisateur) {
		this.utilisateur = utilisateur;
	}

}