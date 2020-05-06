package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_profil_demande_prix_mere database table.
 * 
 */
@Entity
@Table(name="visibilite_profil_demande_prix_mere")
@NamedQuery(name="VisibiliteProfilDemandePrixMere.findAll", query="SELECT v FROM VisibiliteProfilDemandePrixMere v")
public class VisibiliteProfilDemandePrixMere implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteProfilDemandePrixMerePK id;

	//bi-directional many-to-one association to AchatDemandePrixMere
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private AchatDemandePrixMere achatDemandePrixMere;

	public VisibiliteProfilDemandePrixMere() {
	}

	public VisibiliteProfilDemandePrixMerePK getId() {
		return this.id;
	}

	public void setId(VisibiliteProfilDemandePrixMerePK id) {
		this.id = id;
	}

	public AchatDemandePrixMere getAchatDemandePrixMere() {
		return this.achatDemandePrixMere;
	}

	public void setAchatDemandePrixMere(AchatDemandePrixMere achatDemandePrixMere) {
		this.achatDemandePrixMere = achatDemandePrixMere;
	}

}