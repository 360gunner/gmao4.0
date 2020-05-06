package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the achat_demande_prix_fille_item_magasin database table.
 * 
 */
@Entity
@Table(name="achat_demande_prix_fille_item_magasin")
@NamedQuery(name="AchatDemandePrixFilleItemMagasin.findAll", query="SELECT a FROM AchatDemandePrixFilleItemMagasin a")
public class AchatDemandePrixFilleItemMagasin implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AchatDemandePrixFilleItemMagasinPK id;

	//bi-directional many-to-one association to AchatDemandePrixFilleItem
	@ManyToOne
	@JoinColumn(name="id_demande_prix_fille_item", insertable=false, updatable=false)
	private AchatDemandePrixFilleItem achatDemandePrixFilleItem;

	public AchatDemandePrixFilleItemMagasin() {
	}

	public AchatDemandePrixFilleItemMagasinPK getId() {
		return this.id;
	}

	public void setId(AchatDemandePrixFilleItemMagasinPK id) {
		this.id = id;
	}

	public AchatDemandePrixFilleItem getAchatDemandePrixFilleItem() {
		return this.achatDemandePrixFilleItem;
	}

	public void setAchatDemandePrixFilleItem(AchatDemandePrixFilleItem achatDemandePrixFilleItem) {
		this.achatDemandePrixFilleItem = achatDemandePrixFilleItem;
	}

}