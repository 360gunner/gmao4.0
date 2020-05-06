package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the achat_demande_prix_mere_item_centre_charge database table.
 * 
 */
@Entity
@Table(name="achat_demande_prix_mere_item_centre_charge")
@NamedQuery(name="AchatDemandePrixMereItemCentreCharge.findAll", query="SELECT a FROM AchatDemandePrixMereItemCentreCharge a")
public class AchatDemandePrixMereItemCentreCharge implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AchatDemandePrixMereItemCentreChargePK id;

	//bi-directional many-to-one association to AchatDemandePrixMereItem
	@ManyToOne
	@JoinColumn(name="id_demande_prix_item", insertable=false, updatable=false)
	private AchatDemandePrixMereItem achatDemandePrixMereItem;

	public AchatDemandePrixMereItemCentreCharge() {
	}

	public AchatDemandePrixMereItemCentreChargePK getId() {
		return this.id;
	}

	public void setId(AchatDemandePrixMereItemCentreChargePK id) {
		this.id = id;
	}

	public AchatDemandePrixMereItem getAchatDemandePrixMereItem() {
		return this.achatDemandePrixMereItem;
	}

	public void setAchatDemandePrixMereItem(AchatDemandePrixMereItem achatDemandePrixMereItem) {
		this.achatDemandePrixMereItem = achatDemandePrixMereItem;
	}

}