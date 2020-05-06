package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the achat_demande_prix_fournisseur database table.
 * 
 */
@Entity
@Table(name="achat_demande_prix_fournisseur")
@NamedQuery(name="AchatDemandePrixFournisseur.findAll", query="SELECT a FROM AchatDemandePrixFournisseur a")
public class AchatDemandePrixFournisseur implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AchatDemandePrixFournisseurPK id;

	//bi-directional many-to-one association to AchatDemandePrixMere
	@ManyToOne
	@JoinColumn(name="id_demande_prix", insertable=false, updatable=false)
	private AchatDemandePrixMere achatDemandePrixMere;

	public AchatDemandePrixFournisseur() {
	}

	public AchatDemandePrixFournisseurPK getId() {
		return this.id;
	}

	public void setId(AchatDemandePrixFournisseurPK id) {
		this.id = id;
	}

	public AchatDemandePrixMere getAchatDemandePrixMere() {
		return this.achatDemandePrixMere;
	}

	public void setAchatDemandePrixMere(AchatDemandePrixMere achatDemandePrixMere) {
		this.achatDemandePrixMere = achatDemandePrixMere;
	}

}