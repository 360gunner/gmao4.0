package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_profil_mode_transport database table.
 * 
 */
@Entity
@Table(name="visibilite_profil_mode_transport")
@NamedQuery(name="VisibiliteProfilModeTransport.findAll", query="SELECT v FROM VisibiliteProfilModeTransport v")
public class VisibiliteProfilModeTransport implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteProfilModeTransportPK id;

	//bi-directional many-to-one association to DbaModeTransport
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private DbaModeTransport dbaModeTransport;

	public VisibiliteProfilModeTransport() {
	}

	public VisibiliteProfilModeTransportPK getId() {
		return this.id;
	}

	public void setId(VisibiliteProfilModeTransportPK id) {
		this.id = id;
	}

	public DbaModeTransport getDbaModeTransport() {
		return this.dbaModeTransport;
	}

	public void setDbaModeTransport(DbaModeTransport dbaModeTransport) {
		this.dbaModeTransport = dbaModeTransport;
	}

}