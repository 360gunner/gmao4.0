package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_profil_commune database table.
 * 
 */
@Entity
@Table(name="visibilite_profil_commune")
@NamedQuery(name="VisibiliteProfilCommune.findAll", query="SELECT v FROM VisibiliteProfilCommune v")
public class VisibiliteProfilCommune implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteProfilCommunePK id;

	//bi-directional many-to-one association to AdminProfil
	@ManyToOne
	@JoinColumn(name="id_profil", insertable=false, updatable=false)
	private AdminProfil adminProfil;

	public VisibiliteProfilCommune() {
	}

	public VisibiliteProfilCommunePK getId() {
		return this.id;
	}

	public void setId(VisibiliteProfilCommunePK id) {
		this.id = id;
	}

	public AdminProfil getAdminProfil() {
		return this.adminProfil;
	}

	public void setAdminProfil(AdminProfil adminProfil) {
		this.adminProfil = adminProfil;
	}

}