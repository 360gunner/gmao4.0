package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_demande_prix_fille_item_magasin database table.
 * 
 */
@Embeddable
public class AchatDemandePrixFilleItemMagasinPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_demande_prix_fille_item", insertable=false, updatable=false)
	private Long idDemandePrixFilleItem;

	@Column(name="id_magasin")
	private Long idMagasin;

	public AchatDemandePrixFilleItemMagasinPK() {
	}
	public Long getIdDemandePrixFilleItem() {
		return this.idDemandePrixFilleItem;
	}
	public void setIdDemandePrixFilleItem(Long idDemandePrixFilleItem) {
		this.idDemandePrixFilleItem = idDemandePrixFilleItem;
	}
	public Long getIdMagasin() {
		return this.idMagasin;
	}
	public void setIdMagasin(Long idMagasin) {
		this.idMagasin = idMagasin;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AchatDemandePrixFilleItemMagasinPK)) {
			return false;
		}
		AchatDemandePrixFilleItemMagasinPK castOther = (AchatDemandePrixFilleItemMagasinPK)other;
		return 
			this.idDemandePrixFilleItem.equals(castOther.idDemandePrixFilleItem)
			&& this.idMagasin.equals(castOther.idMagasin);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idDemandePrixFilleItem.hashCode();
		hash = hash * prime + this.idMagasin.hashCode();
		
		return hash;
	}
}