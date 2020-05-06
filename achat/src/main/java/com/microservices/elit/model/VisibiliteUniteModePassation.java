package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_unite_mode_passation database table.
 * 
 */
@Entity
@Table(name="visibilite_unite_mode_passation")
@NamedQuery(name="VisibiliteUniteModePassation.findAll", query="SELECT v FROM VisibiliteUniteModePassation v")
public class VisibiliteUniteModePassation implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteUniteModePassationPK id;

	//bi-directional many-to-one association to DbaModePassation
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private DbaModePassation dbaModePassation;

	public VisibiliteUniteModePassation() {
	}

	public VisibiliteUniteModePassationPK getId() {
		return this.id;
	}

	public void setId(VisibiliteUniteModePassationPK id) {
		this.id = id;
	}

	public DbaModePassation getDbaModePassation() {
		return this.dbaModePassation;
	}

	public void setDbaModePassation(DbaModePassation dbaModePassation) {
		this.dbaModePassation = dbaModePassation;
	}

}