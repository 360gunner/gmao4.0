package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_unite_demande_prix_mere database table.
 * 
 */
@Entity
@Table(name="visibilite_unite_demande_prix_mere")
@NamedQuery(name="VisibiliteUniteDemandePrixMere.findAll", query="SELECT v FROM VisibiliteUniteDemandePrixMere v")
public class VisibiliteUniteDemandePrixMere implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteUniteDemandePrixMerePK id;

	//bi-directional many-to-one association to AchatDemandePrixMere
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private AchatDemandePrixMere achatDemandePrixMere;

	public VisibiliteUniteDemandePrixMere() {
	}

	public VisibiliteUniteDemandePrixMerePK getId() {
		return this.id;
	}

	public void setId(VisibiliteUniteDemandePrixMerePK id) {
		this.id = id;
	}

	public AchatDemandePrixMere getAchatDemandePrixMere() {
		return this.achatDemandePrixMere;
	}

	public void setAchatDemandePrixMere(AchatDemandePrixMere achatDemandePrixMere) {
		this.achatDemandePrixMere = achatDemandePrixMere;
	}

}