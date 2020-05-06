package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the achat_demande_prix_fille_centre_charge database table.
 * 
 */
@Entity
@Table(name="achat_demande_prix_fille_centre_charge")
@NamedQuery(name="AchatDemandePrixFilleCentreCharge.findAll", query="SELECT a FROM AchatDemandePrixFilleCentreCharge a")
public class AchatDemandePrixFilleCentreCharge implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AchatDemandePrixFilleCentreChargePK id;

	//bi-directional many-to-one association to AchatDemandePrixFille
	@ManyToOne
	@JoinColumn(name="id_demande_prix_fille", insertable=false, updatable=false)
	private AchatDemandePrixFille achatDemandePrixFille;

	public AchatDemandePrixFilleCentreCharge() {
	}

	public AchatDemandePrixFilleCentreChargePK getId() {
		return this.id;
	}

	public void setId(AchatDemandePrixFilleCentreChargePK id) {
		this.id = id;
	}

	public AchatDemandePrixFille getAchatDemandePrixFille() {
		return this.achatDemandePrixFille;
	}

	public void setAchatDemandePrixFille(AchatDemandePrixFille achatDemandePrixFille) {
		this.achatDemandePrixFille = achatDemandePrixFille;
	}

}