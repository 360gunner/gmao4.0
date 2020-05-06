package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_unite_commune database table.
 * 
 */
@Entity
@Table(name="visibilite_unite_commune")
@NamedQuery(name="VisibiliteUniteCommune.findAll", query="SELECT v FROM VisibiliteUniteCommune v")
public class VisibiliteUniteCommune implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteUniteCommunePK id;

	//bi-directional many-to-one association to AdminUniteOrganisationnelle
	@ManyToOne
	@JoinColumn(name="id_unite", insertable=false, updatable=false)
	private AdminUniteOrganisationnelle adminUniteOrganisationnelle;

	public VisibiliteUniteCommune() {
	}

	public VisibiliteUniteCommunePK getId() {
		return this.id;
	}

	public void setId(VisibiliteUniteCommunePK id) {
		this.id = id;
	}

	public AdminUniteOrganisationnelle getAdminUniteOrganisationnelle() {
		return this.adminUniteOrganisationnelle;
	}

	public void setAdminUniteOrganisationnelle(AdminUniteOrganisationnelle adminUniteOrganisationnelle) {
		this.adminUniteOrganisationnelle = adminUniteOrganisationnelle;
	}

}