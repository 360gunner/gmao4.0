package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the achat_livraison_item_facture_frais_item database table.
 * 
 */
@Entity
@Table(name="achat_livraison_item_facture_frais_item")
@NamedQuery(name="AchatLivraisonItemFactureFraisItem.findAll", query="SELECT a FROM AchatLivraisonItemFactureFraisItem a")
public class AchatLivraisonItemFactureFraisItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AchatLivraisonItemFactureFraisItemPK id;

	//bi-directional many-to-one association to AchatLivraisonItem
	@ManyToOne
	@JoinColumn(name="id_livraison_item", insertable=false, updatable=false)
	private AchatLivraisonItem achatLivraisonItem;

	public AchatLivraisonItemFactureFraisItem() {
	}

	public AchatLivraisonItemFactureFraisItemPK getId() {
		return this.id;
	}

	public void setId(AchatLivraisonItemFactureFraisItemPK id) {
		this.id = id;
	}

	public AchatLivraisonItem getAchatLivraisonItem() {
		return this.achatLivraisonItem;
	}

	public void setAchatLivraisonItem(AchatLivraisonItem achatLivraisonItem) {
		this.achatLivraisonItem = achatLivraisonItem;
	}

}