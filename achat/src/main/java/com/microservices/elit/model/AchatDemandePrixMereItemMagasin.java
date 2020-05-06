package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the achat_demande_prix_mere_item_magasin database table.
 * 
 */
@Entity
@Table(name="achat_demande_prix_mere_item_magasin")
@NamedQuery(name="AchatDemandePrixMereItemMagasin.findAll", query="SELECT a FROM AchatDemandePrixMereItemMagasin a")
public class AchatDemandePrixMereItemMagasin implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AchatDemandePrixMereItemMagasinPK id;

	//bi-directional many-to-one association to AchatDemandePrixMereItem
	@ManyToOne
	@JoinColumn(name="id_demande_prix_item", insertable=false, updatable=false)
	private AchatDemandePrixMereItem achatDemandePrixMereItem;

	public AchatDemandePrixMereItemMagasin() {
	}

	public AchatDemandePrixMereItemMagasinPK getId() {
		return this.id;
	}

	public void setId(AchatDemandePrixMereItemMagasinPK id) {
		this.id = id;
	}

	public AchatDemandePrixMereItem getAchatDemandePrixMereItem() {
		return this.achatDemandePrixMereItem;
	}

	public void setAchatDemandePrixMereItem(AchatDemandePrixMereItem achatDemandePrixMereItem) {
		this.achatDemandePrixMereItem = achatDemandePrixMereItem;
	}

}