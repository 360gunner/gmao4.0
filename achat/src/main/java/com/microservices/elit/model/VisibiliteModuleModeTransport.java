package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_module_mode_transport database table.
 * 
 */
@Entity
@Table(name="visibilite_module_mode_transport")
@NamedQuery(name="VisibiliteModuleModeTransport.findAll", query="SELECT v FROM VisibiliteModuleModeTransport v")
public class VisibiliteModuleModeTransport implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteModuleModeTransportPK id;

	//bi-directional many-to-one association to DbaModeTransport
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private DbaModeTransport dbaModeTransport;

	public VisibiliteModuleModeTransport() {
	}

	public VisibiliteModuleModeTransportPK getId() {
		return this.id;
	}

	public void setId(VisibiliteModuleModeTransportPK id) {
		this.id = id;
	}

	public DbaModeTransport getDbaModeTransport() {
		return this.dbaModeTransport;
	}

	public void setDbaModeTransport(DbaModeTransport dbaModeTransport) {
		this.dbaModeTransport = dbaModeTransport;
	}

}