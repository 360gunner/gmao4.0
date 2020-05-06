package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_module_demande_prix_mere database table.
 * 
 */
@Entity
@Table(name="visibilite_module_demande_prix_mere")
@NamedQuery(name="VisibiliteModuleDemandePrixMere.findAll", query="SELECT v FROM VisibiliteModuleDemandePrixMere v")
public class VisibiliteModuleDemandePrixMere implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteModuleDemandePrixMerePK id;

	//bi-directional many-to-one association to AchatDemandePrixMere
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private AchatDemandePrixMere achatDemandePrixMere;

	public VisibiliteModuleDemandePrixMere() {
	}

	public VisibiliteModuleDemandePrixMerePK getId() {
		return this.id;
	}

	public void setId(VisibiliteModuleDemandePrixMerePK id) {
		this.id = id;
	}

	public AchatDemandePrixMere getAchatDemandePrixMere() {
		return this.achatDemandePrixMere;
	}

	public void setAchatDemandePrixMere(AchatDemandePrixMere achatDemandePrixMere) {
		this.achatDemandePrixMere = achatDemandePrixMere;
	}

}