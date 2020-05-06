package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the achat_arrivage_item_facture_frais_item database table.
 * 
 */
@Entity
@Table(name="achat_arrivage_item_facture_frais_item")
@NamedQuery(name="AchatArrivageItemFactureFraisItem.findAll", query="SELECT a FROM AchatArrivageItemFactureFraisItem a")
public class AchatArrivageItemFactureFraisItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AchatArrivageItemFactureFraisItemPK id;

	//bi-directional many-to-one association to AchatArrivageItem
	@ManyToOne
	@JoinColumn(name="id_arrivage_item", insertable=false, updatable=false)
	private AchatArrivageItem achatArrivageItem;

	public AchatArrivageItemFactureFraisItem() {
	}

	public AchatArrivageItemFactureFraisItemPK getId() {
		return this.id;
	}

	public void setId(AchatArrivageItemFactureFraisItemPK id) {
		this.id = id;
	}

	public AchatArrivageItem getAchatArrivageItem() {
		return this.achatArrivageItem;
	}

	public void setAchatArrivageItem(AchatArrivageItem achatArrivageItem) {
		this.achatArrivageItem = achatArrivageItem;
	}

}