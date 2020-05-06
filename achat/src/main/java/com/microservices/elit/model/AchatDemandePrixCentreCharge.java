package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the achat_demande_prix_centre_charge database table.
 * 
 */
@Entity
@Table(name="achat_demande_prix_centre_charge")
@NamedQuery(name="AchatDemandePrixCentreCharge.findAll", query="SELECT a FROM AchatDemandePrixCentreCharge a")
public class AchatDemandePrixCentreCharge implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AchatDemandePrixCentreChargePK id;

	//bi-directional many-to-one association to AchatDemandePrixMere
	@ManyToOne
	@JoinColumn(name="id_demande_prix", insertable=false, updatable=false)
	private AchatDemandePrixMere achatDemandePrixMere;

	public AchatDemandePrixCentreCharge() {
	}

	public AchatDemandePrixCentreChargePK getId() {
		return this.id;
	}

	public void setId(AchatDemandePrixCentreChargePK id) {
		this.id = id;
	}

	public AchatDemandePrixMere getAchatDemandePrixMere() {
		return this.achatDemandePrixMere;
	}

	public void setAchatDemandePrixMere(AchatDemandePrixMere achatDemandePrixMere) {
		this.achatDemandePrixMere = achatDemandePrixMere;
	}

}