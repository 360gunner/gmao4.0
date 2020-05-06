package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_profil_incoterm database table.
 * 
 */
@Entity
@Table(name="visibilite_profil_incoterm")
@NamedQuery(name="VisibiliteProfilIncoterm.findAll", query="SELECT v FROM VisibiliteProfilIncoterm v")
public class VisibiliteProfilIncoterm implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteProfilIncotermPK id;

	//bi-directional many-to-one association to DbaIncoterm
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private DbaIncoterm dbaIncoterm;

	public VisibiliteProfilIncoterm() {
	}

	public VisibiliteProfilIncotermPK getId() {
		return this.id;
	}

	public void setId(VisibiliteProfilIncotermPK id) {
		this.id = id;
	}

	public DbaIncoterm getDbaIncoterm() {
		return this.dbaIncoterm;
	}

	public void setDbaIncoterm(DbaIncoterm dbaIncoterm) {
		this.dbaIncoterm = dbaIncoterm;
	}

}