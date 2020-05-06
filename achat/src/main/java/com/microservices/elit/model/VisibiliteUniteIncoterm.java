package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_unite_incoterm database table.
 * 
 */
@Entity
@Table(name="visibilite_unite_incoterm")
@NamedQuery(name="VisibiliteUniteIncoterm.findAll", query="SELECT v FROM VisibiliteUniteIncoterm v")
public class VisibiliteUniteIncoterm implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteUniteIncotermPK id;

	//bi-directional many-to-one association to DbaIncoterm
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private DbaIncoterm dbaIncoterm;

	public VisibiliteUniteIncoterm() {
	}

	public VisibiliteUniteIncotermPK getId() {
		return this.id;
	}

	public void setId(VisibiliteUniteIncotermPK id) {
		this.id = id;
	}

	public DbaIncoterm getDbaIncoterm() {
		return this.dbaIncoterm;
	}

	public void setDbaIncoterm(DbaIncoterm dbaIncoterm) {
		this.dbaIncoterm = dbaIncoterm;
	}

}