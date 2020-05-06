package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the achat_engagement_item_facture_frais_item database table.
 * 
 */
@Entity
@Table(name="achat_engagement_item_facture_frais_item")
@NamedQuery(name="AchatEngagementItemFactureFraisItem.findAll", query="SELECT a FROM AchatEngagementItemFactureFraisItem a")
public class AchatEngagementItemFactureFraisItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AchatEngagementItemFactureFraisItemPK id;

	//bi-directional many-to-one association to AchatEngagementItem
	@ManyToOne
	@JoinColumn(name="id_engagement_item", insertable=false, updatable=false)
	private AchatEngagementItem achatEngagementItem;

	public AchatEngagementItemFactureFraisItem() {
	}

	public AchatEngagementItemFactureFraisItemPK getId() {
		return this.id;
	}

	public void setId(AchatEngagementItemFactureFraisItemPK id) {
		this.id = id;
	}

	public AchatEngagementItem getAchatEngagementItem() {
		return this.achatEngagementItem;
	}

	public void setAchatEngagementItem(AchatEngagementItem achatEngagementItem) {
		this.achatEngagementItem = achatEngagementItem;
	}

}