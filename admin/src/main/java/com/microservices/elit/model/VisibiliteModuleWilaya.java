package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_module_wilaya database table.
 * 
 */
@Entity
@Table(name="visibilite_module_wilaya")
@NamedQuery(name="VisibiliteModuleWilaya.findAll", query="SELECT v FROM VisibiliteModuleWilaya v")
public class VisibiliteModuleWilaya implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteModuleWilayaPK id;

	//bi-directional many-to-one association to AdminModule
	@ManyToOne
	@JoinColumn(name="id_module", insertable=false, updatable=false)
	private AdminModule adminModule;

	public VisibiliteModuleWilaya() {
	}

	public VisibiliteModuleWilayaPK getId() {
		return this.id;
	}

	public void setId(VisibiliteModuleWilayaPK id) {
		this.id = id;
	}

	public AdminModule getAdminModule() {
		return this.adminModule;
	}

	public void setAdminModule(AdminModule adminModule) {
		this.adminModule = adminModule;
	}

}