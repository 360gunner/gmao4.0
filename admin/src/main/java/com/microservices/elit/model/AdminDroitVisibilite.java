package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the admin_droit_visibilite database table.
 * 
 */
@Entity
@Table(name="admin_droit_visibilite")
@NamedQuery(name="AdminDroitVisibilite.findAll", query="SELECT a FROM AdminDroitVisibilite a")
public class AdminDroitVisibilite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	//bi-directional many-to-one association to AdminGroupe
	@ManyToOne
	@JoinColumn(name="id_groupe", insertable=false, updatable=false)
	private AdminGroupe adminGroupe;

	//bi-directional many-to-one association to AdminObjetVisibilite
	@ManyToOne
	@JoinColumn(name="id_objet_visibilite", insertable=false, updatable=false)
	private AdminObjetVisibilite adminObjetVisibilite;

	//bi-directional many-to-one association to AdminUniteOrganisationnelle
	@ManyToOne
	@JoinColumn(name="id_unite_organisationnelle", insertable=false, updatable=false)
	private AdminUniteOrganisationnelle adminUniteOrganisationnelle;

	//bi-directional many-to-one association to AdminUtilisateur
	@ManyToOne
	@JoinColumn(name="id_utilisateur", insertable=false, updatable=false)
	private AdminUtilisateur adminUtilisateur;

	public AdminDroitVisibilite() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public AdminGroupe getAdminGroupe() {
		return this.adminGroupe;
	}

	public void setAdminGroupe(AdminGroupe adminGroupe) {
		this.adminGroupe = adminGroupe;
	}

	public AdminObjetVisibilite getAdminObjetVisibilite() {
		return this.adminObjetVisibilite;
	}

	public void setAdminObjetVisibilite(AdminObjetVisibilite adminObjetVisibilite) {
		this.adminObjetVisibilite = adminObjetVisibilite;
	}

	public AdminUniteOrganisationnelle getAdminUniteOrganisationnelle() {
		return this.adminUniteOrganisationnelle;
	}

	public void setAdminUniteOrganisationnelle(AdminUniteOrganisationnelle adminUniteOrganisationnelle) {
		this.adminUniteOrganisationnelle = adminUniteOrganisationnelle;
	}

	public AdminUtilisateur getAdminUtilisateur() {
		return this.adminUtilisateur;
	}

	public void setAdminUtilisateur(AdminUtilisateur adminUtilisateur) {
		this.adminUtilisateur = adminUtilisateur;
	}

}