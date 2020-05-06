package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_module_incoterm database table.
 * 
 */
@Entity
@Table(name="visibilite_module_incoterm")
@NamedQuery(name="VisibiliteModuleIncoterm.findAll", query="SELECT v FROM VisibiliteModuleIncoterm v")
public class VisibiliteModuleIncoterm implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteModuleIncotermPK id;

	//bi-directional many-to-one association to DbaIncoterm
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private DbaIncoterm dbaIncoterm;

	public VisibiliteModuleIncoterm() {
	}

	public VisibiliteModuleIncotermPK getId() {
		return this.id;
	}

	public void setId(VisibiliteModuleIncotermPK id) {
		this.id = id;
	}

	public DbaIncoterm getDbaIncoterm() {
		return this.dbaIncoterm;
	}

	public void setDbaIncoterm(DbaIncoterm dbaIncoterm) {
		this.dbaIncoterm = dbaIncoterm;
	}

}