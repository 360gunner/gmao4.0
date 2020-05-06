package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the admin_groupe database table.
 * 
 */
@Entity
@Table(name="admin_groupe")
@NamedQuery(name="AdminGroupe.findAll", query="SELECT a FROM AdminGroupe a")
public class AdminGroupe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String description;

	private String libelle;

	//bi-directional many-to-one association to AdminDroitVisibilite
	@OneToMany(mappedBy="adminGroupe")
	private List<AdminDroitVisibilite> adminDroitVisibilites;

	//bi-directional many-to-many association to AdminUtilisateur
	@ManyToMany(mappedBy="adminGroupes")
	private List<AdminUtilisateur> adminUtilisateurs;

	public AdminGroupe() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<AdminDroitVisibilite> getAdminDroitVisibilites() {
		return this.adminDroitVisibilites;
	}

	public void setAdminDroitVisibilites(List<AdminDroitVisibilite> adminDroitVisibilites) {
		this.adminDroitVisibilites = adminDroitVisibilites;
	}

	public AdminDroitVisibilite addAdminDroitVisibilite(AdminDroitVisibilite adminDroitVisibilite) {
		getAdminDroitVisibilites().add(adminDroitVisibilite);
		adminDroitVisibilite.setAdminGroupe(this);

		return adminDroitVisibilite;
	}

	public AdminDroitVisibilite removeAdminDroitVisibilite(AdminDroitVisibilite adminDroitVisibilite) {
		getAdminDroitVisibilites().remove(adminDroitVisibilite);
		adminDroitVisibilite.setAdminGroupe(null);

		return adminDroitVisibilite;
	}

	public List<AdminUtilisateur> getAdminUtilisateurs() {
		return this.adminUtilisateurs;
	}

	public void setAdminUtilisateurs(List<AdminUtilisateur> adminUtilisateurs) {
		this.adminUtilisateurs = adminUtilisateurs;
	}

}