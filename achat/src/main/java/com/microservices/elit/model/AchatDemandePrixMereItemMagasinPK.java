package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_demande_prix_mere_item_magasin database table.
 * 
 */
@Embeddable
public class AchatDemandePrixMereItemMagasinPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_demande_prix_item", insertable=false, updatable=false)
	private Long idDemandePrixItem;

	@Column(name="id_magasin")
	private Long idMagasin;

	public AchatDemandePrixMereItemMagasinPK() {
	}
	public Long getIdDemandePrixItem() {
		return this.idDemandePrixItem;
	}
	public void setIdDemandePrixItem(Long idDemandePrixItem) {
		this.idDemandePrixItem = idDemandePrixItem;
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
		if (!(other instanceof AchatDemandePrixMereItemMagasinPK)) {
			return false;
		}
		AchatDemandePrixMereItemMagasinPK castOther = (AchatDemandePrixMereItemMagasinPK)other;
		return 
			this.idDemandePrixItem.equals(castOther.idDemandePrixItem)
			&& this.idMagasin.equals(castOther.idMagasin);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idDemandePrixItem.hashCode();
		hash = hash * prime + this.idMagasin.hashCode();
		
		return hash;
	}
}