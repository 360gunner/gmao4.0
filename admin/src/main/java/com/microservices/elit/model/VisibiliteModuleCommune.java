package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_module_commune database table.
 * 
 */
@Entity
@Table(name="visibilite_module_commune")
@NamedQuery(name="VisibiliteModuleCommune.findAll", query="SELECT v FROM VisibiliteModuleCommune v")
public class VisibiliteModuleCommune implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteModuleCommunePK id;

	//bi-directional many-to-one association to AdminModule
	@ManyToOne
	@JoinColumn(name="id_module", insertable=false, updatable=false)
	private AdminModule adminModule;

	public VisibiliteModuleCommune() {
	}

	public VisibiliteModuleCommunePK getId() {
		return this.id;
	}

	public void setId(VisibiliteModuleCommunePK id) {
		this.id = id;
	}

	public AdminModule getAdminModule() {
		return this.adminModule;
	}

	public void setAdminModule(AdminModule adminModule) {
		this.adminModule = adminModule;
	}

}