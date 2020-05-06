package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the achat_demande_prix_magasin database table.
 * 
 */
@Entity
@Table(name="achat_demande_prix_magasin")
@NamedQuery(name="AchatDemandePrixMagasin.findAll", query="SELECT a FROM AchatDemandePrixMagasin a")
public class AchatDemandePrixMagasin implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AchatDemandePrixMagasinPK id;

	//bi-directional many-to-one association to AchatDemandePrixMere
	@ManyToOne
	@JoinColumn(name="id_demande_prix", insertable=false, updatable=false)
	private AchatDemandePrixMere achatDemandePrixMere;

	public AchatDemandePrixMagasin() {
	}

	public AchatDemandePrixMagasinPK getId() {
		return this.id;
	}

	public void setId(AchatDemandePrixMagasinPK id) {
		this.id = id;
	}

	public AchatDemandePrixMere getAchatDemandePrixMere() {
		return this.achatDemandePrixMere;
	}

	public void setAchatDemandePrixMere(AchatDemandePrixMere achatDemandePrixMere) {
		this.achatDemandePrixMere = achatDemandePrixMere;
	}

}