package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the achat_engagement_item_centre_charge database table.
 * 
 */
@Entity
@Table(name="achat_engagement_item_centre_charge")
@NamedQuery(name="AchatEngagementItemCentreCharge.findAll", query="SELECT a FROM AchatEngagementItemCentreCharge a")
public class AchatEngagementItemCentreCharge implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AchatEngagementItemCentreChargePK id;

	//bi-directional many-to-one association to AchatEngagementItem
	@ManyToOne
	@JoinColumn(name="id_engagement_item", insertable=false, updatable=false)
	private AchatEngagementItem achatEngagementItem;

	public AchatEngagementItemCentreCharge() {
	}

	public AchatEngagementItemCentreChargePK getId() {
		return this.id;
	}

	public void setId(AchatEngagementItemCentreChargePK id) {
		this.id = id;
	}

	public AchatEngagementItem getAchatEngagementItem() {
		return this.achatEngagementItem;
	}

	public void setAchatEngagementItem(AchatEngagementItem achatEngagementItem) {
		this.achatEngagementItem = achatEngagementItem;
	}

}