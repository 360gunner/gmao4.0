package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_profil_mode_passation database table.
 * 
 */
@Entity
@Table(name="visibilite_profil_mode_passation")
@NamedQuery(name="VisibiliteProfilModePassation.findAll", query="SELECT v FROM VisibiliteProfilModePassation v")
public class VisibiliteProfilModePassation implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteProfilModePassationPK id;

	//bi-directional many-to-one association to DbaModePassation
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private DbaModePassation dbaModePassation;

	public VisibiliteProfilModePassation() {
	}

	public VisibiliteProfilModePassationPK getId() {
		return this.id;
	}

	public void setId(VisibiliteProfilModePassationPK id) {
		this.id = id;
	}

	public DbaModePassation getDbaModePassation() {
		return this.dbaModePassation;
	}

	public void setDbaModePassation(DbaModePassation dbaModePassation) {
		this.dbaModePassation = dbaModePassation;
	}

}