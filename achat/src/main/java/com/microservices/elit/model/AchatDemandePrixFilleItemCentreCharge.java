package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the achat_demande_prix_fille_item_centre_charge database table.
 * 
 */
@Entity
@Table(name="achat_demande_prix_fille_item_centre_charge")
@NamedQuery(name="AchatDemandePrixFilleItemCentreCharge.findAll", query="SELECT a FROM AchatDemandePrixFilleItemCentreCharge a")
public class AchatDemandePrixFilleItemCentreCharge implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AchatDemandePrixFilleItemCentreChargePK id;

	//bi-directional many-to-one association to AchatDemandePrixFilleItem
	@ManyToOne
	@JoinColumn(name="id_demande_prix_fille_item", insertable=false, updatable=false)
	private AchatDemandePrixFilleItem achatDemandePrixFilleItem;

	public AchatDemandePrixFilleItemCentreCharge() {
	}

	public AchatDemandePrixFilleItemCentreChargePK getId() {
		return this.id;
	}

	public void setId(AchatDemandePrixFilleItemCentreChargePK id) {
		this.id = id;
	}

	public AchatDemandePrixFilleItem getAchatDemandePrixFilleItem() {
		return this.achatDemandePrixFilleItem;
	}

	public void setAchatDemandePrixFilleItem(AchatDemandePrixFilleItem achatDemandePrixFilleItem) {
		this.achatDemandePrixFilleItem = achatDemandePrixFilleItem;
	}

}