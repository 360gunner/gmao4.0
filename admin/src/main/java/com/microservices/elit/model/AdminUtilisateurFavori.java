package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the admin_utilisateur_favoris database table.
 * 
 */
@Entity
@Table(name="admin_utilisateur_favoris")
@NamedQuery(name="AdminUtilisateurFavori.findAll", query="SELECT a FROM AdminUtilisateurFavori a")
public class AdminUtilisateurFavori implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Integer ordre;

	//bi-directional many-to-one association to AdminFavori
	@ManyToOne
	@JoinColumn(name="id_favoris", insertable=false, updatable=false)
	private AdminFavori adminFavori;

	//bi-directional many-to-one association to AdminUtilisateur
	@ManyToOne
	@JoinColumn(name="id_utilisateur", insertable=false, updatable=false)
	private AdminUtilisateur adminUtilisateur;

	public AdminUtilisateurFavori() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrdre() {
		return this.ordre;
	}

	public void setOrdre(Integer ordre) {
		this.ordre = ordre;
	}

	public AdminFavori getAdminFavori() {
		return this.adminFavori;
	}

	public void setAdminFavori(AdminFavori adminFavori) {
		this.adminFavori = adminFavori;
	}

	public AdminUtilisateur getAdminUtilisateur() {
		return this.adminUtilisateur;
	}

	public void setAdminUtilisateur(AdminUtilisateur adminUtilisateur) {
		this.adminUtilisateur = adminUtilisateur;
	}

}