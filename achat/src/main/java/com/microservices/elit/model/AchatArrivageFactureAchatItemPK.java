package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_arrivage_facture_achat_item database table.
 * 
 */
@Embeddable
public class AchatArrivageFactureAchatItemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_arrivage", insertable=false, updatable=false)
	private Long idArrivage;

	@Column(name="id_facture_achat_item", insertable=false, updatable=false)
	private Long idFactureAchatItem;

	public AchatArrivageFactureAchatItemPK() {
	}
	public Long getIdArrivage() {
		return this.idArrivage;
	}
	public void setIdArrivage(Long idArrivage) {
		this.idArrivage = idArrivage;
	}
	public Long getIdFactureAchatItem() {
		return this.idFactureAchatItem;
	}
	public void setIdFactureAchatItem(Long idFactureAchatItem) {
		this.idFactureAchatItem = idFactureAchatItem;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AchatArrivageFactureAchatItemPK)) {
			return false;
		}
		AchatArrivageFactureAchatItemPK castOther = (AchatArrivageFactureAchatItemPK)other;
		return 
			this.idArrivage.equals(castOther.idArrivage)
			&& this.idFactureAchatItem.equals(castOther.idFactureAchatItem);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idArrivage.hashCode();
		hash = hash * prime + this.idFactureAchatItem.hashCode();
		
		return hash;
	}
}