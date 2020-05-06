package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the admin_favoris database table.
 * 
 */
@Entity
@Table(name="admin_favoris")
@NamedQuery(name="AdminFavori.findAll", query="SELECT a FROM AdminFavori a")
public class AdminFavori implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String titre;

	//bi-directional many-to-one association to AdminPrivilege
	@ManyToOne
	@JoinColumn(name="id_privilege", insertable=false, updatable=false)
	private AdminPrivilege adminPrivilege;

	//bi-directional many-to-one association to AdminUtilisateurFavori
	@OneToMany(mappedBy="adminFavori")
	private List<AdminUtilisateurFavori> adminUtilisateurFavoris;

	public AdminFavori() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public AdminPrivilege getAdminPrivilege() {
		return this.adminPrivilege;
	}

	public void setAdminPrivilege(AdminPrivilege adminPrivilege) {
		this.adminPrivilege = adminPrivilege;
	}

	public List<AdminUtilisateurFavori> getAdminUtilisateurFavoris() {
		return this.adminUtilisateurFavoris;
	}

	public void setAdminUtilisateurFavoris(List<AdminUtilisateurFavori> adminUtilisateurFavoris) {
		this.adminUtilisateurFavoris = adminUtilisateurFavoris;
	}

	public AdminUtilisateurFavori addAdminUtilisateurFavori(AdminUtilisateurFavori adminUtilisateurFavori) {
		getAdminUtilisateurFavoris().add(adminUtilisateurFavori);
		adminUtilisateurFavori.setAdminFavori(this);

		return adminUtilisateurFavori;
	}

	public AdminUtilisateurFavori removeAdminUtilisateurFavori(AdminUtilisateurFavori adminUtilisateurFavori) {
		getAdminUtilisateurFavoris().remove(adminUtilisateurFavori);
		adminUtilisateurFavori.setAdminFavori(null);

		return adminUtilisateurFavori;
	}

}