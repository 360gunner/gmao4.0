package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_unite_wilaya database table.
 * 
 */
@Entity
@Table(name="visibilite_unite_wilaya")
@NamedQuery(name="VisibiliteUniteWilaya.findAll", query="SELECT v FROM VisibiliteUniteWilaya v")
public class VisibiliteUniteWilaya implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteUniteWilayaPK id;

	//bi-directional many-to-one association to AdminUniteOrganisationnelle
	@ManyToOne
	@JoinColumn(name="id_unite", insertable=false, updatable=false)
	private AdminUniteOrganisationnelle adminUniteOrganisationnelle;

	public VisibiliteUniteWilaya() {
	}

	public VisibiliteUniteWilayaPK getId() {
		return this.id;
	}

	public void setId(VisibiliteUniteWilayaPK id) {
		this.id = id;
	}

	public AdminUniteOrganisationnelle getAdminUniteOrganisationnelle() {
		return this.adminUniteOrganisationnelle;
	}

	public void setAdminUniteOrganisationnelle(AdminUniteOrganisationnelle adminUniteOrganisationnelle) {
		this.adminUniteOrganisationnelle = adminUniteOrganisationnelle;
	}

}