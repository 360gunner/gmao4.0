package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_profil_wilaya database table.
 * 
 */
@Entity
@Table(name="visibilite_profil_wilaya")
@NamedQuery(name="VisibiliteProfilWilaya.findAll", query="SELECT v FROM VisibiliteProfilWilaya v")
public class VisibiliteProfilWilaya implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteProfilWilayaPK id;

	//bi-directional many-to-one association to AdminProfil
	@ManyToOne
	@JoinColumn(name="id_profil", insertable=false, updatable=false)
	private AdminProfil adminProfil;

	public VisibiliteProfilWilaya() {
	}

	public VisibiliteProfilWilayaPK getId() {
		return this.id;
	}

	public void setId(VisibiliteProfilWilayaPK id) {
		this.id = id;
	}

	public AdminProfil getAdminProfil() {
		return this.adminProfil;
	}

	public void setAdminProfil(AdminProfil adminProfil) {
		this.adminProfil = adminProfil;
	}

}