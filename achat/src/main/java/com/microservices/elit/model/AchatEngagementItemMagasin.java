package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the achat_engagement_item_magasin database table.
 * 
 */
@Entity
@Table(name="achat_engagement_item_magasin")
@NamedQuery(name="AchatEngagementItemMagasin.findAll", query="SELECT a FROM AchatEngagementItemMagasin a")
public class AchatEngagementItemMagasin implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AchatEngagementItemMagasinPK id;

	//bi-directional many-to-one association to AchatEngagementItem
	@ManyToOne
	@JoinColumn(name="id_engagement_item", insertable=false, updatable=false)
	private AchatEngagementItem achatEngagementItem;

	public AchatEngagementItemMagasin() {
	}

	public AchatEngagementItemMagasinPK getId() {
		return this.id;
	}

	public void setId(AchatEngagementItemMagasinPK id) {
		this.id = id;
	}

	public AchatEngagementItem getAchatEngagementItem() {
		return this.achatEngagementItem;
	}

	public void setAchatEngagementItem(AchatEngagementItem achatEngagementItem) {
		this.achatEngagementItem = achatEngagementItem;
	}

}