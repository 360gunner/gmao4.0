package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_module_mode_passation database table.
 * 
 */
@Entity
@Table(name="visibilite_module_mode_passation")
@NamedQuery(name="VisibiliteModuleModePassation.findAll", query="SELECT v FROM VisibiliteModuleModePassation v")
public class VisibiliteModuleModePassation implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteModuleModePassationPK id;

	//bi-directional many-to-one association to DbaModePassation
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private DbaModePassation dbaModePassation;

	public VisibiliteModuleModePassation() {
	}

	public VisibiliteModuleModePassationPK getId() {
		return this.id;
	}

	public void setId(VisibiliteModuleModePassationPK id) {
		this.id = id;
	}

	public DbaModePassation getDbaModePassation() {
		return this.dbaModePassation;
	}

	public void setDbaModePassation(DbaModePassation dbaModePassation) {
		this.dbaModePassation = dbaModePassation;
	}

}