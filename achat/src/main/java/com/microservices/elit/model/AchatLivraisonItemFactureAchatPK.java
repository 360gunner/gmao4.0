package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_livraison_item_facture_achat database table.
 * 
 */
@Embeddable
public class AchatLivraisonItemFactureAchatPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_facture_achat_item", insertable=false, updatable=false)
	private Long idFactureAchatItem;

	@Column(name="id_livraison", insertable=false, updatable=false)
	private Long idLivraison;

	public AchatLivraisonItemFactureAchatPK() {
	}
	public Long getIdFactureAchatItem() {
		return this.idFactureAchatItem;
	}
	public void setIdFactureAchatItem(Long idFactureAchatItem) {
		this.idFactureAchatItem = idFactureAchatItem;
	}
	public Long getIdLivraison() {
		return this.idLivraison;
	}
	public void setIdLivraison(Long idLivraison) {
		this.idLivraison = idLivraison;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AchatLivraisonItemFactureAchatPK)) {
			return false;
		}
		AchatLivraisonItemFactureAchatPK castOther = (AchatLivraisonItemFactureAchatPK)other;
		return 
			this.idFactureAchatItem.equals(castOther.idFactureAchatItem)
			&& this.idLivraison.equals(castOther.idLivraison);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idFactureAchatItem.hashCode();
		hash = hash * prime + this.idLivraison.hashCode();
		
		return hash;
	}
}