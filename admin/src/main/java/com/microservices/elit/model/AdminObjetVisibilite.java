package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the admin_objet_visibilite database table.
 * 
 */
@Entity
@Table(name="admin_objet_visibilite")
@NamedQuery(name="AdminObjetVisibilite.findAll", query="SELECT a FROM AdminObjetVisibilite a")
public class AdminObjetVisibilite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String entity;

	private String libelle;

	//bi-directional many-to-one association to AdminDroitVisibilite
	@OneToMany(mappedBy="adminObjetVisibilite")
	private List<AdminDroitVisibilite> adminDroitVisibilites;

	//bi-directional many-to-one association to AdminModule
	@ManyToOne
	@JoinColumn(name="module", insertable=false, updatable=false)
	private AdminModule adminModule;

	public AdminObjetVisibilite() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEntity() {
		return this.entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
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
		adminDroitVisibilite.setAdminObjetVisibilite(this);

		return adminDroitVisibilite;
	}

	public AdminDroitVisibilite removeAdminDroitVisibilite(AdminDroitVisibilite adminDroitVisibilite) {
		getAdminDroitVisibilites().remove(adminDroitVisibilite);
		adminDroitVisibilite.setAdminObjetVisibilite(null);

		return adminDroitVisibilite;
	}

	public AdminModule getAdminModule() {
		return this.adminModule;
	}

	public void setAdminModule(AdminModule adminModule) {
		this.adminModule = adminModule;
	}

}