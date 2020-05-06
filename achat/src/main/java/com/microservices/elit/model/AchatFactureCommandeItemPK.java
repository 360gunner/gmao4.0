package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_facture_commande_item database table.
 * 
 */
@Embeddable
public class AchatFactureCommandeItemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_commande_item", insertable=false, updatable=false)
	private Long idCommandeItem;

	@Column(name="id_facture", insertable=false, updatable=false)
	private Long idFacture;

	public AchatFactureCommandeItemPK() {
	}
	public Long getIdCommandeItem() {
		return this.idCommandeItem;
	}
	public void setIdCommandeItem(Long idCommandeItem) {
		this.idCommandeItem = idCommandeItem;
	}
	public Long getIdFacture() {
		return this.idFacture;
	}
	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AchatFactureCommandeItemPK)) {
			return false;
		}
		AchatFactureCommandeItemPK castOther = (AchatFactureCommandeItemPK)other;
		return 
			this.idCommandeItem.equals(castOther.idCommandeItem)
			&& this.idFacture.equals(castOther.idFacture);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idCommandeItem.hashCode();
		hash = hash * prime + this.idFacture.hashCode();
		
		return hash;
	}
}