package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_unite_mode_transport database table.
 * 
 */
@Entity
@Table(name="visibilite_unite_mode_transport")
@NamedQuery(name="VisibiliteUniteModeTransport.findAll", query="SELECT v FROM VisibiliteUniteModeTransport v")
public class VisibiliteUniteModeTransport implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteUniteModeTransportPK id;

	//bi-directional many-to-one association to DbaModeTransport
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private DbaModeTransport dbaModeTransport;

	public VisibiliteUniteModeTransport() {
	}

	public VisibiliteUniteModeTransportPK getId() {
		return this.id;
	}

	public void setId(VisibiliteUniteModeTransportPK id) {
		this.id = id;
	}

	public DbaModeTransport getDbaModeTransport() {
		return this.dbaModeTransport;
	}

	public void setDbaModeTransport(DbaModeTransport dbaModeTransport) {
		this.dbaModeTransport = dbaModeTransport;
	}

}